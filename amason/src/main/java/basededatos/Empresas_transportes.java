package basededatos;

import java.util.ArrayList;
// import basededatos.Empresa_transportes;
// import interfaz.Empresa_transportes;

public class Empresas_transportes {
	public BDPrincipal _bdprincipal_empresas_trasnportes;
	public ArrayList<basededatos.Empresa_transportes> _contiene_empresa_transportes = new ArrayList<Empresa_transportes>();

	public Usuario iniciar_sesion(String aMailUsuario, String aPasswordUsuario) {
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

	public boolean modificar_usuario_empresa_transportes(String aNombreUsuarioEmpresaTransportes, Object aPasswordUsuarioEmpresaTransportes) {
		throw new UnsupportedOperationException();
	}

	public basededatos.Empresa_transportes[] cargar_empresas_transportes() {
		throw new UnsupportedOperationException();
	}

	public boolean cambiar_estado_usaurio(int aIdUsuario, boolean aActivo) {
		throw new UnsupportedOperationException();
	}
}