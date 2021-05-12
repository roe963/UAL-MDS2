package bds;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Cliente;
import basededatos.ClienteDAO;
import basededatos.Encargado_compras;
import basededatos.Encargado_comprasDAO;
import basededatos.Usuario;

public class Encargados_compras {
	public BDPrincipal _bdprincipal_encargados_compras;
	public Vector<Encargado_compras> _contiene_encargado_compras = new Vector<Encargado_compras>();

	public Usuario iniciar_sesion_encargado_compras(int aIdUsuario) {
		Encargado_compras encargado = null;
        PersistentTransaction t;
        try {
            t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
            try {
                encargado = Encargado_comprasDAO.getEncargado_comprasByORMID(aIdUsuario);
                t.commit();
            } catch (Exception e) {
                t.rollback();
            }
        } catch (PersistentException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        return encargado;
	}

	public String recuperar_contrasena(String aMailUsuario) {
		throw new UnsupportedOperationException();
	}
}