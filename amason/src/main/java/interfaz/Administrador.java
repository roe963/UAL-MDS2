package interfaz;

import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import ual.mds2.ortegaortega.MenuHeader;
import vistas.VistaAdministrador;

@PreserveOnRefresh
@Route("administrador")
//public class Administrador extends VistaAdministrador {
public class Administrador extends Ver_catalogo_administrador {

	public Administrador() {
		MenuBar mb = MenuHeader.getMenuBar();
        this.getLayoutMenu().add(mb);
        this.getLayoutMenu().setHorizontalComponentAlignment(Alignment.CENTER, mb);
        
		//new Ver_catalogo_administrador();
	}
}