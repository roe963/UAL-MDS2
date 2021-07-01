package basededatos;

import java.util.Arrays;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Pedidos_entregados {
    public BDPrincipal _bdprincipal_pedidos_entregados;
    public Vector<Pedido_entregado> _contiene_pedido_entregado = new Vector<Pedido_entregado>();

    public Pedido[] cargar_pedidos_entregados(int aIdEmpresaTransportes) {
        PersistentTransaction t;
        Pedido_entregado[] arrayPedido = null;
        try {
            t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
            try {
                Pedido_entregado[] arrayPedidoEntregado = Pedido_entregadoDAO.listPedido_entregadoByQuery(null, null);
                arrayPedido = Arrays.stream(arrayPedidoEntregado)
                        .filter(p -> p.getEntregado_por().getId() == aIdEmpresaTransportes)
                        .toArray(basededatos.Pedido_entregado[]::new);

                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return arrayPedido;
    }
    
    public Pedido[] cargar_pedidos_entregados() {
        PersistentTransaction t;
        Pedido_entregado[] arrayPedido = null;
        try {
            t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
            try {
                arrayPedido = Pedido_entregadoDAO.listPedido_entregadoByQuery(null, null);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return arrayPedido;
    }

    public void agregar_enviado_entregado(int aIdPedido) {
        System.out.println("llegue");
        PersistentTransaction t;
        try {
            t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
            try {
                Pedido_enviado enviado = Pedido_enviadoDAO.getPedido_enviadoByORMID(aIdPedido);
                Pedido_entregado entregado = Pedido_entregadoDAO.createPedido_entregado();

                entregado.setFecha(enviado.getFecha());
                entregado.setEntregado_por(enviado.getAsignado_a());
                entregado.setPrecio(enviado.getPrecio());
                entregado.setRealizado_por(enviado.getRealizado_por());
                if (Pedido_entregadoDAO.save(entregado)) {
                    System.out.println("agreged");
                } else {
                    System.out.println("not agreged");
                }

                Cantidad[] cantidades = enviado.contiene_un.toArray();

                for (Cantidad c : cantidades) {
                    c.setContenido_en(entregado);
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

    public Pedido_entregado[] cargar_pedidos_entregados_cliente_registrado(int aIdUsuario) {
        PersistentTransaction t;
        Pedido_entregado[] arrayPedido = null;
        try {
            t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
            try {
                Pedido_entregado[] arrayPedidoEntregado = Pedido_entregadoDAO.listPedido_entregadoByQuery(null, null);
                arrayPedido = Arrays.stream(arrayPedidoEntregado)
                        .filter(p -> p.getRealizado_por().getId() == aIdUsuario)
                        .toArray(basededatos.Pedido_entregado[]::new);

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