package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import vistas.VistaCategoria;

/**
 * A Designer generated component for the vista-categorias template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-categorias")
@JsModule("./src/vista-categorias.js")
public class VistaCategorias extends PolymerTemplate<VistaCategorias.VistaCategoriasModel> {

    @Id("layout-categorias")
	private VerticalLayout layoutCategorias;
	@Id("vistaCategoria")
	private VistaCategoria vistaCategoria;

	/**
     * Creates a new VistaCategorias.
     */
    public VistaCategorias() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCategorias and vista-categorias
     */
    public interface VistaCategoriasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public VerticalLayout getLayoutCategorias() {
		return layoutCategorias;
	}

	public void setLayoutCategorias(VerticalLayout layoutCategorias) {
		this.layoutCategorias = layoutCategorias;
	}

	public VistaCategoria getVistaCategoria() {
		return vistaCategoria;
	}

	public void setVistaCategoria(VistaCategoria vistaCategoria) {
		this.vistaCategoria = vistaCategoria;
	}
    
}
