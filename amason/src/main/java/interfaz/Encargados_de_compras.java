package interfaz;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaEncargadosdecompras;

public class Encargados_de_compras extends VistaEncargadosdecompras {
	
	iAdministrador administrador = new BDPrincipal();
	
	Agregar_empleado ae;
	
	public Encargados_de_compras(Agregar_empleado agregar_empleado) {
	    ae = agregar_empleado;
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
	
	public void modificar_usuario_encargado_compras() {
	    String nombre = ae.getTextFieldUsuario().getValue();
        String password = ae.getTextFieldPassword().getValue();
        Integer idUsuario = null;
        
        try {
            idUsuario = Integer.parseInt(ae.getTextFieldUsuario().getValue());
        } catch(Exception e) {
            
        }
        
        if (nombre.isEmpty() || password.isEmpty() || idUsuario == null) {
            new Notification("Usuario, contraseña y tipo de usuario no puede estar vacíos", 3000, Position.MIDDLE).open();;
        } else {
            administrador.modificar_usuario_encargado_compras((int)idUsuario, nombre, password);
            UI.getCurrent().navigate("");
            UI.getCurrent().navigate("administrar_empleados");
            new Notification(nombre + " añadido correctamente", 3000, Position.MIDDLE).open();;
        }
		
	}
}