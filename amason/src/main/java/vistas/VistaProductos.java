package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-productos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productos")
@JsModule("./src/vista-productos.js")
public class VistaProductos extends PolymerTemplate<VistaProductos.VistaProductosModel> {

    /**
     * Creates a new VistaProductos.
     */
    public VistaProductos() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductos and vista-productos
     */
    public interface VistaProductosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
