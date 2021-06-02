package bds;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Categoria;
import basededatos.CategoriaDAO;
import basededatos.Foto;
import basededatos.FotoDAO;
import basededatos.Producto;
import basededatos.ProductoDAO;

public class Categorias {
	public BDPrincipal _bdprincipal_categorias;
	public Vector<Categoria> _contiene_categoria = new Vector<Categoria>();

	public Producto[] cargar_categoria(int aIdCategoria) throws PersistentException {
		Producto[] productos = null;
		
        PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
        
        try {
        	productos = ProductoDAO.listProductoByQuery(null, null);
        	//productos = CategoriaDAO.listCategoriaByQuery(null, null);

            t.commit();
        } catch (PersistentException e) {
            t.rollback();
        }
        
        return productos;
	}

	public void agregar_categoria(String aNombreCategoria) {
		throw new UnsupportedOperationException();
	}

	public Categoria[] cargar_categorias() throws PersistentException {
		Categoria[] categorias = null;
				
        PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
        
        try {
        	//categorias = ProductoDAO.listProductoByQuery(null, null);
        	categorias = CategoriaDAO.listCategoriaByQuery(null, null);

            t.commit();
        } catch (PersistentException e) {
            t.rollback();
        }
        
        return categorias;
	}

	public void activar_categoria(int aIdCategoria) {
		throw new UnsupportedOperationException();
	}

	public void cambiar_estado_categoria(int aIdCategoria, boolean aActivo) {
		throw new UnsupportedOperationException();
	}
}