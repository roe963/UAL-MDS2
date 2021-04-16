package basededatos;

import java.util.Vector;
import basededatos.Cliente;

public class Clientes {
	public BDPrincipal _bdprincipal_clientes;
	public Vector<Cliente> _contiene_cliente = new Vector<Cliente>();

	public Usuario iniciar_sesion(String aMailUsuario) {
		throw new UnsupportedOperationException();
	}

	public String recuperarContrasena(String aMailUsuario) {
		throw new UnsupportedOperationException();
	}

	public void registrar_usuario(String aNombreUsuario, String aMailUsuario, String aPasswordUsuario, String aConfirmPasswordUsuario, String aDireccionUsuario, String aFormaPagoUsuario, String aFotoUsuario) {
		throw new UnsupportedOperationException();
	}

	public Usuario cargar_perfil(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void seleccionar_direccion_envio(String aDireccionUsuario) {
		throw new UnsupportedOperationException();
	}

	public void seleccionar_metodo_pago(String aMetodoPagoUsuario) {
		throw new UnsupportedOperationException();
	}

	public void validar_registro() {
		throw new UnsupportedOperationException();
	}

	public void guardar_perfil(String aNombreUsuario, String aMailUsuario, String aDireccionUsuario, String aFormaPagoUsuario, String aFotoUsuario, boolean aEstadoCuenta) {
		throw new UnsupportedOperationException();
	}
}