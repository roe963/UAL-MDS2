package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-pedidospendientes template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pedidospendientes")
@JsModule("./src/vista-pedidospendientes.js")
public class VistaPedidospendientes extends PolymerTemplate<VistaPedidospendientes.VistaPedidospendientesModel> {

    @Id("layout-pedidos-pendinetes")
    private VerticalLayout layoutPedidosPendinetes;

    public VerticalLayout getLayoutPedidosPendinetes() {
        return layoutPedidosPendinetes;
    }

    public void setLayoutPedidosPendinetes(VerticalLayout layoutPedidosPendinetes) {
        this.layoutPedidosPendinetes = layoutPedidosPendinetes;
    }

    /**
     * Creates a new VistaPedidospendientes.
     */
    public VistaPedidospendientes() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPedidospendientes and vista-pedidospendientes
     */
    public interface VistaPedidospendientesModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
