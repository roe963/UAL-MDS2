package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-pedidopendiente template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pedidopendiente")
@JsModule("./src/vista-pedidopendiente.js")
public class VistaPedidopendiente extends PolymerTemplate<VistaPedidopendiente.VistaPedidopendienteModel> {

    /**
     * Creates a new VistaPedidopendiente.
     */
    public VistaPedidopendiente() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPedidopendiente and vista-pedidopendiente
     */
    public interface VistaPedidopendienteModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
