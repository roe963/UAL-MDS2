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

	public Mensaje[] cargar_mensajes_cliente(int aIdUsuario)  throws PersistentException{
		Mensaje[] mensajes = null;
		
        PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
        
        try {
        	mensajes = MensajeDAO.listMensajeByQuery("ClienteUsuarioId=" + aIdUsuario, null);        	
            t.commit();
            
        } catch (PersistentException e) {
            t.rollback();
        }
        
        return mensajes;
	}

	public Mensaje[] cargar_mensajes_administrador() {
		throw new UnsupportedOperationException();
	}

	public Mensaje crear_mensaje(int aIdUsuario) throws PersistentException{		
		
        PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
    	Mensaje nuevoMensaje = null;

        try {
        	Cliente cliente = ClienteDAO.getClienteByORMID(aIdUsuario);
        	nuevoMensaje= new  Mensaje();
        	nuevoMensaje.setEscrito_por(cliente);  
        	MensajeDAO.save(nuevoMensaje);
            t.commit();
            
        } catch (PersistentException e) {
            t.rollback();           
         
        }
        
        return nuevoMensaje;
	}
}