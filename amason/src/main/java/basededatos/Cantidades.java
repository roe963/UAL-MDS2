package basededatos;

import java.util.ArrayList;
import basededatos.Cantidad;

public class Cantidades {
	public BDPrincipal _bdprincipal_cantidades;
	public ArrayList<Cantidad> _contiene_cantidad = new ArrayList<Cantidad>();

	public Cantidad[] realizar_pedido(Producto[] aProductos, int[] aCantidades, Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public Cantidad[] cargar_cantidades_pedido(int aIdPedido) {
		throw new UnsupportedOperationException();
	}
}