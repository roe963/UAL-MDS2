package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-administrarproductos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-administrarproductos")
@JsModule("./src/vista-administrarproductos.js")
public class VistaAdministrarproductos extends PolymerTemplate<VistaAdministrarproductos.VistaAdministrarproductosModel> {

    /**
     * Creates a new VistaAdministrarproductos.
     */
    public VistaAdministrarproductos() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAdministrarproductos and vista-administrarproductos
     */
    public interface VistaAdministrarproductosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
