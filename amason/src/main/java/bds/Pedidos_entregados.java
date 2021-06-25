package bds;

import java.util.Arrays;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Pedido;
import basededatos.Pedido_entregado;
import basededatos.Pedido_entregadoDAO;

public class Pedidos_entregados {
    public BDPrincipal _bdprincipal_pedidos_entregados;
    public Vector<Pedido_entregado> _contiene_pedido_entregado = new Vector<Pedido_entregado>();

    public Pedido[] cargar_pedidos_entregados() {
        throw new UnsupportedOperationException();
    }

    public void agregar_enviado_entregado(int aIdPedido) {
        throw new UnsupportedOperationException();
    }

    public Pedido_entregado[] cargar_pedidos_entregados_cliente_registrado(int aIdUsuario) {
        PersistentTransaction t;
        Pedido_entregado[] arrayPedido = null;
        try {
            t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
            try {
                Pedido_entregado[] arrayPedidoEntregado = Pedido_entregadoDAO.listPedido_entregadoByQuery(null, null);
                arrayPedido = Arrays.stream(arrayPedidoEntregado).filter(p -> p.getRealizado_por().getId() == aIdUsuario)
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