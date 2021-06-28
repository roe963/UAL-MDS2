package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.H2;

/**
 * A Designer generated component for the vista-verinformacion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-verinformacion")
@JsModule("./src/vista-verinformacion.js")
public class VistaVerinformacion extends PolymerTemplate<VistaVerinformacion.VistaVerinformacionModel> {

    @Id("h-pedido")
    private H2 hPedido;
    @Id("lbl-fecha-pedido")
    private Label lblFechaPedido;
    @Id("lbl-direccion-entrega")
    private Label lblDireccionEntrega;
    @Id("lbl-nombre-cliente")
    private Label lblNombreCliente;

    public H2 gethPedido() {
        return hPedido;
    }

    public void sethPedido(H2 hPedido) {
        this.hPedido = hPedido;
    }

    public Label getLblFechaPedido() {
        return lblFechaPedido;
    }

    public void setLblFechaPedido(Label lblFechaPedido) {
        this.lblFechaPedido = lblFechaPedido;
    }

    public Label getLblDireccionEntrega() {
        return lblDireccionEntrega;
    }

    public void setLblDireccionEntrega(Label lblDireccionEntrega) {
        this.lblDireccionEntrega = lblDireccionEntrega;
    }

    public Label getLblNombreCliente() {
        return lblNombreCliente;
    }

    public void setLblNombreCliente(Label lblNombreCliente) {
        this.lblNombreCliente = lblNombreCliente;
    }

    /**
     * Creates a new VistaVerinformacion.
     */
    public VistaVerinformacion() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVerinformacion and vista-verinformacion
     */
    public interface VistaVerinformacionModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
