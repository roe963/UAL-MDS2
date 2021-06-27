package bds;

import java.util.Arrays;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Pedido;
import basededatos.Pedido_enviado;
import basededatos.Pedido_enviadoDAO;
import basededatos.Pedido_pendiente;
import basededatos.Pedido_pendienteDAO;

public class Pedidos_enviados {
	public BDPrincipal _bdprincipal_pedidos_enviados;
	public Vector<Pedido_enviado> _contiene_pedido_enviado = new Vector<Pedido_enviado>();

	public Pedido[] cargar_pedidos_enviados(int aIdEmpresaTransportes) {
		throw new UnsupportedOperationException();
	}

	public void agregar_pendiente_enviado(int aIdPedido, int aIdEmpresaTransportes) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_enviado_entregado(int aIdPedido) {
		throw new UnsupportedOperationException();
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