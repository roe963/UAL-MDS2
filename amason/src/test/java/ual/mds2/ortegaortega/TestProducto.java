package ual.mds2.ortegaortega;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Producto;
import basededatos.ProductoDAO;

public class TestProducto {

	@Test
	public void test() throws PersistentException {
		//Producto[] productos = null;
			
        PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
        
        try {
        	//productos = ProductoDAO.listProductoByQuery(null, null);
        	Producto[] productos = ProductoDAO.listProductoByQuery("Activo=1", "Nombre");
        	//Collections.addAll(_contiene_producto, productos);

            //t.commit();
            
            assertTrue(productos.length > 0);
        } catch (PersistentException e) {
            //t.rollback();
        }
        
	}

}
