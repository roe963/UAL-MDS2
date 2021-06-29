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
 * A Designer generated component for the vista-categoria template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-categoria")
@JsModule("./src/vista-categoria.js")
public class VistaCategoria extends PolymerTemplate<VistaCategoria.VistaCategoriaModel> {

    @Id("layout-categoria")
	private HorizontalLayout layoutCategoria;
	@Id("label-categoria")
	private Label labelCategoria;
	@Id("checkbox-activar")
	private Checkbox checkboxActivar;

	/**
     * Creates a new VistaCategoria.
     */
    public VistaCategoria() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCategoria and vista-categoria
     */
    public interface VistaCategoriaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public HorizontalLayout getLayoutCategoria() {
		return layoutCategoria;
	}

	public void setLayoutCategoria(HorizontalLayout layoutCategoria) {
		this.layoutCategoria = layoutCategoria;
	}

	public Label getLabelCategoria() {
		return labelCategoria;
	}

	public void setLabelCategoria(Label labelCategoria) {
		this.labelCategoria = labelCategoria;
	}

	public Checkbox getCheckboxActivar() {
		return checkboxActivar;
	}

	public void setCheckboxActivar(Checkbox checkboxActivar) {
		this.checkboxActivar = checkboxActivar;
	}
    
}
