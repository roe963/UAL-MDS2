package interfaz;

import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import bds.BDPrincipal;
import bds.iAdministrador;
import ual.mds2.ortegaortega.MenuHeader;
import vistas.VistaAdministrarproductos;

@PreserveOnRefresh
@Route("administrar_productos")
public class Administrar_productos extends VistaAdministrarproductos {
	
	iAdministrador administrador = new BDPrincipal();

	public Administrar_productos() {
	    MenuBar mb = MenuHeader.getMenuBar();
	    this.getLayoutMenu().add(mb);
	    this.getLayoutMenu().setHorizontalComponentAlignment(Alignment.CENTER, mb);
	    
	    Agregar_producto agregar_producto = new Agregar_producto();
	    //agregar_producto(agregar_producto);
	    this.getLayoutAnadirProducto().removeAll();
	  	this.getLayoutAnadirProducto().add(agregar_producto);
	  	
	  	//cargar_todos_productos(agregar_producto);
	  	this.getLayoutProductos().removeAll();
	  	Productos_administrados pa = new Productos_administrados(agregar_producto);
	  	this.getLayoutProductos().add(pa);
	  	
	  	
	  	//modificar_producto(agregar_producto);
	  	this.getButtonGuardar().addClickListener(event -> pa.modificar_producto());
	  	
	}	
}