package interfaz;


import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.Shortcuts;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import basededatos.Oferta;
import bds.BDPrincipal;
import bds.iCliente;
import bds.iCorreo_personal;
import ual.mds2.ortegaortega.MenuHeader;
import ual.mds2.ortegaortega.Session;
import vistas.VistaVermensajesclienteregistrado;

@PreserveOnRefresh
@Route("ver_mensajes_cliente_registrado")
public class Ver_mensajes_cliente_registrado extends VistaVermensajesclienteregistrado {
	/*public Cliente_registrado _cliente_registrado;
	public Mensajes_cliente_registrado _mensajes_cliente_registrado;
	public Redactar _redactar;*/
		
	iCorreo_personal correo = new BDPrincipal();
	int idUsuario= Session.getUsuario().getId();
	
	public Ver_mensajes_cliente_registrado () {		
		//cargar el menú 
		MenuBar mb = MenuHeader.getMenuBar();
	    this.getLayoutMenu().add(mb);
	    this.getLayoutMenu().setHorizontalComponentAlignment(Alignment.CENTER, mb);
		
		cargar_mensajes_cliente();		
		
		this.getButtonRedactar().addClickListener(e->{
			redactar_mensaje();			
		});
		
	}
	
	
	public void cargar_mensajes_cliente() {
	
		basededatos.Mensaje[] mensajes = correo.cargar_mensajes_cliente(idUsuario);
		
		this.getVaadinVerticalLayout2().removeAll();
		
		if (mensajes.length != 0) {
			for (int i = 0; i < mensajes.length; i++) {
				this.getVaadinVerticalLayout2().add(new Mensaje(mensajes[i],i));
			}

		} else {
			Label titulo = new Label();
			titulo.setText("No hay Mensajes en la BD");
			this.getVaadinVerticalLayout2().add(titulo);
		}		
		
	}
	
	
	public void redactar_mensaje() {
		Dialog dialog = new Dialog();
		dialog.add(new Text("Escribe un Mensaje..."));
		dialog.setCloseOnEsc(false);
		dialog.setCloseOnOutsideClick(false);
		Span message = new Span();
		TextArea textarea= new TextArea();

		Button confirmButton = new Button("Enviar", event -> {
//		    message.setText("Confirmed!");
		    
		    
		    //Redactar mensaje 
		    if (!textarea.getValue().isEmpty()) {
	            correo.redactar_mensaje(idUsuario, textarea.getValue());
	            cargar_mensajes_cliente();
	            dialog.close();
		    }	else {
		        message.setText("El mensaje no puede estar vacío!");
		    }
		    
		});
		Button cancelButton = new Button("Cancel", event -> {
		    message.setText("Cancelled...");
		    dialog.close();
		});
		// Cancel action on ESC press
		Shortcuts.addShortcutListener(dialog, () -> {
		    message.setText("Cancelled...");
		    dialog.close();
		}, Key.ESCAPE);
		
		dialog.add(new Div(textarea));
		dialog.add(new Div( confirmButton, cancelButton));
		
		dialog.open();
	}
	
	
	
	
}