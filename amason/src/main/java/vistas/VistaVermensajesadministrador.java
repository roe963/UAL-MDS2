package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-vermensajesadministrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-vermensajesadministrador")
@JsModule("./src/vista-vermensajesadministrador.js")
public class VistaVermensajesadministrador extends PolymerTemplate<VistaVermensajesadministrador.VistaVermensajesadministradorModel> {

    //////Barra Navegacion /////
    @Id("layout-menu")
    private VerticalLayout layoutMenu;
	@Id("verticalLayout")
	private VerticalLayout verticalLayout;

    
    public VerticalLayout getLayoutMenu() {
        return layoutMenu;
    }

    public void setLayoutMenu(VerticalLayout layoutMenu) {
        this.layoutMenu = layoutMenu;
    }
    //////Barra Navegacion /////
	
    
    
    
    /**
     * Creates a new VistaVermensajesadministrador.
     */
    public VistaVermensajesadministrador() {
        // You can initialise any data required for the connected UI components here.
    }

    public VerticalLayout getVerticalLayout() {
		return verticalLayout;
	}

	public void setVerticalLayout(VerticalLayout verticalLayout) {
		this.verticalLayout = verticalLayout;
	}



	/**
     * This model binds properties between VistaVermensajesadministrador and vista-vermensajesadministrador
     */
    public interface VistaVermensajesadministradorModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
