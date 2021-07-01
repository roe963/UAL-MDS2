package interfaz;

import com.vaadin.flow.component.UI;

import bds.BDPrincipal;
import bds.iAdministrador;
import vistas.VistaEmpresadetransportes;

public class Empresa_de_transportes extends VistaEmpresadetransportes {
	
    iAdministrador administrador = new BDPrincipal();
	
	public Empresa_de_transportes(basededatos.Empresa_transportes empresaTransportes, Agregar_empleado agregar_empleado) {
		
		basededatos.Empresa_transportes[] empresasTransportes = administrador.cargar_empleados_empresa_transportes();

        this.getLabelEmpresaTransportes().setText(empresaTransportes.getEmail().toString());
        this.getCheckboxEmpresaTransportes().setValue(empresaTransportes.getActivo());

        this.getLayoutEmpresaTransportes().addClickListener(event -> {

        	agregar_empleado.getTextFieldIdUsuario().setValue(String.valueOf(empresaTransportes.getId()));
        	agregar_empleado.getTextFieldUsuario().setValue(empresaTransportes.getEmail());
        	agregar_empleado.getTextFieldPassword().setValue(String.valueOf(empresaTransportes.getPassword()));
        	agregar_empleado.asignarUsuario("Empresa de transportes");
        });

        cambiar_estado_usuario_empresa_transportes(empresaTransportes);
	}
	
	
	
	public void cambiar_estado_usuario_empresa_transportes(basededatos.Empresa_transportes empresaTransportes) {
		this.getCheckboxEmpresaTransportes().addValueChangeListener(event -> {

            administrador.cambiar_estado_usuario_empresa_transportes(empresaTransportes.getId(), this.getCheckboxEmpresaTransportes().getValue());

            UI.getCurrent().navigate("");
            UI.getCurrent().navigate("administrar_empleados");
        });
	}
}