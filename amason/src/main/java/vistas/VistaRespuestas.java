package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H4;

/**
 * A Designer generated component for the vista-respuestas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-respuestas")
@JsModule("./src/vista-respuestas.js")
public class VistaRespuestas extends PolymerTemplate<VistaRespuestas.VistaRespuestasModel> {

    //////Barra Navegacion /////
    @Id("layout-menu")
    private VerticalLayout layoutMenu;
	@Id("vaadinVerticalLayout")
	private VerticalLayout vaadinVerticalLayout;
	@Id("button-volver")
	private Button buttonVolver;
	@Id("h-mensaje")
	private H4 hMensaje;
	@Id("button-responder")
	private Button buttonResponder;
    
	
	
    public Button getButtonResponder() {
		return buttonResponder;
	}

	public void setButtonResponder(Button buttonResponder) {
		this.buttonResponder = buttonResponder;
	}

	public VerticalLayout getLayoutMenu() {
        return layoutMenu;
    }

    public void setLayoutMenu(VerticalLayout layoutMenu) {
        this.layoutMenu = layoutMenu;
    }
    //////Barra Navegacion /////
    
    
	
    /**
     * Creates a new VistaRespuestas.
     */
    public VistaRespuestas() {
        // You can initialise any data required for the connected UI components here.
    }

    public VerticalLayout getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(VerticalLayout vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}
	
	
	
	
	public H4 gethMensaje() {
		return hMensaje;
	}

	public void sethMensaje(H4 hMensaje) {
		this.hMensaje = hMensaje;
	}

	public Button getButtonVolver() {
		return buttonVolver;
	}

	public void setButtonVolver(Button buttonVolver) {
		this.buttonVolver = buttonVolver;
	}




	/**
     * This model binds properties between VistaRespuestas and vista-respuestas
     */
    public interface VistaRespuestasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
