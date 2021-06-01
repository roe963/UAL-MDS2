package interfaz;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.flow.component.html.Label;

import basededatos.Cantidad;
import ual.mds2.ortegaortega.ViewChanger;
import vistas.VistaProductosdelcarrito;

public class Productos_del_carrito extends VistaProductosdelcarrito {

	/*public Carrito _carrito;
	public Vector<Producto_del_carrito> _producto_del_carrito = new Vector<Producto_del_carrito>();
	*/
	
    public List<Producto_del_carrito> ListaProductoCarrito = new ArrayList<Producto_del_carrito>();
	
	public Productos_del_carrito (List<Producto_del_carrito> productoscarrito) {

	    this.ListaProductoCarrito = productoscarrito;

//		List<basededatos.Producto> listaProductos= ViewChanger.getListaProductos();
//		List<cantidadCache> listaCantidad= ViewChanger.getCantidadProductos();

		this.getVlProductos().removeAll();
		
		if(ListaProductoCarrito.size() == 0) {
			Label titulo= new Label();
            titulo.setText("No hay productos en el carrito");
            this.getVlProductos().add(titulo);
			
		}else {
		    for (Producto_del_carrito producto_del_carrito : ListaProductoCarrito) {
		        this.getVlProductos().add((producto_del_carrito) );
            }
		}
		
		
	}
	
	
	
	
	
	
	
	
	
}