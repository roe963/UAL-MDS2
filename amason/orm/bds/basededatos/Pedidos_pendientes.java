package basededatos;

import java.util.Vector;
import basededatos.Pedido_pendiente;

public class Pedidos_pendientes {
	public BDPrincipal _bdprincipal_pedidos_pendientes;
	public Vector<Pedido_pendiente> _contiene_pedido_pendiente = new Vector<Pedido_pendiente>();

	public Pedido[] cargar_pedidos_pendientes() {
		throw new UnsupportedOperationException();
	}

	public void eliminar_pendiente_enviado(int aIdPedido) {
		throw new UnsupportedOperationException();
	}

	public void realizar_pedido(Cantidad[] aCantidades, Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public boolean cancelar_compra(int aIdPedido) {
		throw new UnsupportedOperationException();
	}

	public Pedido_pendiente[] cargar_pedidos_pendientes_cliente_registrado(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}
}