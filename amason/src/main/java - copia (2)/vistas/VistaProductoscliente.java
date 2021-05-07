package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-productoscliente template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productoscliente")
@JsModule("./src/vista-productoscliente.js")
public class VistaProductoscliente extends PolymerTemplate<VistaProductoscliente.VistaProductosclienteModel> {

    /**
     * Creates a new VistaProductoscliente.
     */
    public VistaProductoscliente() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductoscliente and vista-productoscliente
     */
    public interface VistaProductosclienteModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
