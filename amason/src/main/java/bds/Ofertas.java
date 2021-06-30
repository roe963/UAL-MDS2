package bds;

import java.util.Date;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Foto;
import basededatos.FotoDAO;
import basededatos.Oferta;
import basededatos.OfertaDAO;
import basededatos.Producto;
import basededatos.ProductoDAO;

public class Ofertas {
	public BDPrincipal _bdprincipal_ofertas;
	public Vector<Oferta> _contiene_oferta = new Vector<Oferta>();

	public void finalizar_oferta(int aIdOferta) {
		
		PersistentTransaction t;
		try {
			t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession()
			        .beginTransaction();
	        
	        try {
	        	Oferta oferta = OfertaDAO.getOfertaByORMID(aIdOferta);
		        Producto producto = oferta.getContiene_un();
		        producto.setPertenece_a(null);
	        	
	        	ProductoDAO.save(producto);
	        	OfertaDAO.delete(oferta);
	            t.commit();
	        } catch (PersistentException e) {
	            t.rollback();
	        }
        } catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	public void agregar_oferta(int aIdProducto, double aPrecioOferta, long aFechaFinOferta) {

		PersistentTransaction t;
		try {
			t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession()
			        .beginTransaction();
		
	        Oferta oferta = new Oferta();
	        Producto producto = ProductoDAO.getProductoByORMID(aIdProducto);
	        
	        oferta.setPrecio((float)aPrecioOferta);
	        oferta.setFecha(aFechaFinOferta);
	        oferta.setContiene_un(producto);
	
	        try {
	        	OfertaDAO.save(oferta);
	            t.commit();
	        } catch (PersistentException e) {
	            t.rollback();
	        }
        } catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public Oferta[] cargar_ofertas() throws PersistentException {
		Oferta[] ofertas = null;
		
        PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
        
        try {
        	ofertas = OfertaDAO.listOfertaByQuery(null, null);
            t.commit();
        } catch (PersistentException e) {
            t.rollback();
        }
        
        return ofertas;
	}
}