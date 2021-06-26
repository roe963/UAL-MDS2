package interfaz;

import java.util.Vector;

import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import interfaz.Mensaje;
import vistas.VistaMensajesclienteregistrado;

@PreserveOnRefresh
@Route("mensajes_cliente_registrado")
public class Mensajes_cliente_registrado extends VistaMensajesclienteregistrado {
	/*public Ver_mensajes_cliente_registrado _ver_mensajes_cliente_registrado;
	public Vector<Mensaje> _mensaje = new Vector<Mensaje>();*/
	
	

	public Mensajes_cliente_registrado(basededatos.Mensaje mensaje) {
		// TODO Auto-generated constructor stub
		
		
		//Mensaje a = new Mensaje(mensaje);
		
		
	}
	
	
}