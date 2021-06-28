package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-pedido template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pedido")
@JsModule("./src/vista-pedido.js")
public class VistaPedido extends PolymerTemplate<VistaPedido.VistaPedidoModel> {

    @Id("label-npedido")
    private Label labelNpedido;
    @Id("label-narticulos")
    private Label labelNarticulos;
    @Id("label-fecha")
    private Label labelFecha;
    @Id("label-precio")
    private Label labelPrecio;
    @Id("label-estado")
    private Label labelEstado;
    @Id("tbn-ver-detallado")
    private Button tbnVerDetallado;

    public Label getLabelNpedido() {
        return labelNpedido;
    }

    public void setLabelNpedido(Label labelNpedido) {
        this.labelNpedido = labelNpedido;
    }

    public Label getLabelNarticulos() {
        return labelNarticulos;
    }

    public void setLabelNarticulos(Label labelNarticulos) {
        this.labelNarticulos = labelNarticulos;
    }

    public Label getLabelFecha() {
        return labelFecha;
    }

    public void setLabelFecha(Label labelFecha) {
        this.labelFecha = labelFecha;
    }

    public Label getLabelPrecio() {
        return labelPrecio;
    }

    public void setLabelPrecio(Label labelPrecio) {
        this.labelPrecio = labelPrecio;
    }

    public Label getLabelEstado() {
        return labelEstado;
    }

    public void setLabelEstado(Label labelEstado) {
        this.labelEstado = labelEstado;
    }

    public Button getTbnVerDetallado() {
        return tbnVerDetallado;
    }

    public void setTbnVerDetallado(Button tbnVerDetallado) {
        this.tbnVerDetallado = tbnVerDetallado;
    }

    /**
     * Creates a new VistaPedido.
     */
    public VistaPedido() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPedido and vista-pedido
     */
    public interface VistaPedidoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
