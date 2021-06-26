package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-respuesta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-respuesta")
@JsModule("./src/vista-respuesta.js")
public class VistaRespuesta extends PolymerTemplate<VistaRespuesta.VistaRespuestaModel> {
	
	
	
    @Id("h-respuesta")
	private H4 hRespuesta;
	@Id("label-mensaje")
	private Label labelMensaje;
	
	

	public H4 gethRespuesta() {
		return hRespuesta;
	}

	public void sethRespuesta(H4 hRespuesta) {
		this.hRespuesta = hRespuesta;
	}

	public Label getLabelMensaje() {
		return labelMensaje;
	}

	public void setLabelMensaje(Label labelMensaje) {
		this.labelMensaje = labelMensaje;
	}

	/**
     * Creates a new VistaRespuesta.
     */
    public VistaRespuesta() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaRespuesta and vista-respuesta
     */
    public interface VistaRespuestaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
