package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-verpedidos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-verpedidos")
@JsModule("./src/vista-verpedidos.js")
public class VistaVerpedidos extends PolymerTemplate<VistaVerpedidos.VistaVerpedidosModel> {

    /**
     * Creates a new VistaVerpedidos.
     */
    public VistaVerpedidos() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVerpedidos and vista-verpedidos
     */
    public interface VistaVerpedidosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
