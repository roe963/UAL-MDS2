package interfaz;

import javax.management.remote.TargetedNotification;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.radiobutton.RadioGroupVariant;

import basededatos.Cliente;
import bds.BDPrincipal;
import bds.iCliente_registrado;
import ual.mds2.ortegaortega.ViewChanger;
import vistas.VistaVeperfil;

public class Ver_perfil extends VistaVeperfil {
	/*
	 * private label _nombre; private textField _nombreUsuario; private label _mail;
	 * private textField _mailUsuario; private label _direccion; private textField
	 * _direccionUsuario; private label _formaPago; private comboBox
	 * _formaPagoUsuario; private label _foto; private image _fotoUsuario; private
	 * textField _nombreFotoUsuario; private label _estado; private radioButton
	 * _estadoCuenta; private button _guardar; public Cliente_registrado
	 * _cliente_registrado; public Datos_de_compra _datos_de_compra;
	 */

	iCliente_registrado iclientes_registrado = new BDPrincipal();

	public Ver_perfil() {
		cargar_perfil();

	}

	public void guardar_perfil() {
		throw new UnsupportedOperationException();
	}

	/*public void seleccionar_direccion_envio() {
		throw new UnsupportedOperationException();
	}

	public void seleccionar_metodo_pago() {
		throw new UnsupportedOperationException();
	}*/

	public void cargar_perfil() {
		
		int id = ViewChanger.getIdUsuario();
		
		System.out.println(id);
		
		Cliente cliente = iclientes_registrado.cargar_perfil(id);

		//1)Crear componente para el Frontend
		this.getVlEstado().removeAll();;
		RadioButtonGroup<String> radioGroup = new RadioButtonGroup<>();
		radioGroup.setLabel("Estado");
		radioGroup.setItems("Operativo", "No Operativo");
		radioGroup.addThemeVariants(RadioGroupVariant.LUMO_VERTICAL);
		if (cliente.getActivo() == true) {
			radioGroup.setValue("Operativo");
		}
		if (cliente.getActivo() == false) {
			radioGroup.setValue("No Operativo");
		}	
		
		this.getVlEstado().add(radioGroup);
		
		this.getVlDireccionyformaPago().removeAll();
		Datos_de_compra datosCompra = new Datos_de_compra(cliente.getDireccionEnvio(),cliente.getMetodoPago());
		this.getVlDireccionyformaPago().add(datosCompra);
		
		
		//2) Cargar los nombres en el componente

		this.getTextfieldNombre().setValue(cliente.getNombre());
		this.getCorreoElectrónico().setValue(cliente.getEmail());
		this.getImgFotousuario().setSrc(cliente.getFotoURL());
		
		if( cliente.getFotoURL() == null ) {//si no tiene ninguna imagen poner esta por defecto
			this.getImgFotousuario().setMaxHeight("30%");
			this.getImgFotousuario().setMaxWidth("30%");
			this.getImgFotousuario().setSrc("https://static.vecteezy.com/system/resources/previews/000/550/731/non_2x/user-icon-vector.jpg");	
			this.getTextfieldFotousuario().setValue("https://static.vecteezy.com/system/resources/previews/000/550/731/non_2x/user-icon-vector.jpg");

		}else {//carga la foto de la BD			
			this.getImgFotousuario().setMaxHeight("30%");
			this.getImgFotousuario().setMaxWidth("30%");
			this.getImgFotousuario().setSrc(cliente.getFotoURL());	
			this.getTextfieldFotousuario().setValue(cliente.getFotoURL());
		}		
		
		
		this.getButtonGuardar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				
				String nombre= getTextfieldNombre().getValue();
				String email= getCorreoElectrónico().getValue();	
				String direccion=datosCompra.getTextfieldDireccion().getValue();
				String formaDePago=datosCompra.labelSelect.getValue();

				String url= getTextfieldFotousuario().getValue();				

				Boolean estado= false;					
				
				if (radioGroup.getValue().equals("Operativo")) {
					estado=true;
				}
				if (radioGroup.getValue().equals("No Operativo")) {
					estado=false;
				}				
						
				
				iclientes_registrado.guardar_perfil(cliente.getId(), nombre, email, direccion, formaDePago, url, estado);
				cargar_perfil();
				
				notificacion();
				
			}
		});



	}
	
	public void notificacion() {
		Span content = new Span("Los datos se han modificado correctamente!");
		Notification notification = new Notification(content);
		notification.setPosition(Position.MIDDLE);
		notification.setDuration(2000);
		notification.open();
	}

}