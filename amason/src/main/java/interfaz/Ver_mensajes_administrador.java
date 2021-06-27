package interfaz;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import bds.BDPrincipal;
import bds.iCorreo_personal;
import ual.mds2.ortegaortega.MenuHeader;
import ual.mds2.ortegaortega.Session;
import vistas.VistaVermensajesadministrador;

@PreserveOnRefresh
@Route("ver_mensajes_administrador")
public class Ver_mensajes_administrador extends VistaVermensajesadministrador {
	/*public Administrador _administrador;
	public Mensajes_administrador _mensajes_administrador;*/
	
	iCorreo_personal correo = new BDPrincipal();
	int idUsuario= Session.getUsuario().getId();
	
	public Ver_mensajes_administrador() {
		
		//cargar el menú 
		MenuBar mb = MenuHeader.getMenuBar();
	    this.getLayoutMenu().add(mb);
	    this.getLayoutMenu().setHorizontalComponentAlignment(Alignment.CENTER, mb);
	    
	    
		cargar_mensajes_administrador();
		
	
		
	}
	
	public void cargar_mensajes_administrador() {
		basededatos.Mensaje[] mensajes = correo.cargar_mensajes_administrador();
		
		this.getVerticalLayout().removeAll();
		
		if (mensajes.length != 0) {
			for (int i = 0; i < mensajes.length; i++) {
				this.getVerticalLayout().add(new Mensaje(mensajes[i],i));
			}

		} else {
			Label titulo = new Label();
			titulo.setText("No hay Mensajes en la BD");
			this.getVerticalLayout().add(titulo);
		}		
	}
}