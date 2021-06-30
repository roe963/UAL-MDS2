package interfaz;

import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import vistas.VistaAdministrarempleados;

@PreserveOnRefresh
@Route("administrar_empleados")
public class Administrar_empleados extends VistaAdministrarempleados {
	/*private label _nombre;
	private textField _buscarUsuario;
	private button _guardarUsuario;
	public Administrador _administrador;
	public Agregar_empleado _agregar_empleado;
	public Empresas_de_transporte _empresas_de_transporte;
	public Encargados_de_compras _encargados_de_compras;*/

	public void cargar_empleados() {
		throw new UnsupportedOperationException();
	}

	public void agregar_usuario() {
		throw new UnsupportedOperationException();
	}

	public void modificar_usuario() {
		throw new UnsupportedOperationException();
	}

	public void cambiar_estado_usaurio() {
		throw new UnsupportedOperationException();
	}
}