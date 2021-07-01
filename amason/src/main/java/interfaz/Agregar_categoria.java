package interfaz;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;

import bds.BDPrincipal;
import bds.iAdministrador;
import vistas.VistaAgregarcategoria;

public class Agregar_categoria extends VistaAgregarcategoria {
	
	iAdministrador administrador = new BDPrincipal();
	
	public Agregar_categoria() {
		getTextFieldIdCategoria().setVisible(false);
				
		this.getButtonAnadir().addClickListener(event -> agregar_categoria());
	}
	
	public void agregar_categoria() {
		String nombre = getTextFieldNombre().getValue();
		if (nombre.isEmpty()) {
            new Notification("Nombre puede estar vacío", 3000, Position.MIDDLE).open();;
        } else {
            administrador.agregar_categoria(nombre);
            UI.getCurrent().navigate("");
            UI.getCurrent().navigate("administrar_categorias");
            new Notification(nombre + " añadida correctamente", 3000, Position.MIDDLE).open();;
        }
	}
	
}