package bds;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Encargado_compras;
import basededatos.Encargado_comprasDAO;
import basededatos.Usuario;

public class Encargados_compras {
	public BDPrincipal _bdprincipal_encargados_compras;
	public Vector<Encargado_compras> _contiene_encargado_compras = new Vector<Encargado_compras>();

	public Usuario iniciar_sesion_encargado_compras(int aIdUsuario) throws PersistentException {
		PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession()
                .beginTransaction();

        Usuario usuario = null;
        try {
            usuario = Encargado_comprasDAO.getEncargado_comprasByORMID(aIdUsuario);
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