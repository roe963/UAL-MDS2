package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Categorias {
	public BDPrincipal _bdprincipal_categorias;
	public Vector<Categoria> _contiene_categoria = new Vector<Categoria>();

	public Producto[] cargar_categoria(int aIdCategoria) throws PersistentException {
		
		Producto[] productos = null;
		
        PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
        
        try {
        	productos = ProductoDAO.listProductoByQuery(null, null);
        	
            t.commit();
        } catch (PersistentException e) {
            t.rollback();
        }
        
        return productos;
	}

	public void agregar_categoria(String aNombreCategoria) {

		PersistentTransaction t;
		try {
			t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession()
	                .beginTransaction();
			
	        Categoria categoria = new Categoria();
	        categoria.setNombre(aNombreCategoria);
	        categoria.setActivo(true);

	        try {
	            CategoriaDAO.save(categoria);
	            t.commit();
	        } catch (PersistentException e) {
	            t.rollback();
	        }
		} catch (Exception e) {
	        // TODO: handle exception
	    }
		
	}

	public Categoria[] cargar_categorias() throws PersistentException {
		Categoria[] categorias = null;
				
        PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
        
        try {
        	categorias = CategoriaDAO.listCategoriaByQuery("Activo=1", null);

            t.commit();
        } catch (PersistentException e) {
            t.rollback();
        }
        
        return categorias;
	}
	
	public Categoria[] cargar_todas_categorias() throws PersistentException {
		Categoria[] categorias = null;
				
        PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
        
        try {
        	categorias = CategoriaDAO.listCategoriaByQuery(null, null);

            t.commit();
        } catch (PersistentException e) {
            t.rollback();
        }
        
        return categorias;
	}

	public void cambiar_estado_categoria(int aIdCategoria, boolean aActivo) {

		PersistentTransaction t;
		try {
			t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession()
	                .beginTransaction();
			
	        Categoria categoria = CategoriaDAO.getCategoriaByORMID(aIdCategoria);
	        
	        categoria.setActivo(aActivo);

	        try {
	            CategoriaDAO.save(categoria);
	            t.commit();
	        } catch (PersistentException e) {
	            t.rollback();
	        }
		} catch (Exception e) {
	        // TODO: handle exception
	    }
	}
}