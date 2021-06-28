package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-empresatransportes template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-empresatransportes")
@JsModule("./src/vista-empresatransportes.js")
public class VistaEmpresatransportes extends PolymerTemplate<VistaEmpresatransportes.VistaEmpresatransportesModel> {

    
    @Id("layout-pedidos-enviados")
    private VerticalLayout layoutPedidosEnviados;
    @Id("layout-pedidos-entregados")
    private VerticalLayout layoutPedidosEntregados;
    @Id("layout-header")
    private VerticalLayout layoutHeader;
    @Id("id-email-transportes")
    private Label idEmailTransportes;
    

    public VerticalLayout getLayoutPedidosEnviados() {
        return layoutPedidosEnviados;
    }

    public void setLayoutPedidosEnviados(VerticalLayout layoutPedidosEnviados) {
        this.layoutPedidosEnviados = layoutPedidosEnviados;
    }

    public VerticalLayout getLayoutPedidosEntregados() {
        return layoutPedidosEntregados;
    }

    public void setLayoutPedidosEntregados(VerticalLayout layoutPedidosEntregados) {
        this.layoutPedidosEntregados = layoutPedidosEntregados;
    }

    public VerticalLayout getLayoutHeader() {
        return layoutHeader;
    }

    public void setLayoutHeader(VerticalLayout layoutHeader) {
        this.layoutHeader = layoutHeader;
    }

    public Label getIdEmailTransportes() {
        return idEmailTransportes;
    }

    public void setIdEmailTransportes(Label idEmailTransportes) {
        this.idEmailTransportes = idEmailTransportes;
    }

    /**
     * Creates a new VistaEmpresatransportes.
     */
    public VistaEmpresatransportes() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEmpresatransportes and vista-empresatransportes
     */
    public interface VistaEmpresatransportesModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
