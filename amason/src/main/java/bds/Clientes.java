package bds;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Cliente;
import basededatos.ClienteDAO;
import basededatos.Usuario;
import basededatos.UsuarioDAO;
import ual.mds2.ortegaortega.ViewChanger;

public class Clientes {
	public BDPrincipal _bdprincipal_clientes;
	public Vector<Cliente> _contiene_cliente = new Vector<Cliente>();

	public Usuario iniciar_sesion_cliente(int aIdUsuario) {
		Cliente cliente = null;
        PersistentTransaction t;
        try {
            t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
            try {
                cliente = ClienteDAO.getClienteByORMID(aIdUsuario);
                t.commit();
            } catch (Exception e) {
                t.rollback();
            }
        } catch (PersistentException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        
        ViewChanger.setCliente(cliente);
        
        return cliente;
	}

	public String recuperar_contrasena(String aMailUsuario) {
		throw new UnsupportedOperationException();
	}

	public void registrar_usuario(String aNombreUsuario, String aMailUsuario, String aPasswordUsuario, String aConfirmPasswordUsuario, String aDireccionUsuario, String aFormaPagoUsuario, String aFotoUsuario) throws PersistentException {
		PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession()
                .beginTransaction();

        Cliente cliente = new Cliente();
        cliente.setNombre(aNombreUsuario);
        cliente.setEmail(aMailUsuario);
        cliente.setPassword(aPasswordUsuario);
        cliente.setDireccionEnvio(aDireccionUsuario);
        cliente.setMetodoPago(aFormaPagoUsuario);
        cliente.setFotoURL(aFotoUsuario);
        cliente.setActivo(true);

        try {
            ClienteDAO.save(cliente);
            t.commit();
        } catch (PersistentException e) {
            t.rollback();
        }
	}

	public  Cliente cargar_perfil(int aIdUsuario) throws PersistentException {
		PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession()
                .beginTransaction();
			
		Cliente cliente =null;
		  try {
				 cliente = ClienteDAO.getClienteByORMID(aIdUsuario);
				 
	            t.commit();
	        } catch (PersistentException e) {
	            t.rollback();
	        }
		  return cliente;
	}

	public void seleccionar_direccion_envio(int aIdUsuario, String aDireccionUsuario) {
		throw new UnsupportedOperationException();
	}

	public void seleccionar_metodo_pago(int aIdUsuario, String aMetodoPagoUsuario) {
		throw new UnsupportedOperationException();
	}

	public void validar_registro() {
		throw new UnsupportedOperationException();
	}
	
	
	public void guardar_perfil(int aIdUsuario, String aNombreUsuario, String aMailUsuario, String aDireccionUsuario, String aFormaPagoUsuario, String aFotoUsuario, boolean aEstadoCuenta) throws PersistentException {
		PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession()
                .beginTransaction();

              try {
        	  Cliente cliente = ClienteDAO.getClienteByORMID(aIdUsuario);              
              cliente.setNombre(aNombreUsuario);
              cliente.setEmail(aMailUsuario);
              cliente.setDireccionEnvio(aDireccionUsuario);
              cliente.setMetodoPago(aFormaPagoUsuario);
              cliente.setFotoURL(aFotoUsuario);
              cliente.setActivo(aEstadoCuenta);
                  
            t.commit();
        } catch (PersistentException e) {
            t.rollback();
        }
	}

	public void actualizas_datos_compra(String aDireccion, String aFormaPago, Cliente aCliente) throws PersistentException{
		PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession()
                .beginTransaction();

              try {
        	  Cliente cliente = ClienteDAO.getClienteByORMID(aCliente.getId());              
              cliente.setDireccionEnvio(aDireccion);
              cliente.setMetodoPago(aFormaPago);
                  
            t.commit();
        } catch (PersistentException e) {
            t.rollback();
        }
		
	}
}