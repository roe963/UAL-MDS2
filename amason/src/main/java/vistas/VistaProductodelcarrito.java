package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

/**
 * A Designer generated component for the vista-productodelcarrito template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productodelcarrito")
@JsModule("./src/vista-productodelcarrito.js")
public class VistaProductodelcarrito extends PolymerTemplate<VistaProductodelcarrito.VistaProductodelcarritoModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("img-producto")
	private Image imgProducto;
	@Id("button-eliminar")
	private Button buttonEliminar;
	@Id("h-precio")
	private H4 hPrecio;
	@Id("label-categoria")
	private Label labelCategoria;
	@Id("h-producto")
	private H4 hProducto;
	@Id("vaadinVerticalLayout2")
	private VerticalLayout vaadinVerticalLayout2;
	
	
	
	public VerticalLayout getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}

	public void setVaadinVerticalLayout2(VerticalLayout vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}

	public H4 gethProducto() {
		return hProducto;
	}

	public void sethProducto(H4 hProducto) {
		this.hProducto = hProducto;
	}

	public Label getLabelCategoria() {
		return labelCategoria;
	}

	public void setLabelCategoria(Label labelCategoria) {
		this.labelCategoria = labelCategoria;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Image getImgProducto() {
		return imgProducto;
	}

	public void setImgProducto(Image imgProducto) {
		this.imgProducto = imgProducto;
	}

	public Button getButtonEliminar() {
		return buttonEliminar;
	}

	public void setButtonEliminar(Button buttonEliminar) {
		this.buttonEliminar = buttonEliminar;
	}

	public H4 gethPrecio() {
		return hPrecio;
	}

	public void sethPrecio(H4 hPrecio) {
		this.hPrecio = hPrecio;
	}

	/**
     * Creates a new VistaProductodelcarrito.
     */
    public VistaProductodelcarrito() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductodelcarrito and vista-productodelcarrito
     */
    public interface VistaProductodelcarritoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
