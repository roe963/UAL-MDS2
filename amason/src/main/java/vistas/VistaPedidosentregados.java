package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-pedidosentregados template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pedidosentregados")
@JsModule("./src/vista-pedidosentregados.js")
public class VistaPedidosentregados extends PolymerTemplate<VistaPedidosentregados.VistaPedidosentregadosModel> {

    @Id("layout-pedidos-entregados")
    private VerticalLayout layoutPedidosEntregados;

    public VerticalLayout getLayoutPedidosEntregados() {
        return layoutPedidosEntregados;
    }

    public void setLayoutPedidosEntregados(VerticalLayout layoutPedidosEntregados) {
        this.layoutPedidosEntregados = layoutPedidosEntregados;
    }

    /**
     * Creates a new VistaPedidosentregados.
     */
    public VistaPedidosentregados() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPedidosentregados and vista-pedidosentregados
     */
    public interface VistaPedidosentregadosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
