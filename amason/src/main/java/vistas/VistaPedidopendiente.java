package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

import basededatos.Cliente;
import basededatos.Empresa_transportes;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.select.Select;

/**
 * A Designer generated component for the vista-pedidopendiente template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pedidopendiente")
@JsModule("./src/vista-pedidopendiente.js")
public class VistaPedidopendiente extends PolymerTemplate<VistaPedidopendiente.VistaPedidopendienteModel> {

    @Id("lbl-pedido")
    private Label lblPedido;
    @Id("btn-ver-detalles-pedido")
    private Button btnVerDetallesPedido;
    @Id("select-empresa-transportes")
    private Select<Empresa_transportes> selectEmpresaTransportes;
    

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

    public Select<Empresa_transportes> getSelectEmpresaTransportes() {
        return selectEmpresaTransportes;
    }

    public void setSelectEmpresaTransportes(Select<Empresa_transportes> selectEmpresaTransportes) {
        this.selectEmpresaTransportes = selectEmpresaTransportes;
    }

    /**
     * Creates a new VistaPedidopendiente.
     */
    public VistaPedidopendiente() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPedidopendiente and vista-pedidopendiente
     */
    public interface VistaPedidopendienteModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
