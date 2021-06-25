package interfaz;

import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import vistas.VistaVermensajesclienteregistrado;

@PreserveOnRefresh
@Route("ver_mensajes_cliente_registrado")
public class Ver_mensajes_cliente_registrado extends VistaVermensajesclienteregistrado {
	/*public Cliente_registrado _cliente_registrado;
	public Mensajes_cliente_registrado _mensajes_cliente_registrado;
	public Redactar _redactar;*/

	public void cargar_mensajes_cliente() {
		throw new UnsupportedOperationException();
	}

	public void redactar_mensaje() {
		throw new UnsupportedOperationException();
	}
}