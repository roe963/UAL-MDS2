package basededatos;

import java.util.Vector;
import basededatos.Administrador;

public class Administradores {
	public BDPrincipal _bdprincipal_administradores;
	public Vector<Administrador> _contiene_administrador = new Vector<Administrador>();

	public Usuario iniciar_sesion_administrador(int aIsUsuario) {
		throw new UnsupportedOperationException();
	}

	public String recuperar_contrasena(String aMailUsuario) {
		throw new UnsupportedOperationException();
	}
}