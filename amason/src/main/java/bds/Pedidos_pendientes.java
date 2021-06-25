package bds;

import java.util.Arrays;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Cantidad;
import basededatos.Cliente;
import basededatos.ClienteDAO;
import basededatos.Pedido;
import basededatos.Pedido_pendiente;
import basededatos.Pedido_pendienteDAO;

public class Pedidos_pendientes {
    public BDPrincipal _bdprincipal_pedidos_pendientes;
    public Vector<Pedido_pendiente> _contiene_pedido_pendiente = new Vector<Pedido_pendiente>();

    public Pedido[] cargar_pedidos_pendientes() {
        throw new UnsupportedOperationException();
    }

    public void eliminar_pendiente_enviado(int aIdPedido) {
        throw new UnsupportedOperationException();
    }

    public void realizar_pedido(Cantidad[] aCantidades, Cliente aCliente) throws PersistentException {
        PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession()
                .beginTransaction();

        try {
            Pedido_pendiente pedidoPendiente = Pedido_pendienteDAO.createPedido_pendiente();
            Cliente cliente = ClienteDAO.getClienteByORMID(aCliente.getId());

            for (int i = 0; i < aCantidades.length; i++) {

                double precio = aCantidades[i].getContiene_un().getPrecio();
                double cantidad = aCantidades[i].getCantidad();
                float total = (float) precio * (float) cantidad;

                pedidoPendiente.setPrecio(total);
                pedidoPendiente.setORM_Realizado_por(cliente);

                pedidoPendiente.contiene_un.add(aCantidades[i]);

                Pedido_pendienteDAO.save(pedidoPendiente);
            }

            t.commit();
        } catch (PersistentException e) {
            t.rollback();
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