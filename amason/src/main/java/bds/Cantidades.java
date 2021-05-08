package bds;

import java.util.Vector;
import basededatos.Cantidad;
import basededatos.Cliente;
import basededatos.Producto;

public class Cantidades {
	public BDPrincipal _bdprincipal_cantidades;
	public Vector<Cantidad> _contiene_cantidad = new Vector<Cantidad>();

	public Cantidad[] realizar_pedido(Producto[] aProductos, int[] aCantidades, Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public Cantidad[] cargar_cantidades_pedido(int aIdPedido) {
		throw new UnsupportedOperationException();
	}
}