package bds;

import java.util.ArrayList;
import basededatos.Mensaje;

public class Mensajes {
	public BDPrincipal _bdprincipal_mensajes;
	public ArrayList<Mensaje> _contiene_mensaje = new ArrayList<Mensaje>();

	public Mensaje[] cargar_mensajes_cliente(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] cargar_mensajes_administrador() {
		throw new UnsupportedOperationException();
	}

	public Mensaje crear_mensaje(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}
}