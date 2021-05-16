package bds;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Cantidad;
import basededatos.CantidadDAO;
import basededatos.Cliente;
import basededatos.ClienteDAO;
import basededatos.Pedido;
import basededatos.Pedido_pendiente;
import basededatos.Pedido_pendienteDAO;
import basededatos.Producto;
import basededatos.ProductoDAO;

public class Pedidos_pendientes {
	public BDPrincipal _bdprincipal_pedidos_pendientes;
	public Vector<Pedido_pendiente> _contiene_pedido_pendiente = new Vector<Pedido_pendiente>();

	public Pedido[] cargar_pedidos_pendientes() {
		throw new UnsupportedOperationException();
	}

	public void eliminar_pendiente_enviado(int aIdPedido) {
		throw new UnsupportedOperationException();
	}

	public void realizar_pedido(Cantidad[] aCantidades, Cliente aCliente)throws PersistentException  {
		PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession()
				.beginTransaction();

		try {

			for (int i = 0; i < aCantidades.length; i++) {
				Pedido_pendiente pedidoPendiente = Pedido_pendienteDAO.createPedido_pendiente();
				Cliente cliente = ClienteDAO.getClienteByORMID(aCliente.getId());
				
				double precio= aCantidades[i].getContiene_un().getPrecio();
				double cantidad= aCantidades[i].getCantidad();				
				float total  = (float )precio * (float) cantidad;
				
				pedidoPendiente.setPrecio(total);
				pedidoPendiente.setORM_Realizado_por(cliente);
					
			
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
		throw new UnsupportedOperationException();
	}
}