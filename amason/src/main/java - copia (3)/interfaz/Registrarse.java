package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.router.RouterLink;

import bds.BDPrincipal;
import bds.iCliente;
import vistas.VistaRegistrarse;

public class Registrarse extends VistaRegistrarse{
	
	iCliente cliente = new BDPrincipal();
	Select<String> labelSelect = new Select<>();
	
	// Constructor
	@SuppressWarnings("unchecked")
	public Registrarse() {

	
		cargarComponentes();
		
		
		this.getButtonCrearcuenta().addClickListener(new ComponentEventListener() {			 
			@Override
			public void onComponentEvent(ComponentEvent event) {
				validar_registro();
			}
		});
		
	}
	
	
	void cargarComponentes() {
		//carga el select
		labelSelect.setItems("Con Tarjeta", "Bizum");
		labelSelect.setValue("Con Tarjeta");
		labelSelect.setLabel("Forma de pago");		
		this.getVaadinHorizontalLayout1().add(labelSelect);
		//carga la imagen
		this.getImgFotousaurio().setMaxHeight("100px");
		this.getImgFotousaurio().setMaxHeight("100px");
		this.getImgFotousaurio().setSrc("https://www.ibei.org/images/4611/person_box.png");
		
	}
	
	public void validar_registro() {
		
		String nombreUsuario = getTextareaNombre().getValue();
		String mailUsuario = getTextareaEmail().getValue();
		String passwordUsuario = getPassword().getValue();
		String confirmPasswordUsuario = getRepeatpassword().getValue();
		String direccionUsuario = getTextareaDireccion().getValue();
		String formaPagoUsuario = labelSelect.getValue();		
		String fotoUsuario = getTextareaFotousuario().getValue();
		
		System.out.println(nombreUsuario);
		System.out.println(mailUsuario);
		System.out.println(passwordUsuario);
		System.out.println(confirmPasswordUsuario);
		System.out.println(direccionUsuario);
		System.out.println(formaPagoUsuario);
		System.out.println(fotoUsuario);
		
		
		if(passwordUsuario.equals(confirmPasswordUsuario)) {
		//Llamar a la base de datos principal y en el se encuentran las interfaces
			cliente.registrar_usuario(nombreUsuario, mailUsuario, passwordUsuario, confirmPasswordUsuario, direccionUsuario, formaPagoUsuario, fotoUsuario);
			Notification.show("Se ha creado el usauario correctamente.",2000,Position.BOTTOM_CENTER);
			
		} else {
			Notification.show("¡La contraseñas no Coincide!",2000,Position.BOTTOM_CENTER);
		}
		
		
	}
	
}
