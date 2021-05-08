package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vista-productosdelcarrito template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productosdelcarrito")
@JsModule("./src/vista-productosdelcarrito.js")
public class VistaProductosdelcarrito extends PolymerTemplate<VistaProductosdelcarrito.VistaProductosdelcarritoModel> {

    /**
     * Creates a new VistaProductosdelcarrito.
     */
    public VistaProductosdelcarrito() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductosdelcarrito and vista-productosdelcarrito
     */
    public interface VistaProductosdelcarritoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
