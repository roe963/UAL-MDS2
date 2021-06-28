package bds;

import java.util.Arrays;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Cantidad;
import basededatos.CantidadDAO;
import basededatos.Empresa_transportes;
import basededatos.Empresa_transportesDAO;
import basededatos.Pedido;
import basededatos.PedidoDAO;
import basededatos.Pedido_entregado;
import basededatos.Pedido_entregadoDAO;
import basededatos.Pedido_enviado;
import basededatos.Pedido_enviadoDAO;
import basededatos.Pedido_pendiente;
import basededatos.Pedido_pendienteDAO;

public class Pedidos_enviados {
	public BDPrincipal _bdprincipal_pedidos_enviados;
	public Vector<Pedido_enviado> _contiene_pedido_enviado = new Vector<Pedido_enviado>();

	public Pedido[] cargar_pedidos_enviados(int aIdEmpresaTransportes) {
	    PersistentTransaction t;
        Pedido_enviado[] arrayPedido = null;
        try {
            t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
            try {
                Pedido_enviado[] arrayPedidoEnviado = Pedido_enviadoDAO.listPedido_enviadoByQuery(null, null);
                arrayPedido = Arrays.stream(arrayPedidoEnviado)
                        .filter(p -> p.getAsignado_a().getId() == aIdEmpresaTransportes)
                        .toArray(basededatos.Pedido_enviado[]::new);

                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return arrayPedido;
	}

	public void agregar_pendiente_enviado(int aIdPedido, int aIdEmpresaTransportes) {
	    System.out.println("llegue");
        PersistentTransaction t;
        try {
            t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
            try {
                Pedido_pendiente pendiente = Pedido_pendienteDAO.getPedido_pendienteByORMID(aIdPedido);
                Pedido_enviado enviado = Pedido_enviadoDAO.createPedido_enviado();
                Empresa_transportes tranportes = Empresa_transportesDAO.getEmpresa_transportesByORMID(aIdEmpresaTransportes);

                enviado.setFecha(pendiente.getFecha());
                enviado.setAsignado_a(tranportes);
                enviado.setPrecio(pendiente.getPrecio());
                enviado.setRealizado_por(pendiente.getRealizado_por());
                if (Pedido_enviadoDAO.save(enviado)) {
                    System.out.println("agreged");
                } else {
                    System.out.println("not agreged");
                }

                Cantidad[] cantidades = pendiente.contiene_un.toArray();

                for (Cantidad c : cantidades) {
                    c.setContenido_en(enviado);
                    if (CantidadDAO.save(c)) {
                        System.out.println("cantidad cambiada");
                    }
                }

                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
	}

	public void eliminar_enviado_entregado(int aIdPedido) {
	    PersistentTransaction t;
        try {
            t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
            try {
                Pedido_enviado pedido = Pedido_enviadoDAO.getPedido_enviadoByORMID(aIdPedido);
                Pedido_enviadoDAO.deleteAndDissociate(pedido);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
	}

	public Pedido[] cargar_pedidos_enviados() {
	    PersistentTransaction t;
        Pedido_enviado[] arrayPedido = null;
        try {
            t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
            try {
                arrayPedido = Pedido_enviadoDAO.listPedido_enviadoByQuery(null, null);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return arrayPedido;
	}

	public Pedido_enviado[] cargar_pedidos_enviados_cliente_registrado(int aIdUsuario) {
	    PersistentTransaction t;
	    Pedido_enviado[] arrayPedido = null;
        try {
            t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
            try {
                Pedido_enviado[] arrayPedidoEnviado = Pedido_enviadoDAO.listPedido_enviadoByQuery(null, null);
                arrayPedido = Arrays.stream(arrayPedidoEnviado)
                        .filter(p -> p.getRealizado_por().getId() == aIdUsuario)
                        .toArray(basededatos.Pedido_enviado[]::new);

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