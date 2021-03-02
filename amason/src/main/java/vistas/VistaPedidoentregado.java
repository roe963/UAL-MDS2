package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-pedidoentregado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pedidoentregado")
@JsModule("./src/vista-pedidoentregado.js")
public class VistaPedidoentregado extends PolymerTemplate<VistaPedidoentregado.VistaPedidoentregadoModel> {

    /**
     * Creates a new VistaPedidoentregado.
     */
    public VistaPedidoentregado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPedidoentregado and vista-pedidoentregado
     */
    public interface VistaPedidoentregadoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
