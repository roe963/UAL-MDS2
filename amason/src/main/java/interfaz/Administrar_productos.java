package interfaz;

import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.router.Route;

import ual.mds2.ortegaortega.MenuHeader;
import vistas.VistaAdministrarproductos;

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
	}
	
	public void agregar_producto() {
		throw new UnsupportedOperationException();
	}

	public void cargar_categorias() {
		throw new UnsupportedOperationException();
	}

	public void cargar_productos() {
		throw new UnsupportedOperationException();
	}

	public void modificar_producto() {
		throw new UnsupportedOperationException();
	}

	public void cambiar_estado_producto() {
		throw new UnsupportedOperationException();
	}
}