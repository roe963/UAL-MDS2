package interfaz;

import java.util.Vector;

import org.hibernate.PersistentObjectException;
import org.orm.PersistentException;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.Shortcuts;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.OptionalParameter;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import basededatos.Producto;
import bds.BDPrincipal;
import bds.iCliente;
import bds.iCorreo_personal;
import interfaz.Respuesta;
import ual.mds2.ortegaortega.MenuHeader;
import ual.mds2.ortegaortega.Session;
import vistas.VistaRespuestas;

import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.OptionalParameter;

@PreserveOnRefresh
@Route("respuestas")
public class Respuestas extends VistaRespuestas implements HasUrlParameter<String>  {
	public Ver_respuestas _ver_respuestas;
	public Vector<Respuesta> _respuesta = new Vector<Respuesta>();
	int idUsuario= Session.getUsuario().getId();
	
	iCorreo_personal icorreo = new BDPrincipal();
	public static int parametro=0; 
	
	basededatos.Respuesta[] respuestas;
	
	@Override
    public void setParameter(BeforeEvent event, @OptionalParameter String parameter) {
        try {
        	parametro = Integer.parseInt(parameter);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (PersistentObjectException e) {
            e.printStackTrace();
        }
    }
	
	
	
	public Respuestas() {
		//cargar el menú 
		MenuBar mb = MenuHeader.getMenuBar();
		this.getLayoutMenu().add(mb);
		this.getLayoutMenu().setHorizontalComponentAlignment(Alignment.CENTER, mb);
		
		this.getVaadinVerticalLayout().removeAll();

        respuestas = icorreo.cargar_respuestas_mensaje(parametro);

        if (respuestas.length != 0) {
            for (int i = 0; i < respuestas.length; i++) {
                this.getVaadinVerticalLayout().add(new interfaz.Respuesta(respuestas[i]));
            }

        } else {
            Label titulo = new Label();
            titulo.setText("No hay respuesta en la BD");
            this.getVaadinVerticalLayout().add(titulo);
        }

        this.gethMensaje().setText("Mensaje");
		
		this.getButtonResponder().addClickListener(e->{
			responder_respuesta();			
		});
		
	}


	private void responder_respuesta() {
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
		        icorreo.responder_respuesta(parametro, textarea.getValue());
		        UI.getCurrent().navigate("respuestas/" +parametro); 
                dialog.close();
            }   else {
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