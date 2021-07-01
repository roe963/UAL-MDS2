package bds;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Cliente;
import basededatos.ClienteDAO;
import basededatos.Empresa_transportes;
import basededatos.Empresa_transportesDAO;
import basededatos.Encargado_compras;
import basededatos.Encargado_comprasDAO;
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
		PersistentTransaction t;
		try {
			t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession()
			        .beginTransaction();
	        
	        Empresa_transportes empresaTransportes = new Empresa_transportes();
	        empresaTransportes.setEmail(aNombreUsuarioEmpresaTransportes);
	        empresaTransportes.setPassword(aPasswordUsuarioEmpresaTransportes);
	        empresaTransportes.setActivo(true);
	
	        try {
	        	Empresa_transportesDAO.save(empresaTransportes);
	            t.commit();
	        } catch (PersistentException e) {
	            t.rollback();
	        }
        } catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return true;
	}

	public Empresa_transportes[] cargar_empleados_empresa_transportes() {
		
		Empresa_transportes[] empresaTransportes = null;
		PersistentTransaction t;
		try {
			t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
        
	        try {
	        	empresaTransportes = Empresa_transportesDAO.listEmpresa_transportesByQuery(null, null);
	
	            t.commit();
	        } catch (PersistentException e) {
	            t.rollback();
	        }
        } catch (Exception e) {
	        // TODO: handle exception
	    }
        
        return empresaTransportes;
	}
	
	public boolean modificar_usuario_empresa_transportes(int aIdUsuarioEmpresaTransportes, String aNombreUsuarioEmpresaTransportes, String aPasswordUsuarioEmpresaTransportes) {

		PersistentTransaction t;
		try {
			t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession()
	                .beginTransaction();
			try {
				Empresa_transportes empresaTransportes = Empresa_transportesDAO.getEmpresa_transportesByORMID(aIdUsuarioEmpresaTransportes);
				empresaTransportes.setEmail(aNombreUsuarioEmpresaTransportes);
				empresaTransportes.setPassword(aPasswordUsuarioEmpresaTransportes);
	        
	            t.commit();
	        } catch (PersistentException e) {
	            t.rollback();
	        }
		}  catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return true;
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

		PersistentTransaction t;
		try {
			t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession()
			        .beginTransaction();
				try {
				Empresa_transportes empresaTransportes = Empresa_transportesDAO.getEmpresa_transportesByORMID(aIdUsuario);
				empresaTransportes.setActivo(aActivo);
	        
	            t.commit();
	        } catch (PersistentException e) {
	            t.rollback();
	        }
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return true;
	}
}