package basededatos;

import java.util.Vector;
// import basededatos.Empresa_transportes;
// import interfaz.Empresa_transportes;

public class Empresas_transportes {
	public BDPrincipal _bdprincipal_empresas_trasnportes;
	public Vector<basededatos.Empresa_transportes> _contiene_empresa_transportes = new Vector<Empresa_transportes>();

	public Usuario iniciar_sesion_empresa_transportes(int aIsUsuario) {
		throw new UnsupportedOperationException();
	}

	public String recuperar_contrasena(String aMailUsuario) {
		throw new UnsupportedOperationException();
	}

	public boolean agregar_usuario(String aNombreUsuarioEmpresaTransportes, String aPasswordUsuarioEmpresaTransportes) {
		throw new UnsupportedOperationException();
	}

	public interfaz.Empresa_transportes[] cargar_empleados_empresa_transportes() {
		throw new UnsupportedOperationException();
	}

	public boolean modificar_usuario_empresa_transportes(int aIdUsuarioEmpresaTransportes, String aNombreUsuarioEmpresaTransportes, String aPasswordUsuarioEmpresaTransportes) {
		throw new UnsupportedOperationException();
	}

	public basededatos.Empresa_transportes[] cargar_empresas_transportes() {
		throw new UnsupportedOperationException();
	}

	public boolean cambiar_estado_usaurio_empresa_transportes(int aIdUsuario, boolean aActivo) {
		throw new UnsupportedOperationException();
	}
}