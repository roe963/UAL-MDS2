package basededatos;

import java.util.Vector;
// import basededatos.Producto;
// import interfaz.Producto;

public class Productos {
	public BDPrincipal _bdprincipal_productos;
	public Vector<basededatos.Producto> _contiene_producto = new Vector<Producto>();

	public basededatos.Producto[] cargar_productos(String aNombreProducto) {
		throw new UnsupportedOperationException();
	}

	public basededatos.Producto[] cargar_productos_categoria(int aIdCategoria) {
		throw new UnsupportedOperationException();
	}

	public interfaz.Producto[] cargar_productos() {
		throw new UnsupportedOperationException();
	}

	public basededatos.Producto cargar_producto(int aIdProducto) {
		throw new UnsupportedOperationException();
	}

	public Valoracion[] cargar_valoraciones(int aIdProducto) {
		throw new UnsupportedOperationException();
	}

	public void agregar_producto(String aNombreProducto, int aCategoria, double aPrecioProducto, String aDescripcionProducto, String aImagenProducto1, String aImagenProducto2, String aImagenProducto3, String aImagenProducto4, String aImagenProducto5, int aImagenPrincipal_) {
		throw new UnsupportedOperationException();
	}

	public void modificar_proucto(String aNombreProducto, int aCategoria, double aPrecioProducto, String aDescripcionProducto, String aImagenProducto1, String aImagenProducto2, String aImagenProducto3, String aImagenProducto4, String aImagenProducto5, String aImagenPrincipal_, boolean aActivo) {
		throw new UnsupportedOperationException();
	}

	public void activar_producto(int aIdProducto) {
		throw new UnsupportedOperationException();
	}
}