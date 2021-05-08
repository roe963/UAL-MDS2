package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vista-mensaje template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-mensaje")
@JsModule("./src/vista-mensaje.js")
public class VistaMensaje extends PolymerTemplate<VistaMensaje.VistaMensajeModel> {

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
