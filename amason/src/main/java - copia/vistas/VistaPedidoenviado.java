package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-pedidoenviado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pedidoenviado")
@JsModule("./src/vista-pedidoenviado.js")
public class VistaPedidoenviado extends PolymerTemplate<VistaPedidoenviado.VistaPedidoenviadoModel> {

    /**
     * Creates a new VistaPedidoenviado.
     */
    public VistaPedidoenviado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPedidoenviado and vista-pedidoenviado
     */
    public interface VistaPedidoenviadoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}