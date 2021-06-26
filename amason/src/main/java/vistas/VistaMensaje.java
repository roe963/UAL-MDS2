package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-mensaje template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-mensaje")
@JsModule("./src/vista-mensaje.js")
public class VistaMensaje extends PolymerTemplate<VistaMensaje.VistaMensajeModel> {

    @Id("label-mensaje")
	private Label labelMensaje;
	@Id("button-vermensaje")
	private Button buttonVermensaje;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("label-usuario")
	private Label labelUsuario;

	
	
	public Label getLabelMensaje() {
		return labelMensaje;
	}

	public void setLabelMensaje(Label labelMensaje) {
		this.labelMensaje = labelMensaje;
	}

	public Button getButtonVermensaje() {
		return buttonVermensaje;
	}

	public void setButtonVermensaje(Button buttonVermensaje) {
		this.buttonVermensaje = buttonVermensaje;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Label getLabelUsuario() {
		return labelUsuario;
	}

	public void setLabelUsuario(Label labelUsuario) {
		this.labelUsuario = labelUsuario;
	}

	/**
     * Creates a new VistaMensaje.
     */
    public VistaMensaje() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaMensaje and vista-mensaje
     */
    public interface VistaMensajeModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
