package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-pedidosenviados template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pedidosenviados")
@JsModule("./src/vista-pedidosenviados.js")
public class VistaPedidosenviados extends PolymerTemplate<VistaPedidosenviados.VistaPedidosenviadosModel> {

    @Id("layout-pedidos-enviados")
    private VerticalLayout layoutPedidosEnviados;

    public VerticalLayout getLayoutPedidosEnviados() {
        return layoutPedidosEnviados;
    }

    public void setLayoutPedidosEnviados(VerticalLayout layoutPedidosEnviados) {
        this.layoutPedidosEnviados = layoutPedidosEnviados;
    }

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
