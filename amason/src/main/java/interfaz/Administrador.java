package interfaz;

import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import vistas.VistaAdministrador;

@PreserveOnRefresh
@Route("administrador")
//public class Administrador extends VistaAdministrador {
public class Administrador extends Ver_catalogo_administrador {

	/*public Administrador() {
		new Ver_catalogo_administrador();
	}*/
}