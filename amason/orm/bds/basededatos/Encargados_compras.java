package basededatos;

import java.util.Vector;
// import basededatos.Encargado_compras;
// import interfaz.Encargado_compras;

public class Encargados_compras {
	public BDPrincipal _bdprincipal_encargados_compras;
	public Vector<basededatos.Encargado_compras> _contiene_encargado_compras = new Vector<Encargado_compras>();

	public Usuario iniciar_sesion_encargado_compras(int aIsUsuario) {
		throw new UnsupportedOperationException();
	}

	public String recuperar_contrasena(String aMailUsuario) {
		throw new UnsupportedOperationException();
	}

	public interfaz.Encargado_compras[] cargar_empleados_encargado_compras() {
		throw new UnsupportedOperationException();
	}

	public boolean modificar_usuario_encargado_compras(int aIdUsuarioEncargadoCompras, String aNombreUsuarioEncargadoCompras, String aPasswordUsuarioEncargadoCompras) {
		throw new UnsupportedOperationException();
	}

	public boolean cambiar_estado_usuario_encargado_compras(int aIdUsuario, boolean aActivo) {
		throw new UnsupportedOperationException();
	}

	public boolean agregar_usuario(String aNombreUsuarioEncargadoCompras, String aPasswordUsuarioEncargadoCompras) {
		throw new UnsupportedOperationException();
	}
}