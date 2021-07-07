package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vista-verpedido template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-verpedido")
@JsModule("./src/vista-verpedido.js")
public class VistaVerpedido extends PolymerTemplate<VistaVerpedido.VistaVerpedidoModel> {

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
    
    
    @Id("layout-productosdelpedido")
    private VerticalLayout productosDelPedido;
    
    @Id("h-idpedido")
    private H3 idPdido;
    
    @Id("lbl-fecha-pedido")
    private Label fechaPedido;
    
    @Id("lbl-precio-pedido")
    private Label precioPedido;
    
    @Id("label-estado-pedido")
    private Label estadoPedido;
    
    @Id("button-cancelarcompra")
    private Button cancelarCompra;

    public VerticalLayout getProductosDelPedido() {
        return productosDelPedido;
    }

    public void setProductosDelPedido(VerticalLayout productosDelPedido) {
        this.productosDelPedido = productosDelPedido;
    }    
	
    public H3 getIdPdido() {
        return idPdido;
    }

    public void setIdPdido(H3 idPdido) {
        this.idPdido = idPdido;
    }

    public Label getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Label fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Label getPrecioPedido() {
        return precioPedido;
    }

    public void setPrecioPedido(Label precioPedido) {
        this.precioPedido = precioPedido;
    }

    public Label getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(Label estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public Button getCancelarCompra() {
        return cancelarCompra;
    }

    public void setCancelarCompra(Button cancelarCompra) {
        this.cancelarCompra = cancelarCompra;
    }

    /**
     * Creates a new VistaVerpedido.
     */
    public VistaVerpedido() {
        // You can initialise any data required for the connected UI components here.
        
        
    }

    /**
     * This model binds properties between VistaVerpedido and vista-verpedido
     */
    public interface VistaVerpedidoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
