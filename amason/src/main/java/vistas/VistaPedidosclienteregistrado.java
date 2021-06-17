package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vista-pedidosclienteregistrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pedidosclienteregistrado")
@JsModule("./src/vista-pedidosclienteregistrado.js")
public class VistaPedidosclienteregistrado extends PolymerTemplate<VistaPedidosclienteregistrado.VistaPedidosclienteregistradoModel> {

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
     * Creates a new VistaPedidosclienteregistrado.
     */
    public VistaPedidosclienteregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPedidosclienteregistrado and vista-pedidosclienteregistrado
     */
    public interface VistaPedidosclienteregistradoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
