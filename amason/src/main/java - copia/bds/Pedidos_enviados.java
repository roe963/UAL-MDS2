package bds;

import java.util.ArrayList;

import basededatos.Pedido;
import basededatos.Pedido_enviado;

public class Pedidos_enviados {
	public BDPrincipal _bdprincipal_pedidos_enviados;
	public ArrayList<Pedido_enviado> _contiene_pedido_enviado = new ArrayList<Pedido_enviado>();

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

	public Pedido_enviado[] cargar_pedidos_enviados_cliente_registrado(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}
}