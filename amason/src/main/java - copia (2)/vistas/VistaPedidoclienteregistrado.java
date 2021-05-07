package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-pedidoclienteregistrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pedidoclienteregistrado")
@JsModule("./src/vista-pedidoclienteregistrado.js")
public class VistaPedidoclienteregistrado extends PolymerTemplate<VistaPedidoclienteregistrado.VistaPedidoclienteregistradoModel> {

    /**
     * Creates a new VistaPedidoclienteregistrado.
     */
    public VistaPedidoclienteregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPedidoclienteregistrado and vista-pedidoclienteregistrado
     */
    public interface VistaPedidoclienteregistradoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
