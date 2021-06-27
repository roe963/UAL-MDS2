package interfaz;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import ual.mds2.ortegaortega.Session;
import ual.mds2.ortegaortega.TIPOUSUARIO;
import ual.mds2.ortegaortega.ViewChanger;
import vistas.VistaMensaje;

@PreserveOnRefresh
@Route("mensaje")
public class Mensaje extends VistaMensaje {
	
	public Mensaje(basededatos.Mensaje mensaje, int i) {
		
		if(Session.getTipo().equals(TIPOUSUARIO.ADMIN)) {//si entras como administrador que muestre los nombres del usuario
			this.getLabelUsuario().setText(mensaje.getEscrito_por().getEmail());			
		}else {//si entras como cliente registrado oculta el nombre
			this.getLabelUsuario().setVisible(false);
		}
		
		this.getLabelMensaje().setText("Mensaje "+ Integer.toString(i+1));
		
		this.getButtonVermensaje().addClickListener(e->{
			 UI.getCurrent().navigate("respuestas/" + mensaje.getId());			
		});
		
	}
	
}