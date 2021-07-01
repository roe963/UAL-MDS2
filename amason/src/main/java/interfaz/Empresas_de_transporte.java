package interfaz;

import com.vaadin.flow.component.html.Label;

import bds.BDPrincipal;
import bds.iAdministrador;
import vistas.VistaEmpresasdetransportes;

public class Empresas_de_transporte extends VistaEmpresasdetransportes {
	
	iAdministrador administrador = new BDPrincipal();
	
	public Empresas_de_transporte(Agregar_empleado agregar_empleado) {
		modificar_usuario_empresa_transportes(agregar_empleado);
	}
	
	public void modificar_usuario_empresa_transportes(Agregar_empleado agregar_empleado) {

		basededatos.Empresa_transportes[] empresaTransportes = administrador.cargar_empleados_empresa_transportes();
		
		this.getLayoutEmpresasTransportes().removeAll();
		if (empresaTransportes.length != 0) {
            for (int i = 0; i < empresaTransportes.length; i++) {
                this.getLayoutEmpresasTransportes().add(new interfaz.Empresa_de_transportes(empresaTransportes[i], agregar_empleado));
            }
        } else {
            Label titulo= new Label();
            titulo.setText("No hay empresas de transportes en la BD");
            this.getLayoutEmpresasTransportes().add(titulo);
        }
	}

//	public void cambiar_estado_usuario_empresa_transportes() {
//		throw new UnsupportedOperationException();
//	}
}