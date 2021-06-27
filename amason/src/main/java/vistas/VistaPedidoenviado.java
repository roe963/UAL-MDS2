package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-pedidoenviado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pedidoenviado")
@JsModule("./src/vista-pedidoenviado.js")
public class VistaPedidoenviado extends PolymerTemplate<VistaPedidoenviado.VistaPedidoenviadoModel> {

    @Id("lbl-pedido")
    private Label lblPedido;
    @Id("btn-ver-detalles-pedido")
    private Button btnVerDetallesPedido;

    public Button getBtnVerDetallesPedido() {
        return btnVerDetallesPedido;
    }

    public void setBtnVerDetallesPedido(Button btnVerDetallesPedido) {
        this.btnVerDetallesPedido = btnVerDetallesPedido;
    }

    public Label getLblPedido() {
        return lblPedido;
    }

    public void setLblPedido(Label lblPedido) {
        this.lblPedido = lblPedido;
    }

    /**
     * Creates a new VistaPedidoenviado.
     */
    public VistaPedidoenviado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPedidoenviado and vista-pedidoenviado
     */
    public interface VistaPedidoenviadoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
