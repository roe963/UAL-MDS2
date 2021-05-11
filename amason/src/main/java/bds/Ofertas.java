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
		throw new UnsupportedOperationException();
	}

	public void agregar_oferta(int aIdProducto, double aPrecioOferta, Date aFechaFinOferta) {
		throw new UnsupportedOperationException();
	}

	public Oferta[] cargar_ofertas() throws PersistentException{
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