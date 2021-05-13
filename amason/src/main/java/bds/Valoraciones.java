package bds;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;


import basededatos.Valoracion;
import basededatos.ValoracionDAO;

public class Valoraciones {
	public BDPrincipal _bdprincipal_valoraciones;
	public Vector<Valoracion> _contine_valoracion = new Vector<Valoracion>();

	public void valorar_producto(int aIdProducto, int aIdUsuario, int aPuntiacion, String aComentario, Date aFecha) {
		throw new UnsupportedOperationException();
	}

	public Valoracion[] cargar_valoraciones(int aIdProducto) throws PersistentException {
		Valoracion[] valoraciones = null;
		List<Valoracion> aux = new ArrayList<>();
		Valoracion[] SalidaValoraciones = null;
		
        PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
        
        try {
        	valoraciones = ValoracionDAO.listValoracionByQuery(null, null);   

        	for (int i = 0; i < valoraciones.length; i++) {
        		if(valoraciones[i].getValora_un().getId() == aIdProducto) {
        			aux.add(valoraciones[i]);
        		}				
			}
        	
            t.commit();
        } catch (PersistentException e) {
            t.rollback();
        }
        
        //convertir a un array
        SalidaValoraciones = aux.stream().toArray(Valoracion[]::new);
        
        return SalidaValoraciones;
	}
}