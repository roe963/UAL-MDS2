package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

import basededatos.BDPrincipal;
import basededatos.iCliente;
import vistas.VistaRegistrarse;

@PreserveOnRefresh
@Route("registrar")
public class Registrarse extends VistaRegistrarse {

	iCliente cliente = new BDPrincipal();
	Select<String> labelSelect = new Select<>();

	// Constructor
	@SuppressWarnings("unchecked")
	public Registrarse() {

	    labelSelect.setItems("PayPal", "Tarjeta");
        labelSelect.setValue("Con Tarjeta");
        labelSelect.setLabel("Forma de pago");
        this.getVaadinHorizontalLayout1().add(labelSelect);

		this.getButtonCrearcuenta().addClickListener(event -> registrar_usuario());
	}

	public void registrar_usuario() {

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

		if (passwordUsuario.equals(confirmPasswordUsuario)) {
			// Llamar a la base de datos principal y en el se encuentran las interfaces
			cliente.registrar_usuario(nombreUsuario, mailUsuario, passwordUsuario, confirmPasswordUsuario,
					direccionUsuario, formaPagoUsuario, fotoUsuario);
			new Notification("Usauario creado correctamente", 3000, Position.MIDDLE).open();
			UI.getCurrent().navigate("cliente");
		} else {
			new Notification("¡La contraseña no coincide!", 3000, Position.MIDDLE).open();
		}
	}

}
