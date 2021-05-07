package bds;

import java.util.Collections;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;

import basededatos.Cantidad;
import basededatos.Categoria;
import basededatos.Producto;
import basededatos.ProductoDAO;
import basededatos.Valoracion;

public class Productos {
	public BDPrincipal _bdprincipal_productos;
	public Vector<Producto> _contiene_producto = new Vector<Producto>();

	public Producto[] cargar_productos(String aNombreProducto) {
		throw new UnsupportedOperationException();
	}

	public Producto[] cargar_productos_categoria(Categoria aCategoria) {
		throw new UnsupportedOperationException();
	}

	public Producto[] cargar_productos() throws PersistentException {
		
		Producto[] productos = null;
		
        PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
        
        try {
        	productos = ProductoDAO.listProductoByQuery(null, null);
        	//Collections.addAll(_contiene_producto, productos);

            t.commit();
        } catch (PersistentException e) {
            t.rollback();
        }
        
        return productos;
	}

	public Producto cargar_producto(int aIdProducto) {
		throw new UnsupportedOperationException();
	}

	public Valoracion[] cargar_valoraciones(int aIdProducto) {
		throw new UnsupportedOperationException();
	}

	public void agregar_producto(String aNombreProducto, int aCategoria, double aPrecioProducto, String aDescripcionProducto, String aImagenProducto1, String aImagenProducto2, String aImagenProducto3, String aImagenProducto4, String aImagenProducto5, int aImagenPrincipal_) {
		throw new UnsupportedOperationException();
	}

	public void modificar_proucto(String aNombreProducto, int aCategoria, double aPrecioProducto, String aDescripcionProducto, String aImagenProducto1, String aImagenProducto2, String aImagenProducto3, String aImagenProducto4, String aImagenProducto5, String aImagenPrincipal_) {
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
}