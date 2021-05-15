package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.html.H4;

/**
 * A Designer generated component for the vista-carrito template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-carrito")
@JsModule("./src/vista-carrito.js")
public class VistaCarrito extends PolymerTemplate<VistaCarrito.VistaCarritoModel> {

	
	
    @Id("layout-carrito")
	private Element layoutCarrito;

	@Id("vlProductos")
	private VerticalLayout vlProductos;

	@Id("vaadinButton")
	private Button vaadinButton;

	@Id("h4")
	private H4 precioTotal;
	

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}

	public H4 getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(H4 precioTotal) {
		this.precioTotal = precioTotal;
	}

	public VerticalLayout getVlProductos() {
		return vlProductos;
	}

	public void setVlProductos(VerticalLayout vlProductos) {
		this.vlProductos = vlProductos;
	}

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
