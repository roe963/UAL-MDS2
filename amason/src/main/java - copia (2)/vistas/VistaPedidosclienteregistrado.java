package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-pedidosclienteregistrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pedidosclienteregistrado")
@JsModule("./src/vista-pedidosclienteregistrado.js")
public class VistaPedidosclienteregistrado extends PolymerTemplate<VistaPedidosclienteregistrado.VistaPedidosclienteregistradoModel> {

    /**
     * Creates a new VistaPedidosclienteregistrado.
     */
    public VistaPedidosclienteregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPedidosclienteregistrado and vista-pedidosclienteregistrado
     */
    public interface VistaPedidosclienteregistradoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
