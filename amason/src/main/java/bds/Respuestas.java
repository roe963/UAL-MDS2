package bds;

import java.util.Vector;

import basededatos.Mensaje;
import basededatos.Respuesta;

public class Respuestas {
	public BDPrincipal _bdprincipal_respuestas;
	public Vector<Respuesta> _contiene_respuesta = new Vector<Respuesta>();

	public void ver_mensaje(int aIdMensaje) {
		throw new UnsupportedOperationException();
	}

	public void redactar_mensaje(String aMensajeUsuario, Mensaje aMensaje) {
		throw new UnsupportedOperationException();
	}

	public Respuesta[] cargar_respuestas_mensaje(int aIdMensaje) {
		throw new UnsupportedOperationException();
	}

	public void responder_respuesta(int aIdMensaje, String aRespuesta) {
		throw new UnsupportedOperationException();
	}
}