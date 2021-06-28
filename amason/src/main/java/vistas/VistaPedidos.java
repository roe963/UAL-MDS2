package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-pedidos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pedidos")
@JsModule("./src/vista-pedidos.js")
public class VistaPedidos extends PolymerTemplate<VistaPedidos.VistaPedidosModel> {

    @Id("layout-pedidos")
    private VerticalLayout layoutPedidos;

    public VerticalLayout getLayoutPedidos() {
        return layoutPedidos;
    }

    public void setLayoutPedidos(VerticalLayout layoutPedidos) {
        this.layoutPedidos = layoutPedidos;
    }

    /**
     * Creates a new VistaPedidos.
     */
    public VistaPedidos() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPedidos and vista-pedidos
     */
    public interface VistaPedidosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
