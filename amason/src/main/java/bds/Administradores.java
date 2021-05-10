package bds;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Administrador;
import basededatos.AdministradorDAO;
import basededatos.Cliente;
import basededatos.ClienteDAO;
import basededatos.Usuario;

public class Administradores {
    public BDPrincipal _bdprincipal_administradores;
    public Vector<Administrador> _contiene_administrador = new Vector<Administrador>();

    public Usuario iniciar_sesion_administrador(int aIdUsuario) {
        Administrador admin = null;
        PersistentTransaction t;
        try {
            t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
            try {
                admin = AdministradorDAO.getAdministradorByORMID(aIdUsuario);
                t.commit();
            } catch (Exception e) {
                t.rollback();
            }
        } catch (PersistentException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        return admin;
    }

    public String recuperar_contrasena(String aMailUsuario) {
        throw new UnsupportedOperationException();
    }
}