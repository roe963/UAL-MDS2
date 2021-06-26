package interfaz;

import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import vistas.VistaRespuesta;

@PreserveOnRefresh
@Route("respuesta")
public class Respuesta extends VistaRespuesta {
	/*private label _pregunta;
	private label _preguntaUsuario;
	public Respuestas _respuestas;*/
	

	public Respuesta(basededatos.Respuesta respuesta) {		
		
		this.gethRespuesta().setText("Usuario: "+ respuesta.getPertenece_a().getEscrito_por().getEmail());		
		this.getLabelMensaje().setText("Respuesta: "+respuesta.getContendio());		
	
	}
	
}