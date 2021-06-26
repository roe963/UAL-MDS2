package bds;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Cliente;
import basededatos.ClienteDAO;
import basededatos.Mensaje;
import basededatos.MensajeDAO;
import basededatos.Oferta;
import basededatos.OfertaDAO;
import basededatos.Respuesta;
import basededatos.RespuestaDAO;

public class Respuestas {
	public BDPrincipal _bdprincipal_respuestas;
	public Vector<Respuesta> _contiene_respuesta = new Vector<Respuesta>();

	public void ver_mensaje(int aIdMensaje) {
		throw new UnsupportedOperationException();
	}

	public void redactar_mensaje(String aMensajeUsuario, Mensaje aMensaje) throws PersistentException {
		PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
    	Respuesta respuesta = null;

        try {
        	Mensaje mensaje = MensajeDAO.getMensajeByORMID(aMensaje.getId());
        	respuesta= new  Respuesta();
        	respuesta.setORM_Pertenece_a(mensaje);  
        	
        	//calcular el número de respuesta y le pone un orden
        	Respuesta[] respuestas = cargar_respuestas_mensaje(aMensaje.getId());
        	respuesta.setOrden(respuestas.length+1);
        	
        	respuesta.setContendio(aMensajeUsuario);

        	RespuestaDAO.save(respuesta);
            t.commit();
            
        } catch (PersistentException e) {
            t.rollback();           
         
        }
        
	}

	public Respuesta[] cargar_respuestas_mensaje(int aIdMensaje)throws PersistentException  {
		Respuesta[] respuestas = null;
		
        PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
        
        try {
        	respuestas = RespuestaDAO.listRespuestaByQuery("MensajeId=" + aIdMensaje, null);
            t.commit();
        } catch (PersistentException e) {
            t.rollback();
        }
        
        return respuestas;
	}

	public void responder_respuesta(int aIdMensaje, String aRespuesta)  throws PersistentException{
		 PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
	    	Respuesta respuesta = null;

	        try {
	        	Mensaje mensaje = MensajeDAO.getMensajeByORMID(aIdMensaje);
	        	respuesta= new  Respuesta();
	        	respuesta.setORM_Pertenece_a(mensaje);  
	        	
	        	//calcular el número de respuesta y le pone un orden
	        	Respuesta[] respuestas = cargar_respuestas_mensaje(aIdMensaje);
	        	respuesta.setOrden(respuestas.length+1);
	        	
	        	respuesta.setContendio(aRespuesta);

	        	RespuestaDAO.save(respuesta);
	            t.commit();
	            
	        } catch (PersistentException e) {
	            t.rollback();           
	         
	        }
	        
	}
	
}