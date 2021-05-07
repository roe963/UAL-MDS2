package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-productodelpedido template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productodelpedido")
@JsModule("./src/vista-productodelpedido.js")
public class VistaProductodelpedido extends PolymerTemplate<VistaProductodelpedido.VistaProductodelpedidoModel> {

    /**
     * Creates a new VistaProductodelpedido.
     */
    public VistaProductodelpedido() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductodelpedido and vista-productodelpedido
     */
    public interface VistaProductodelpedidoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
