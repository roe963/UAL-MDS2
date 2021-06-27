package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-carrito template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-carrito")
@JsModule("./src/vista-carrito.js")
public class VistaCarrito extends PolymerTemplate<VistaCarrito.VistaCarritoModel> {

    //////Barra Navegacion /////
    @Id("layout-menu")
    private VerticalLayout layoutMenu;
    
    public VerticalLayout getLayoutMenu() {
        return layoutMenu;
    }

    public void setLayoutMenu(VerticalLayout layoutMenu) {
        this.layoutMenu = layoutMenu;
    }
    //////Barra Navegacion /////

	@Id("lbl-precio-carrito")
	private Label precioCarrito;

	@Id("button-tramitarpedido")
	private Button tramitarPedido;

	@Id("layout-productosdelcarrito")
	private VerticalLayout productosDelCarrito;

    public Label getPrecioCarrito() {
        return precioCarrito;
    }

    public void setPrecioCarrito(Label precioCarrito) {
        this.precioCarrito = precioCarrito;
    }

    public Button getTramitarPedido() {
        return tramitarPedido;
    }

    public void setTramitarPedido(Button tramitarPedido) {
        this.tramitarPedido = tramitarPedido;
    }

    public VerticalLayout getProductosDelCarrito() {
        return productosDelCarrito;
    }

    public void setProductosDelCarrito(VerticalLayout productosDelCarrito) {
        this.productosDelCarrito = productosDelCarrito;
    }

    /**
     * Creates a new VistaCarrito.
     */
    public VistaCarrito() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCarrito and vista-carrito
     */
    public interface VistaCarritoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
