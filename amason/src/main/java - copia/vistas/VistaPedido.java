package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-pedido template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pedido")
@JsModule("./src/vista-pedido.js")
public class VistaPedido extends PolymerTemplate<VistaPedido.VistaPedidoModel> {

    /**
     * Creates a new VistaPedido.
     */
    public VistaPedido() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPedido and vista-pedido
     */
    public interface VistaPedidoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
