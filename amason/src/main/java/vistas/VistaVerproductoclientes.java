package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-verproductoclientes template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-verproductoclientes")
@JsModule("./src/vista-verproductoclientes.js")
public class VistaVerproductoclientes extends PolymerTemplate<VistaVerproductoclientes.VistaVerproductoclientesModel> {

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
	
    @Id("button-comprar")
	private Button buttonComprar;

	public Button getButtonComprar() {
		return buttonComprar;
	}

	public void setButtonComprar(Button buttonComprar) {
		this.buttonComprar = buttonComprar;
	}

	/**
     * Creates a new VistaVerproductoclientes.
     */
    public VistaVerproductoclientes() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVerproductoclientes and vista-verproductoclientes
     */
    public interface VistaVerproductoclientesModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
