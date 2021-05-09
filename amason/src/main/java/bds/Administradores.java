package bds;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Administrador;
import basededatos.AdministradorDAO;
import basededatos.Usuario;

public class Administradores {
	public BDPrincipal _bdprincipal_administradores;
	public Vector<Administrador> _contiene_administrador = new Vector<Administrador>();

	public Usuario iniciar_sesion_administrador(int aIdUsuario) throws PersistentException {
		PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession()
                .beginTransaction();

        Usuario usuario = null;
        try {
            usuario = AdministradorDAO.getAdministradorByORMID(aIdUsuario);
            t.commit();

        } catch (Exception e) {
            t.rollback();
        }
        return usuario;
	}

	public String recuperar_contrasena(String aMailUsuario) {
		throw new UnsupportedOperationException();
	}
}