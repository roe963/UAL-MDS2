package interfaz;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import ual.mds2.ortegaortega.ViewChanger;
import vistas.VistaMensaje;

@PreserveOnRefresh
@Route("mensaje")
public class Mensaje extends VistaMensaje {
	/*private label _asuntoMensaje;
	private button _verMensaje;
	public Mensajes_cliente_registrado _mensajes_cliente_registrado;
	public Ver_respuestas _ver_respuestas;*/
	
	
	public Mensaje(basededatos.Mensaje mensaje) {
		
		
		this.getLabelMensaje().setText("Mensaje "+ Integer.toString(mensaje.getId()));
		
		this.getButtonVermensaje().addClickListener(e->{
			 UI.getCurrent().navigate("respuestas/" + mensaje.getId());			
		});
		
	}
	
}