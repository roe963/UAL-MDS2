package bds;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Pedido;
import basededatos.Pedido_entregado;
import basededatos.Pedido_entregadoDAO;
import basededatos.Pedido_enviado;
import basededatos.Pedido_enviadoDAO;

public class Pedidos_entregados {
	public BDPrincipal _bdprincipal_pedidos_entregados;
	public Vector<Pedido_entregado> _contiene_pedido_entregado = new Vector<Pedido_entregado>();

	public Pedido[] cargar_pedidos_entregados() {
		throw new UnsupportedOperationException();
	}

	public void agregar_enviado_entregado(int aIdPedido) {
		throw new UnsupportedOperationException();
	}

	public Pedido_entregado[] cargar_pedidos_entregados_cliente_registrado(int aIdUsuario) throws PersistentException  {
		PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession()
				.beginTransaction();

		List<Pedido_entregado> listaPedidoEntregado = new ArrayList<Pedido_entregado>();
		Pedido_entregado[] arrayPedidoEnt= null;
		try {

			Pedido_entregado[] arrayPedidoEntregado = Pedido_entregadoDAO.listPedido_entregadoByQuery(null, null);
			
			for (int i = 0; i < arrayPedidoEntregado.length; i++) {				
				if(arrayPedidoEntregado[i].getRealizado_por().getId() == aIdUsuario) {					
					listaPedidoEntregado.add(arrayPedidoEntregado[i]);
					
				}						
			}
				

			t.commit();
		} catch (PersistentException e) {
			t.rollback();
		}
				
		arrayPedidoEnt = listaPedidoEntregado.stream().toArray(basededatos.Pedido_entregado[]::new);//convertir una lista a un array
			
		return arrayPedidoEnt;	
	}
}