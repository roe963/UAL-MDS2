package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-pedidosenviados template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pedidosenviados")
@JsModule("./src/vista-pedidosenviados.js")
public class VistaPedidosenviados extends PolymerTemplate<VistaPedidosenviados.VistaPedidosenviadosModel> {

    /**
     * Creates a new VistaPedidosenviados.
     */
    public VistaPedidosenviados() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPedidosenviados and vista-pedidosenviados
     */
    public interface VistaPedidosenviadosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}