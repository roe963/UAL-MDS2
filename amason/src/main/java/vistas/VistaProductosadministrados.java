package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vista-productosadministrados template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productosadministrados")
@JsModule("./src/vista-productosadministrados.js")
public class VistaProductosadministrados extends PolymerTemplate<VistaProductosadministrados.VistaProductosadministradosModel> {

    /**
     * Creates a new VistaProductosadministrados.
     */
    public VistaProductosadministrados() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductosadministrados and vista-productosadministrados
     */
    public interface VistaProductosadministradosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
