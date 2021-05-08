package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vista-responder template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-responder")
@JsModule("./src/vista-responder.js")
public class VistaResponder extends PolymerTemplate<VistaResponder.VistaResponderModel> {

    /**
     * Creates a new VistaResponder.
     */
    public VistaResponder() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaResponder and vista-responder
     */
    public interface VistaResponderModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
