package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-encargadosdecompras template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-encargadosdecompras")
@JsModule("./src/vista-encargadosdecompras.js")
public class VistaEncargadosdecompras extends PolymerTemplate<VistaEncargadosdecompras.VistaEncargadosdecomprasModel> {

    @Id("layout-encargadosCompras")
	private VerticalLayout layoutEncargadosCompras;
	@Id("vistaEncargadodecompras")
	private Element vistaEncargadodecompras;

	/**
     * Creates a new VistaEncargadosdecompras.
     */
    public VistaEncargadosdecompras() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEncargadosdecompras and vista-encargadosdecompras
     */
    public interface VistaEncargadosdecomprasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public VerticalLayout getLayoutEncargadosCompras() {
		return layoutEncargadosCompras;
	}

	public void setLayoutEncargadosCompras(VerticalLayout layoutEncargadosCompras) {
		this.layoutEncargadosCompras = layoutEncargadosCompras;
	}

	public Element getVistaEncargadodecompras() {
		return vistaEncargadodecompras;
	}

	public void setVistaEncargadodecompras(Element vistaEncargadodecompras) {
		this.vistaEncargadodecompras = vistaEncargadodecompras;
	}
    
}
