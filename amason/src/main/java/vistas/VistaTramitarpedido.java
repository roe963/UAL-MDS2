package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-tramitarpedido template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-tramitarpedido")
@JsModule("./src/vista-tramitarpedido.js")
public class VistaTramitarpedido extends PolymerTemplate<VistaTramitarpedido.VistaTramitarpedidoModel> {

   
	@Id("button-comprar")
	private Button buttonComprar;
	@Id("vaadinVerticalLayout")
	private VerticalLayout vaadinVerticalLayout;

	
	public Button getButtonComprar() {
		return buttonComprar;
	}

	public void setButtonComprar(Button buttonComprar) {
		this.buttonComprar = buttonComprar;
	}

	public VerticalLayout getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(VerticalLayout vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	/**
     * Creates a new VistaTramitarpedido.
     */
    public VistaTramitarpedido() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaTramitarpedido and vista-tramitarpedido
     */
    public interface VistaTramitarpedidoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
