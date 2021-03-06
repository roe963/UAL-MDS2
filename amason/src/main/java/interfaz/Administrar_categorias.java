package interfaz;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import ual.mds2.ortegaortega.MenuHeader;
import vistas.VistaAdministrarcategorias;

@PreserveOnRefresh
@Route("administrar_categorias")
public class Administrar_categorias extends VistaAdministrarcategorias {
	
	iAdministrador administrador = new BDPrincipal();

	public Administrar_categorias() {
	    MenuBar mb = MenuHeader.getMenuBar();
	    this.getLayoutMenu().add(mb);
	    this.getLayoutMenu().setHorizontalComponentAlignment(Alignment.CENTER, mb);
	    
	    Agregar_categoria agregar_categoria = new Agregar_categoria();
	    this.getLayoutAnadirCategoria().removeAll();
	  	this.getLayoutAnadirCategoria().add(agregar_categoria);
	  	
	  	this.getLayoutCategorias().removeAll();
	  	this.getLayoutCategorias().add(new Categorias());
	}
	
}