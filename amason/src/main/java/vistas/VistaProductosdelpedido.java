package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

import basededatos.Cantidad;

import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-productosdelpedido template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productosdelpedido")
@JsModule("./src/vista-productosdelpedido.js")
public class VistaProductosdelpedido extends PolymerTemplate<VistaProductosdelpedido.VistaProductosdelpedidoModel> {

    @Id("layout-productosdelpedido")
    private VerticalLayout productosDelPedido;

    public VerticalLayout getProductosDelPedido() {
        return productosDelPedido;
    }

    public void setProductosDelPedido(VerticalLayout productosDelPedido) {
        this.productosDelPedido = productosDelPedido;
    }

    /**
     * Creates a new VistaProductosdelpedido.
     */
    public VistaProductosdelpedido(Cantidad[] cantidades) {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductosdelpedido and vista-productosdelpedido
     */
    public interface VistaProductosdelpedidoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
