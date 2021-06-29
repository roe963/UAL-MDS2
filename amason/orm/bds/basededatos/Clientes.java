package basededatos;

import java.util.Vector;
import basededatos.Cliente;

public class Clientes {
	public BDPrincipal _bdprincipal_clientes;
	public Vector<Cliente> _contiene_cliente = new Vector<Cliente>();

	public Usuario iniciar_sesion_cliente(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public String recuperar_contrasena(String aMailUsuario) {
		throw new UnsupportedOperationException();
	}

	public void registrar_usuario(String aNombreUsuario, String aMailUsuario, String aPasswordUsuario, String aConfirmPasswordUsuario, String aDireccionUsuario, String aFormaPagoUsuario, String aFotoUsuario) {
		throw new UnsupportedOperationException();
	}

	public Cliente cargar_perfil(int aIdUsuario) {
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

	public void guardar_perfil(int aIdUsuario, String aNombreUsuario, String aMailUsuario, String aDireccionUsuario, String aFormaPagoUsuario, String aFotoUsuario, boolean aEstadoCuenta) {
		throw new UnsupportedOperationException();
	}

	public void actualizas_datos_compra(String aDireccion, String aFormaPago, Cliente aCliente) {
		throw new UnsupportedOperationException();
	}
}