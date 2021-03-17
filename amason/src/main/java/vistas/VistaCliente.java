package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-cliente template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cliente")
@JsModule("./src/vista-cliente.js")
public class VistaCliente extends PolymerTemplate<VistaCliente.VistaClienteModel> {

	////// Barra Navegacion /////
	@Id("button-carrito")
	private Button verCarrito;
	
	@Id("button-inicio")
	private Button aInicio;
	
	
    public Button getVerCarrito() {
		return verCarrito;
	}

	public void setVerCarrito(Button verCarrito) {
		this.verCarrito = verCarrito;
	}

	public Button getaInicio() {
		return aInicio;
	}

	public void setaInicio(Button aInicio) {
		this.aInicio = aInicio;
	}
	//////Barra Navegacion /////
	
	
	@Id("vista-cliente")
	private Element layoutCliente;
	
	public Element getLayoutCliente() {
		return layoutCliente;
	}

	public void setLayoutCliente(Element layoutCliente) {
		this.layoutCliente = layoutCliente;
	}

	/**
     * Creates a new VistaCliente.
     */
    public VistaCliente() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCliente and vista-cliente
     */
    public interface VistaClienteModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
