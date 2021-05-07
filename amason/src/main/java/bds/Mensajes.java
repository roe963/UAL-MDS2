package bds;

import java.util.Vector;

import basededatos.Mensaje;

public class Mensajes {
	public BDPrincipal _bdprincipal_mensajes;
	public Vector<Mensaje> _contiene_mensaje = new Vector<Mensaje>();

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