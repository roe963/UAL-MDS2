package interfaz;

import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import bds.BDPrincipal;
import bds.iCliente;
import vistas.VistaCliente;

import ual.mds2.ortegaortega.MenuHeader;

@PreserveOnRefresh
@Route("cliente")
public class Cliente extends VistaCliente {
	
	public Cliente() {
	    MenuBar mb = MenuHeader.getMenuBar();
	    this.getLayoutMenu().add(mb);
	    this.getLayoutMenu().setHorizontalComponentAlignment(Alignment.CENTER, mb);
	    
		//Crear la interfaz ofertas
		this.getVaadinHorizontalLayout1().removeAll();
		this.getVaadinHorizontalLayout1().add(new Ofertas());	
		
		//crear la interfaz top ventas		
		this.getVaadinHorizontalLayout().removeAll();		
		this.getVaadinHorizontalLayout().add(new Productos());
	}
	
}