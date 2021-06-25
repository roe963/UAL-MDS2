package interfaz;

import java.util.Vector;

import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import interfaz.Respuesta;
import vistas.VistaRespuestas;

@PreserveOnRefresh
@Route("respuestas")
public class Respuestas extends VistaRespuestas {
	public Ver_respuestas _ver_respuestas;
	public Vector<Respuesta> _respuesta = new Vector<Respuesta>();

	public void cargar_respuestas_mensaje() {
		throw new UnsupportedOperationException();
	}

	public void responder_respuesta() {
		throw new UnsupportedOperationException();
	}
}