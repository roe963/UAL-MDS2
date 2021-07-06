package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-administrarofertas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-administrarofertas")
@JsModule("./src/vista-administrarofertas.js")
public class VistaAdministrarofertas extends PolymerTemplate<VistaAdministrarofertas.VistaAdministrarofertasModel> {

    //////Barra Navegacion /////
    @Id("layout-menu")
    private VerticalLayout layoutMenu;
	public VerticalLayout getLayoutMenu() {
        return layoutMenu;
    }

    public void setLayoutMenu(VerticalLayout layoutMenu) {
        this.layoutMenu = layoutMenu;
    }
    //////Barra Navegacion /////
	
	@Id("layout-anadirOferta")
	private VerticalLayout layoutAnadirOferta;
	@Id("layout-ofertas")
	private VerticalLayout layoutOfertas;
    
    /**
     * Creates a new VistaAdministrarofertas.
     */
    public VistaAdministrarofertas() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAdministrarofertas and vista-administrarofertas
     */
    public interface VistaAdministrarofertasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public VerticalLayout getLayoutAnadirOferta() {
		return layoutAnadirOferta;
	}

	public void setLayoutAnadirOferta(VerticalLayout layoutAnadirOferta) {
		this.layoutAnadirOferta = layoutAnadirOferta;
	}

	public VerticalLayout getLayoutOfertas() {
		return layoutOfertas;
	}

	public void setLayoutOfertas(VerticalLayout layoutOfertas) {
		this.layoutOfertas = layoutOfertas;
	}
    
}
