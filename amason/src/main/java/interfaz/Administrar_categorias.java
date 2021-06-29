package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.router.Route;

import bds.BDPrincipal;
import bds.iAdministrador;
import ual.mds2.ortegaortega.MenuHeader;
import vistas.VistaAdministrarcategorias;

@Route("administrar_categorias")
public class Administrar_categorias extends VistaAdministrarcategorias {
	/*private label _categorias;
	private textField _buscarCategoria;
	private button _guardarCategoria;
	public Administrador _administrador;
	public Agregar_categoria _agregar_categoria;
	public Categorias _categorias;*/
	
	iAdministrador administrador = new BDPrincipal();

	public Administrar_categorias() {
	    MenuBar mb = MenuHeader.getMenuBar();
	    this.getLayoutMenu().add(mb);
	    this.getLayoutMenu().setHorizontalComponentAlignment(Alignment.CENTER, mb);
	    
	    Agregar_categoria agregar_categoria = new Agregar_categoria();
	    //this.getLayoutAnadirProducto().removeAll();
	  	//this.getLayoutAnadirProducto().add(agregar_producto);
	    agregar_categoria(agregar_categoria);
	  	
	  	//this.getLayoutProductos().removeAll();
	  	//this.getLayoutProductos().add(new Productos_administrados(agregar_producto));
	    cargar_categorias(agregar_categoria);
	  	
	  	//modificar_producto(agregar_categoria);
	}

	public void agregar_categoria(Agregar_categoria agregar_categoria) {
		this.getLayoutAnadirCategoria().removeAll();
	  	this.getLayoutAnadirCategoria().add(agregar_categoria);
	  	
	  	agregar_categoria.getButtonAnadir().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				agregar_categoria.agregar_categoria();
				cargar_categorias(agregar_categoria);
			}
		});
	}

	public void cargar_categorias(Agregar_categoria agregar_categoria) {
		this.getLayoutCategorias().removeAll();
	  	this.getLayoutCategorias().add(new Categorias(agregar_categoria));
	}

	public void cambiar_estado_categoria() {
		throw new UnsupportedOperationException();
	}
}