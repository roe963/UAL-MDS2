package interfaz;

import com.vaadin.flow.component.UI;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaEncargadodecompras;

public class Encargado_de_compras extends VistaEncargadodecompras {

    iAdministrador administrador = new BDPrincipal();
    basededatos.Encargado_compras encargadoCompras;
    public Encargado_de_compras(basededatos.Encargado_compras encargadoCompras, Agregar_empleado agregar_empleado) {

        this.encargadoCompras = encargadoCompras;
        basededatos.Encargado_compras[] encargadosCompras = administrador.cargar_empleados_encargado_compras();

        this.getLabelEncargadoCompras().setText(encargadoCompras.getEmail().toString());
        this.getCheckboxActivarEncargadoCompras().setValue(encargadoCompras.getActivo());

        this.getLayoutEncargadoCompras().addClickListener(event -> {

            agregar_empleado.getTextFieldIdUsuario().setValue(String.valueOf(encargadoCompras.getId()));
            agregar_empleado.getTextFieldUsuario().setValue(encargadoCompras.getEmail());
            agregar_empleado.getTextFieldPassword().setValue(String.valueOf(encargadoCompras.getPassword()));
            //agregar_empleado.getSelectTipoUsuario().setValue(encargadoCompras);
            agregar_empleado.labelSelect.setValue("Encargado de compras");
        });

        this.getCheckboxActivarEncargadoCompras().addValueChangeListener(event -> {

            cambiar_estado_usuario_encargado_compras();

            UI.getCurrent().navigate("");
            UI.getCurrent().navigate("administrar_empleados");
        });
    }

    public void cambiar_estado_usuario_encargado_compras() {
    	
        administrador.cambiar_estado_usuario_encargado_compras(encargadoCompras.getId(),
                this.getCheckboxActivarEncargadoCompras().getValue());
    }
}