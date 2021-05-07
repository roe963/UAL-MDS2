package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vista-carrito template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-carrito")
@JsModule("./src/vista-carrito.js")
public class VistaCarrito extends PolymerTemplate<VistaCarrito.VistaCarritoModel> {

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
	
	
    @Id("layout-carrito")
	private Element layoutCarrito;

	public Element getLayoutCarrito() {
		return layoutCarrito;
	}

	public void setLayoutCarrito(Element layoutCarrito) {
		this.layoutCarrito = layoutCarrito;
	}

	/**
     * Creates a new VistaCarrito.
     */
    public VistaCarrito() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCarrito and vista-carrito
     */
    public interface VistaCarritoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
