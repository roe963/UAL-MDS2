package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vista-productosdelpedido template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productosdelpedido")
@JsModule("./src/vista-productosdelpedido.js")
public class VistaProductosdelpedido extends PolymerTemplate<VistaProductosdelpedido.VistaProductosdelpedidoModel> {

    /**
     * Creates a new VistaProductosdelpedido.
     */
    public VistaProductosdelpedido() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductosdelpedido and vista-productosdelpedido
     */
    public interface VistaProductosdelpedidoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
