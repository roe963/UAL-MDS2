package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import basededatos.Cliente;
import ual.mds2.ortegaortega.MenuHeader;
import vistas.VistaAdministrarproductos;

@PreserveOnRefresh
@Route("administrar_productos")
public class Administrar_productos extends VistaAdministrarproductos {
	/*private label _productosActivos;
	private textField _buscarProducto;
	private button _guardarProducto;
	public Administrador _administrador;
	public Productos_administrados _productos_administrados;
	public Agregar_producto _agregar_producto;*/

	public Administrar_productos() {
	    MenuBar mb = MenuHeader.getMenuBar();
	    this.getLayoutMenu().add(mb);
	    this.getLayoutMenu().setHorizontalComponentAlignment(Alignment.CENTER, mb);
	    
	    //Crear la interfaz ofertas
	    this.getLayoutAnadirProducto().removeAll();
	    Agregar_producto agregar_producto = new Agregar_producto();
	  	this.getLayoutAnadirProducto().add(agregar_producto);
	  	
	  	this.getLayoutProductos().removeAll();
	  	this.getLayoutProductos().add(new Productos_administrados(agregar_producto));
	}
	
	public void agregar_producto() {
		throw new UnsupportedOperationException();
	}

	public void cargar_categorias() {
		throw new UnsupportedOperationException();
	}

	public void cargar_todos_productos() {
		throw new UnsupportedOperationException();
	}

	public void modificar_producto() {
		throw new UnsupportedOperationException();
	}

	public void cambiar_estado_producto() {
		throw new UnsupportedOperationException();
	}
}