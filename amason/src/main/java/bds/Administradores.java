package bds;

import java.util.ArrayList;
import basededatos.Administrador;
import basededatos.Usuario;

public class Administradores {
	public BDPrincipal _bdprincipal_administradores;
	public ArrayList<Administrador> _contiene_administrador = new ArrayList<Administrador>();

	public Usuario iniciar_sesion(String aMailUsuario, String aPasswordUsuario) {
		throw new UnsupportedOperationException();
	}

	public String recuperar_contrasena(String aMailUsuario) {
		throw new UnsupportedOperationException();
	}
}