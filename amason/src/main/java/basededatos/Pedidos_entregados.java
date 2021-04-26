package basededatos;

import java.util.ArrayList;
import basededatos.Pedido_entregado;

public class Pedidos_entregados {
	public BDPrincipal _bdprincipal_pedidos_entregados;
	public ArrayList<Pedido_entregado> _contiene_pedido_entregado = new ArrayList<Pedido_entregado>();

	public Pedido[] cargar_pedidos_entregados() {
		throw new UnsupportedOperationException();
	}

	public void agregar_enviado_entregado(int aIdPedido) {
		throw new UnsupportedOperationException();
	}

	public Pedido_entregado[] cargar_pedidos_entregados_cliente_registrado(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}
}