package bds;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Cliente;
import basededatos.ClienteDAO;
import basededatos.Empresa_transportes;
import basededatos.Empresa_transportesDAO;
import basededatos.Pedido_enviado;
import basededatos.Pedido_enviadoDAO;
import basededatos.Usuario;

public class Empresas_transportes {
	public BDPrincipal _bdprincipal_empresas_trasnportes;
	public Vector<basededatos.Empresa_transportes> _contiene_empresa_transportes = new Vector<Empresa_transportes>();

	public Usuario iniciar_sesion_empresa_transportes(int aIdUsuario) {
		Empresa_transportes transportes = null;
        PersistentTransaction t;
        try {
            t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
            try {
                transportes = Empresa_transportesDAO.getEmpresa_transportesByORMID(aIdUsuario);
                t.commit();
            } catch (Exception e) {
                t.rollback();
            }
        } catch (PersistentException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        return transportes;
	}

	public String recuperar_contrasena(String aMailUsuario) {
		throw new UnsupportedOperationException();
	}

	public boolean agregar_usuario(String aNombreUsuarioEmpresaTransportes, String aPasswordUsuarioEmpresaTransportes) {
		throw new UnsupportedOperationException();
	}

	public interfaz.Empresa_transportes[] cargar_empleados_empresa_transportes() {
		throw new UnsupportedOperationException();
	}

	public boolean modificar_usuario_empresa_transportes(String aNombreUsuarioEmpresaTransportes, Object aPasswordUsuarioEmpresaTransportes) {
		throw new UnsupportedOperationException();
	}

	public basededatos.Empresa_transportes[] cargar_empresas_transportes() {
	    PersistentTransaction t;
        Empresa_transportes[] empresas = null;
        try {
            t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
            try {
                empresas = Empresa_transportesDAO.listEmpresa_transportesByQuery(null, null);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return empresas;
	}

	public boolean cambiar_estado_usaurio_empresa_transportes(int aIdUsuario, boolean aActivo) {
		throw new UnsupportedOperationException();
	}
}