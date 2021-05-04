package bds;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Cliente;
import basededatos.ClienteDAO;
import basededatos.Usuario;

public class Clientes {
	public BDPrincipal _bdprincipal_clientes;
	public Vector<Cliente> _contiene_cliente = new Vector<Cliente>();

	public Usuario iniciar_sesion(String aMailUsuario, String aPasswordUsuario) {
		throw new UnsupportedOperationException();
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

	public Usuario cargar_perfil(int aIdUsuario) {
		throw new UnsupportedOperationException();
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

	public void guardar_perfil(int aIdUsuario, String aNombreUsuario, String aMailUsuario, String aDireccionUsuario, int aFormaPagoUsuario, String aFotoUsuario, boolean aEstadoCuenta) {
		throw new UnsupportedOperationException();
	}

	public void actualizas_datos_compra(String aDireccion, String aFormaPago, Cliente aCliente) {
		throw new UnsupportedOperationException();
	}
}