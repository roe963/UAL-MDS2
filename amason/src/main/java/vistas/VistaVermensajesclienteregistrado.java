package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-vermensajesclienteregistrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-vermensajesclienteregistrado")
@JsModule("./src/vista-vermensajesclienteregistrado.js")
public class VistaVermensajesclienteregistrado extends PolymerTemplate<VistaVermensajesclienteregistrado.VistaVermensajesclienteregistradoModel> {

    //////Barra Navegacion /////
    @Id("layout-menu")
    private VerticalLayout layoutMenu;
	@Id("button-redactar")
	private Button buttonRedactar;

	public VerticalLayout getLayoutMenu() {
        return layoutMenu;
    }
	
	@Id("vaadinVerticalLayout2")
	private VerticalLayout vaadinVerticalLayout2;

    public VerticalLayout getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}

	public void setVaadinVerticalLayout2(VerticalLayout vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}

	public Button getButtonRedactar() {
		return buttonRedactar;
	}

	public void setButtonRedactar(Button buttonRedactar) {
		this.buttonRedactar = buttonRedactar;
	}



	public void setLayoutMenu(VerticalLayout layoutMenu) {
        this.layoutMenu = layoutMenu;
    }
    //////Barra Navegacion /////
	
    /**
     * Creates a new VistaVermensajesclienteregistrado.
     */
    public VistaVermensajesclienteregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVermensajesclienteregistrado and vista-vermensajesclienteregistrado
     */
    public interface VistaVermensajesclienteregistradoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
