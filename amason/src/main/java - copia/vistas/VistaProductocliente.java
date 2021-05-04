package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-productocliente template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productocliente")
@JsModule("./src/vista-productocliente.js")
public class VistaProductocliente extends PolymerTemplate<VistaProductocliente.VistaProductoclienteModel> {

    /**
     * Creates a new VistaProductocliente.
     */
    public VistaProductocliente() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductocliente and vista-productocliente
     */
    public interface VistaProductoclienteModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
