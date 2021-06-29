package basededatos;

import java.util.Vector;
import basededatos.Producto;

public class Productos {
	public BDPrincipal _bdprincipal_productos;
	public Vector<Producto> _contiene_producto = new Vector<Producto>();

	public Producto[] cargar_productos(String aNombreProducto) {
		throw new UnsupportedOperationException();
	}

	public Producto[] cargar_productos_categoria(int aIdCategoria) {
		throw new UnsupportedOperationException();
	}

	public Producto[] cargar_productos() {
		throw new UnsupportedOperationException();
	}

	public Producto cargar_producto(int aIdProducto) {
		throw new UnsupportedOperationException();
	}

	public void agregar_producto(String aNombreProducto, int aCategoria, double aPrecioProducto, String aDescripcionProducto, String aImagenProducto) {
		throw new UnsupportedOperationException();
	}

	public void modificar_proucto(String aNombreProducto, Categoria aCategoria, double aPrecioProducto, String aDescripcionProducto, String aImagenProducto) {
		throw new UnsupportedOperationException();
	}

	public void activar_producto(int aIdProducto) {
		throw new UnsupportedOperationException();
	}

	public Producto[] cargar_productos_pedido(Cantidad[] aCantidades) {
		throw new UnsupportedOperationException();
	}

	public void cambiar_estado_producto(int aDiProducto, boolean aActivo) {
		throw new UnsupportedOperationException();
	}

	public Producto[] cargar_todos_productos() {
		throw new UnsupportedOperationException();
	}
}