package bds;

import java.util.Arrays;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Cantidad;
import basededatos.CantidadDAO;
import basededatos.Cliente;
import basededatos.ClienteDAO;
import basededatos.Pedido;
import basededatos.PedidoDAO;
import basededatos.Pedido_enviado;
import basededatos.Pedido_enviadoDAO;
import basededatos.Pedido_pendiente;
import basededatos.Pedido_pendienteDAO;
import ual.mds2.ortegaortega.Session;

public class Pedidos_pendientes {
    public BDPrincipal _bdprincipal_pedidos_pendientes;
    public Vector<Pedido_pendiente> _contiene_pedido_pendiente = new Vector<Pedido_pendiente>();

    public Pedido[] cargar_pedidos_pendientes() {
        PersistentTransaction t;
        Pedido_pendiente[] arrayPedido = null;
        try {
            t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
            try {
                arrayPedido = Pedido_pendienteDAO.listPedido_pendienteByQuery(null, null);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return arrayPedido;
    }

    public void eliminar_pendiente_enviado(int aIdPedido) {
        PersistentTransaction t;
        try {
            t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
            try {
                Pedido_pendiente pedido = Pedido_pendienteDAO.getPedido_pendienteByORMID(aIdPedido);
                Pedido_pendienteDAO.deleteAndDissociate(pedido);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void realizar_pedido(Cantidad[] aCantidades, Cliente aCliente) {
        PersistentTransaction t;

        try {
            t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
            try {
                Pedido_pendiente pedido = Pedido_pendienteDAO.createPedido_pendiente();
                pedido.setFecha(System.currentTimeMillis());
                pedido.setPrecio((float) Session.calcularPrecioTotalCarrito());
                pedido.setRealizado_por(aCliente);
                PedidoDAO.save(pedido);
                Pedido_pendienteDAO.save(pedido);

                for (Cantidad c : aCantidades) {
                    c.setContenido_en(pedido);
                    CantidadDAO.save(c);
                }

                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    public boolean cancelar_compra(int aIdPedido) {
        throw new UnsupportedOperationException();
    }

    public Pedido_pendiente[] cargar_pedidos_pendientes_cliente_registrado(int aIdUsuario) {
        PersistentTransaction t;
        Pedido_pendiente[] arrayPedido = null;
        try {
            t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
            try {
                Pedido_pendiente[] arrayPedidoPendiente = Pedido_pendienteDAO.listPedido_pendienteByQuery(null, null);
                arrayPedido = Arrays.stream(arrayPedidoPendiente)
                        .filter(p -> p.getRealizado_por().getId() == aIdUsuario)
                        .toArray(basededatos.Pedido_pendiente[]::new);

                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return arrayPedido;
    }
}