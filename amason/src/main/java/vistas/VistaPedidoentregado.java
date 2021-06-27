package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-pedidoentregado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pedidoentregado")
@JsModule("./src/vista-pedidoentregado.js")
public class VistaPedidoentregado extends PolymerTemplate<VistaPedidoentregado.VistaPedidoentregadoModel> {

    @Id("lbl-pedido")
    private Label lblPedido;
    @Id("btn-ver-detalles-pedido")
    private Button btnVerDetallesPedido;

    public Label getLblPedido() {
        return lblPedido;
    }

    public void setLblPedido(Label lblPedido) {
        this.lblPedido = lblPedido;
    }

    public Button getBtnVerDetallesPedido() {
        return btnVerDetallesPedido;
    }

    public void setBtnVerDetallesPedido(Button btnVerDetallesPedido) {
        this.btnVerDetallesPedido = btnVerDetallesPedido;
    }

    /**
     * Creates a new VistaPedidoentregado.
     */
    public VistaPedidoentregado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPedidoentregado and vista-pedidoentregado
     */
    public interface VistaPedidoentregadoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
