package bds;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Cliente;
import basededatos.ClienteDAO;
import basededatos.Encargado_compras;
import basededatos.Encargado_comprasDAO;
import basededatos.Foto;
import basededatos.FotoDAO;
import basededatos.Producto;
import basededatos.ProductoDAO;
import basededatos.Usuario;
import basededatos.UsuarioDAO;

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
	
	public Encargado_compras[] cargar_empleados_encargado_compras() {

		Encargado_compras[] encargadoCompras = null;
		PersistentTransaction t;
		try {
			t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
        
	        try {
	        	encargadoCompras = Encargado_comprasDAO.listEncargado_comprasByQuery(null, null);
	
	            t.commit();
	        } catch (PersistentException e) {
	            t.rollback();
	        }
        } catch (Exception e) {
	        // TODO: handle exception
	    }
        
        return encargadoCompras;
	}

	public boolean modificar_usuario_encargado_compras(int aIdUsuarioEncargadoCompras, String aNombreUsuarioEncargadoCompras, String aPasswordUsuarioEncargadoCompras) {
		
		PersistentTransaction t;
		try {
			t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession()
	                .beginTransaction();
			try {
				Encargado_compras encargadoCompras = Encargado_comprasDAO.getEncargado_comprasByORMID(aIdUsuarioEncargadoCompras);
				encargadoCompras.setEmail(aNombreUsuarioEncargadoCompras);
				encargadoCompras.setPassword(aPasswordUsuarioEncargadoCompras);
	        
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

	public boolean cambiar_estado_usuario_encargado_compras(int aIdUsuario, boolean aActivo) {

		PersistentTransaction t;
		try {
			t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession()
			        .beginTransaction();
				try {
				Encargado_compras encargadoCompras = Encargado_comprasDAO.getEncargado_comprasByORMID(aIdUsuario);
				encargadoCompras.setActivo(aActivo);
	        
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

	public boolean agregar_usuario(String aNombreUsuarioEncargadoCompras, String aPasswordUsuarioEncargadoCompras) {
		
		PersistentTransaction t;
		try {
			t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession()
			        .beginTransaction();
	        
	        Encargado_compras encargadoCompras = new Encargado_compras();
	        encargadoCompras.setEmail(aNombreUsuarioEncargadoCompras);
	        encargadoCompras.setPassword(aPasswordUsuarioEncargadoCompras);
	        encargadoCompras.setActivo(true);
	
	        try {
	        	Encargado_comprasDAO.save(encargadoCompras);
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