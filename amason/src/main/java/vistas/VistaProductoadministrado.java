package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-productoadministrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productoadministrado")
@JsModule("./src/vista-productoadministrado.js")
public class VistaProductoadministrado extends PolymerTemplate<VistaProductoadministrado.VistaProductoadministradoModel> {

    @Id("layout-producto")
	private HorizontalLayout layoutProducto;
	@Id("label-producto")
	private Label labelProducto;

	/**
     * Creates a new VistaProductoadministrado.
     */
    public VistaProductoadministrado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductoadministrado and vista-productoadministrado
     */
    public interface VistaProductoadministradoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public HorizontalLayout getLayoutProducto() {
		return layoutProducto;
	}

	public void setLayoutProducto(HorizontalLayout layoutProducto) {
		this.layoutProducto = layoutProducto;
	}

	public Label getLabelProducto() {
		return labelProducto;
	}

	public void setLabelProducto(Label labelProducto) {
		this.labelProducto = labelProducto;
	}
    
}
