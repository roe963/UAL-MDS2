package bds;

import java.util.ArrayList;
import java.util.List;
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
		throw new UnsupportedOperationException();
	}

	public Pedido_enviado[] cargar_pedidos_enviados_cliente_registrado(int aIdUsuario)throws PersistentException  {
		PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession()
				.beginTransaction();

		List<Pedido_enviado> listaPedidoEnviado = new ArrayList<Pedido_enviado>();
		Pedido_enviado[] arrayPedidoEnv= null;
		try {
			Pedido_enviado[] arrayPedidoEnviado = Pedido_enviadoDAO.listPedido_enviadoByQuery(null, null);
			
			
			for (int i = 0; i < arrayPedidoEnviado.length; i++) {				
				if(arrayPedidoEnviado[i].getRealizado_por().getId() == aIdUsuario) {					
					listaPedidoEnviado.add(arrayPedidoEnviado[i]);
				}						
			}


			t.commit();
		} catch (PersistentException e) {
			t.rollback();
		}
				
		arrayPedidoEnv = listaPedidoEnviado.stream().toArray(basededatos.Pedido_enviado[]::new);//convertir una lista a un array
			
		return arrayPedidoEnv;	
	}
}