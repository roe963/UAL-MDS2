package interfaz;

import com.vaadin.flow.component.UI;

import bds.BDPrincipal;
import bds.iAdministrador;
import vistas.VistaEncargadodecompras;

public class Encargado_de_compras extends VistaEncargadodecompras {
	
    iAdministrador administrador = new BDPrincipal();
	
	public Encargado_de_compras(basededatos.Encargado_compras encargadoCompras, Agregar_empleado agregar_empleado) {

		basededatos.Encargado_compras[] encargadosCompras = administrador.cargar_empleados_encargado_compras();

        this.getLabelEncargadoCompras().setText(encargadoCompras.getEmail().toString());
        this.getCheckboxActivarEncargadoCompras().setValue(encargadoCompras.getActivo());

        this.getLayoutEncargadoCompras().addClickListener(event -> {

        	agregar_empleado.getTextFieldIdUsuario().setValue(String.valueOf(encargadoCompras.getId()));
        	agregar_empleado.getTextFieldUsuario().setValue(encargadoCompras.getEmail());
        	agregar_empleado.getTextFieldPassword().setValue(String.valueOf(encargadoCompras.getPassword()));
        	agregar_empleado.asignarUsuario("Encargado de compras");
        });

        cambiar_estado_usuario_encargado_compras(encargadoCompras);
	}
	
	public void cambiar_estado_usuario_encargado_compras(basededatos.Encargado_compras encargadoCompras) {
		this.getCheckboxActivarEncargadoCompras().addValueChangeListener(event -> {

            administrador.cambiar_estado_usuario_encargado_compras(encargadoCompras.getId(), this.getCheckboxActivarEncargadoCompras().getValue());

            UI.getCurrent().navigate("");
            UI.getCurrent().navigate("administrar_empleados");
        });
	}
}