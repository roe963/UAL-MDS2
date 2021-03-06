package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vista-verrespuestas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-verrespuestas")
@JsModule("./src/vista-verrespuestas.js")
public class VistaVerrespuestas extends PolymerTemplate<VistaVerrespuestas.VistaVerrespuestasModel> {

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
	
    /**
     * Creates a new VistaVerrespuestas.
     */
    public VistaVerrespuestas() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVerrespuestas and vista-verrespuestas
     */
    public interface VistaVerrespuestasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
