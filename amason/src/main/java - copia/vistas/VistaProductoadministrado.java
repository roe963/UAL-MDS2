package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-productoadministrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productoadministrado")
@JsModule("./src/vista-productoadministrado.js")
public class VistaProductoadministrado extends PolymerTemplate<VistaProductoadministrado.VistaProductoadministradoModel> {

    /**
     * Creates a new VistaProductoadministrado.
     */
    public VistaProductoadministrado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductoadministrado and vista-productoadministrado
     */
    public interface VistaProductoadministradoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
