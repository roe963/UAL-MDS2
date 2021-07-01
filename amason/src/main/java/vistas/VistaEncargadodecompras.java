package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.checkbox.Checkbox;

/**
 * A Designer generated component for the vista-encargadodecompras template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-encargadodecompras")
@JsModule("./src/vista-encargadodecompras.js")
public class VistaEncargadodecompras extends PolymerTemplate<VistaEncargadodecompras.VistaEncargadodecomprasModel> {

    @Id("layout-encargadoCompras")
	private HorizontalLayout layoutEncargadoCompras;
	@Id("label-encargadoCompras")
	private Label labelEncargadoCompras;
	@Id("checkbox-activarEncargadoCompras")
	private Checkbox checkboxActivarEncargadoCompras;

	/**
     * Creates a new VistaEncargadodecompras.
     */
    public VistaEncargadodecompras() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEncargadodecompras and vista-encargadodecompras
     */
    public interface VistaEncargadodecomprasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public HorizontalLayout getLayoutEncargadoCompras() {
		return layoutEncargadoCompras;
	}

	public void setLayoutEncargadoCompras(HorizontalLayout layoutEncargadoCompras) {
		this.layoutEncargadoCompras = layoutEncargadoCompras;
	}

	public Label getLabelEncargadoCompras() {
		return labelEncargadoCompras;
	}

	public void setLabelEncargadoCompras(Label labelEncargadoCompras) {
		this.labelEncargadoCompras = labelEncargadoCompras;
	}

	public Checkbox getCheckboxActivarEncargadoCompras() {
		return checkboxActivarEncargadoCompras;
	}

	public void setCheckboxActivarEncargadoCompras(Checkbox checkboxActivarEncargadoCompras) {
		this.checkboxActivarEncargadoCompras = checkboxActivarEncargadoCompras;
	}
    
}
