package interfaz;

import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import vistas.VistaRespuesta;

@PreserveOnRefresh
@Route("respuesta")
public class Respuesta extends VistaRespuesta {
	
	public Respuesta(basededatos.Respuesta respuesta) {		
		
		if(respuesta.getPertenece_a().getEscrito_por().getId() == respuesta.getEscrita_por().getId()){
			this.gethRespuesta().setText("Usuario: "+ respuesta.getPertenece_a().getEscrito_por().getNombre());	
		}else {
			this.gethRespuesta().setText("Usuario: Administrador");	
		}
		
		this.getLabelMensaje().setText("Respuesta: "+respuesta.getContendio());
	}
	
}