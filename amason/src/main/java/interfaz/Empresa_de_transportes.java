package interfaz;

import com.vaadin.flow.component.UI;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaEmpresadetransportes;

public class Empresa_de_transportes extends VistaEmpresadetransportes {

    iAdministrador administrador = new BDPrincipal();
    basededatos.Empresa_transportes empresaTransportes;
    public Empresa_de_transportes(basededatos.Empresa_transportes empresaTransportes, Agregar_empleado agregar_empleado) {
    	
    	this.empresaTransportes = empresaTransportes;
        basededatos.Empresa_transportes[] empresasTransportes = administrador.cargar_empleados_empresa_transportes();

        this.getLabelEmpresaTransportes().setText(empresaTransportes.getEmail().toString());
        this.getCheckboxEmpresaTransportes().setValue(empresaTransportes.getActivo());

        this.getLayoutEmpresaTransportes().addClickListener(event -> {

            agregar_empleado.getTextFieldIdUsuario().setValue(String.valueOf(empresaTransportes.getId()));
            agregar_empleado.getTextFieldUsuario().setValue(empresaTransportes.getEmail());
            agregar_empleado.getTextFieldPassword().setValue(String.valueOf(empresaTransportes.getPassword()));
            //agregar_empleado.getSelectTipoUsuario().setValue(empresaTransportes);
            agregar_empleado.labelSelect.setValue("Empresa de transportes");
        });
        
        this.getCheckboxEmpresaTransportes().addValueChangeListener(event -> {

            cambiar_estado_usuario_empresa_transportes();

            UI.getCurrent().navigate("");
            UI.getCurrent().navigate("administrar_empleados");
        });
    }

    public void cambiar_estado_usuario_empresa_transportes() {

        administrador.cambiar_estado_usuario_empresa_transportes(empresaTransportes.getId(),
                this.getCheckboxEmpresaTransportes().getValue());
    }
}