package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Image;

/**
 * A Designer generated component for the vista-oferta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-oferta")
@JsModule("./src/vista-oferta.js")
public class VistaOferta extends PolymerTemplate<VistaOferta.VistaOfertaModel> {

    @Id("fecha")
	private Label label;
	@Id("img")
	private Image img;
	@Id("precio")
	private Label label1;

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}

	public Label getLabel1() {
		return label1;
	}

	public void setLabel1(Label label1) {
		this.label1 = label1;
	}

	/**
     * Creates a new VistaOferta.
     */
    public VistaOferta() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaOferta and vista-oferta
     */
    public interface VistaOfertaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
