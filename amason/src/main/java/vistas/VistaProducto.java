package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vista-producto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-producto")
@JsModule("./src/vista-producto.js")
public class VistaProducto extends PolymerTemplate<VistaProducto.VistaProductoModel> {

    @Id("img-producto")
	private Image imgProducto;
	//@Id("textoproducto")
	//private Label labelProducto;
	@Id("textoproducto")
	private Label textoproducto;

	public Image getImgProducto() {
		return imgProducto;
	}

	public void setImgProducto(Image imgProducto) {
		this.imgProducto = imgProducto;
	}

	/*public Label getLabelProducto() {
		return labelProducto;
	}

	public void setLabelProducto(Label labelProducto) {
		this.labelProducto = labelProducto;
	}*/

	/**
     * Creates a new VistaProducto.
     */
    public VistaProducto() {
        // You can initialise any data required for the connected UI components here.
    }
    
    /*public VistaProducto(Producto producto) {
        // You can initialise any data required for the connected UI components here.
    	this.labelProducto.setText(producto.getNombre());
    }*/

    public Label getTextoproducto() {
		return textoproducto;
	}

	public void setTextoproducto(Label textoproducto) {
		this.textoproducto = textoproducto;
	}

	/**
     * This model binds properties between VistaProducto and vista-producto
     */
    public interface VistaProductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
