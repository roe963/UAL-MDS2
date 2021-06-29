package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-administrarcategorias template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-administrarcategorias")
@JsModule("./src/vista-administrarcategorias.js")
public class VistaAdministrarcategorias extends PolymerTemplate<VistaAdministrarcategorias.VistaAdministrarcategoriasModel> {

    //////Barra Navegacion /////
    @Id("layout-menu")
    private VerticalLayout layoutMenu;
	@Id("layout-anadirCategoria")
	private VerticalLayout layoutAnadirCategoria;
	@Id("layout-categorias")
	private HorizontalLayout layoutCategorias;
	public VerticalLayout getLayoutMenu() {
        return layoutMenu;
    }

    public void setLayoutMenu(VerticalLayout layoutMenu) {
        this.layoutMenu = layoutMenu;
    }
    //////Barra Navegacion /////
	
    /**
     * Creates a new VistaAdministrarcategorias.
     */
    public VistaAdministrarcategorias() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAdministrarcategorias and vista-administrarcategorias
     */
    public interface VistaAdministrarcategoriasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public VerticalLayout getLayoutAnadirCategoria() {
		return layoutAnadirCategoria;
	}

	public void setLayoutAnadirCategoria(VerticalLayout layoutAnadirCategoria) {
		this.layoutAnadirCategoria = layoutAnadirCategoria;
	}

	public HorizontalLayout getLayoutCategorias() {
		return layoutCategorias;
	}

	public void setLayoutCategorias(HorizontalLayout layoutCategorias) {
		this.layoutCategorias = layoutCategorias;
	}
    
}
