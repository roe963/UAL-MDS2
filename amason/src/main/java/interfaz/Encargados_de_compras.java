package interfaz;

import com.vaadin.flow.component.html.Label;

import bds.BDPrincipal;
import bds.iAdministrador;
import vistas.VistaEncargadosdecompras;

public class Encargados_de_compras extends VistaEncargadosdecompras {
	
	iAdministrador administrador = new BDPrincipal();
	
	public Encargados_de_compras(Agregar_empleado agregar_empleado) {
		modificar_usuario_encargado_compras(agregar_empleado);
	}
	
	public void modificar_usuario_encargado_compras(Agregar_empleado agregar_empleado) {
		
		basededatos.Encargado_compras[] encargadosCompras = administrador.cargar_empleados_encargado_compras();
		
		this.getLayoutEncargadosCompras().removeAll();
		if (encargadosCompras.length != 0) {
            for (int i = 0; i < encargadosCompras.length; i++) {
                this.getLayoutEncargadosCompras().add(new interfaz.Encargado_de_compras(encargadosCompras[i], agregar_empleado));
            }
        } else {
            Label titulo= new Label();
            titulo.setText("No hay encargados de compras en la BD");
            this.getLayoutEncargadosCompras().add(titulo);
        }
	}

//	public void cambiar_estado_usuario_encargado_compras() {
//		throw new UnsupportedOperationException();
//	}
}