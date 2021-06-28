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
 * A Designer generated component for the vista-encargadocompras template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-encargadocompras")
@JsModule("./src/vista-encargadocompras.js")
public class VistaEncargadocompras extends PolymerTemplate<VistaEncargadocompras.VistaEncargadocomprasModel> {

    @Id("layout-header")
    private VerticalLayout layoutHeader;
    @Id("layout-pedidos-pendientes")
    private VerticalLayout layoutPedidosPendientes;
    @Id("layout-pedidos-enviados")
    private VerticalLayout layoutPedidosEnviados;
    @Id("id-email-encargado")
    private Label idEmailEncargado;
    

    public VerticalLayout getLayoutHeader() {
        return layoutHeader;
    }

    public void setLayoutHeader(VerticalLayout layoutHeader) {
        this.layoutHeader = layoutHeader;
    }

    public VerticalLayout getLayoutPedidosPendientes() {
        return layoutPedidosPendientes;
    }

    public void setLayoutPedidosPendientes(VerticalLayout layoutPedidosPendientes) {
        this.layoutPedidosPendientes = layoutPedidosPendientes;
    }

    public VerticalLayout getLayoutPedidosEnviados() {
        return layoutPedidosEnviados;
    }

    public void setLayoutPedidosEnviados(VerticalLayout layoutPedidosEnviados) {
        this.layoutPedidosEnviados = layoutPedidosEnviados;
    }

    public Label getIdEmailEncargado() {
        return idEmailEncargado;
    }

    public void setIdEmailEncargado(Label idEmailEncargado) {
        this.idEmailEncargado = idEmailEncargado;
    }

    /**
     * Creates a new VistaEncargadocompras.
     */
    public VistaEncargadocompras() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEncargadocompras and vista-encargadocompras
     */
    public interface VistaEncargadocomprasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
