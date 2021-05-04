package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-verpedido template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-verpedido")
@JsModule("./src/vista-verpedido.js")
public class VistaVerpedido extends PolymerTemplate<VistaVerpedido.VistaVerpedidoModel> {

    /**
     * Creates a new VistaVerpedido.
     */
    public VistaVerpedido() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVerpedido and vista-verpedido
     */
    public interface VistaVerpedidoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
