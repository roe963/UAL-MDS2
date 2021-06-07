package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-vercatalogoadministrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-vercatalogoadministrador")
@JsModule("./src/vista-vercatalogoadministrador.js")
public class VistaVercatalogoadministrador extends PolymerTemplate<VistaVercatalogoadministrador.VistaVercatalogoadministradorModel> {

	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("layout-selectCategoria")
	private VerticalLayout layoutSelectCategoria;

	/**
     * Creates a new VistaVercatalogoadministrador.
     */
    public VistaVercatalogoadministrador() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVercatalogoadministrador and vista-vercatalogoadministrador
     */
    public interface VistaVercatalogoadministradorModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
    
    public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public VerticalLayout getLayoutSelectCategoria() {
		return layoutSelectCategoria;
	}

	public void setLayoutSelectCategoria(VerticalLayout layoutSelectCategoria) {
		this.layoutSelectCategoria = layoutSelectCategoria;
    
	}
	
}
