package interfaz;

import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import ual.mds2.ortegaortega.MenuHeader;
import vistas.VistaAdministrarofertas;

@PreserveOnRefresh
@Route("administrar_ofertas")
public class Administrar_ofertas extends VistaAdministrarofertas {
	
	public Administrar_ofertas() {
	    MenuBar mb = MenuHeader.getMenuBar();
	    this.getLayoutMenu().add(mb);
	    this.getLayoutMenu().setHorizontalComponentAlignment(Alignment.CENTER, mb);
	    
	    Agregar_oferta agregar_oferta = new Agregar_oferta();
	    this.getLayoutAnadirOferta().removeAll();
	  	this.getLayoutAnadirOferta().add(agregar_oferta);
	    //agregar_oferta(agregar_oferta);
	  	
	  	this.getLayoutOfertas().removeAll();
	  	this.getLayoutOfertas().add(new Ofertas_administrador());
	    //cargar_producto(agregar_oferta);
	}
	
}