package interfaz;

import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;

import basededatos.BDPrincipal;
import basededatos.iIniciar_sesion;
import vistas.VistaRecuperarcontrasena;

public class Recuperar_contrasena extends VistaRecuperarcontrasena {
	
    iIniciar_sesion bd = new BDPrincipal();
    
	public Recuperar_contrasena(Dialog dd) {
	    
	    this.getBtnRecuperar().addClickListener(event -> {
	        if (bd.recuperar_contrasena(this.getInputUser().getValue())) {
	            new Notification("Se le ha enviado un correo con un enlace de recuperación", 2000, Position.MIDDLE).open();
                dd.close();
	        } else {
	            new Notification(this.getInputUser().getValue()
	                    + " no está registrado", 2000, Position.MIDDLE).open();
	        }
	    });
	}
	
}