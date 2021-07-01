package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.select.Select;

import basededatos.BDPrincipal;
import basededatos.Categoria;
import basededatos.iAdministrador;
import vistas.VistaAgregarempleado;

public class Agregar_empleado extends VistaAgregarempleado {
	
	iAdministrador administrador = new BDPrincipal();
	
	Select<String> labelSelect = new Select<>();
	
	int tipoUsuario = 0;
	
	int idUsuario;

	public Agregar_empleado() {
		getTextFieldIdUsuario().setVisible(false);
		
		this.getLayoutSelectTipoUsuario().removeAll();
		///this.getSelectTipoUsuario().setItems("Tarjeta", "PayPal");
		labelSelect.setPlaceholder("Tipo usuario");
		labelSelect.setItems(new String[] { "Encargado de compras", "Empresa de transportes" });
		
		(this.getLayoutSelectTipoUsuario()).add(labelSelect);
		
		labelSelect.addValueChangeListener(
        event -> {
        	
        	if(event.getValue() == "Encargado de compras") {
        		tipoUsuario = 1;
    		}
    		if(event.getValue() == "Empresa de transportes") {
    			tipoUsuario = 2;
    		}
		});
		
		this.getButtonAnadir().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				agregar_usuario();
			}
		});
	}
	
	public void agregar_usuario() {
		String nombre = getTextFieldUsuario().getValue();
		String password = getTextFieldPassword().getValue();
		
		if (nombre.isEmpty() || password.isEmpty() || tipoUsuario == 0) {
		    new Notification("Usuario, contraseña y tipo de usuario no puede estar vacíos", 3000, Position.MIDDLE).open();;
		} else {
		    administrador.agregar_usuario(nombre, password, tipoUsuario);
            UI.getCurrent().navigate("");
            UI.getCurrent().navigate("administrar_empleados");
            new Notification(nombre + " añadido correctamente", 3000, Position.MIDDLE).open();;
		}
	}	
}