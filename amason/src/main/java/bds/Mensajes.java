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

public class Mensajes {
	public BDPrincipal _bdprincipal_mensajes;
	public Vector<Mensaje> _contiene_mensaje = new Vector<Mensaje>();

	public Mensaje[] cargar_mensajes_cliente(int aIdUsuario) {
		Mensaje[] mensajes = null;
		
        PersistentTransaction t;
        
        try {
        	t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
	        try {
	        	mensajes = MensajeDAO.listMensajeByQuery("ClienteUsuarioId=" + aIdUsuario, null);        	
	            t.commit();
	            
	        } catch (PersistentException e) {
	            t.rollback();
	        }
        } catch (Exception e) {
        // TODO: handle exception
        }
        
        return mensajes;
	}

	public Mensaje[] cargar_mensajes_administrador() {
		Mensaje[] mensajes = null;
		
        PersistentTransaction t;
        try {
        	t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
	        try {
	        	mensajes = MensajeDAO.listMensajeByQuery(null, null);        	
	            t.commit();
	            
	        } catch (PersistentException e) {
	            t.rollback();
	        }
        } catch (Exception e) {
        // TODO: handle exception
    	}
        
        return mensajes;
	}

	public Mensaje crear_mensaje(int aIdUsuario) {		
		
        PersistentTransaction t;
    	Mensaje nuevoMensaje = null;
    	try {
    		t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
	        try {
	        	Cliente cliente = ClienteDAO.getClienteByORMID(aIdUsuario);
	        	nuevoMensaje= new  Mensaje();
	        	nuevoMensaje.setEscrito_por(cliente);  
	        	MensajeDAO.save(nuevoMensaje);
	            t.commit();
	            
	        } catch (PersistentException e) {
	            t.rollback();           
	         
	        }
    	} catch (Exception e) {
        // TODO: handle exception
    	}
        
        return nuevoMensaje;
	}
}