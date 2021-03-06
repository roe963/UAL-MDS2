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
 * A Designer generated component for the vista-administrarempleados template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-administrarempleados")
@JsModule("./src/vista-administrarempleados.js")
public class VistaAdministrarempleados extends PolymerTemplate<VistaAdministrarempleados.VistaAdministrarempleadosModel> {

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
    
	@Id("layout-anadirUsuario")
	private VerticalLayout layoutAnadirUsuario;
	@Id("layout-encargadoCompras")
	private VerticalLayout layoutEncargadoCompras;
	@Id("layout-empresaTransportes")
	private VerticalLayout layoutEmpresaTransportes;
	@Id("button-guardar")
	private Button buttonGuardar;
	
    /**
     * Creates a new VistaAdministrarempleados.
     */
    public VistaAdministrarempleados() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAdministrarempleados and vista-administrarempleados
     */
    public interface VistaAdministrarempleadosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public VerticalLayout getLayoutAnadirUsuario() {
		return layoutAnadirUsuario;
	}

	public void setLayoutAnadirUsuario(VerticalLayout layoutAnadirUsuario) {
		this.layoutAnadirUsuario = layoutAnadirUsuario;
	}

	public VerticalLayout getLayoutEncargadoCompras() {
		return layoutEncargadoCompras;
	}

	public void setLayoutEncargadoCompras(VerticalLayout layoutEncargadoCompras) {
		this.layoutEncargadoCompras = layoutEncargadoCompras;
	}

	public VerticalLayout getLayoutEmpresaTransportes() {
		return layoutEmpresaTransportes;
	}

	public void setLayoutEmpresaTransportes(VerticalLayout layoutEmpresaTransportes) {
		this.layoutEmpresaTransportes = layoutEmpresaTransportes;
	}

	public Button getButtonGuardar() {
		return buttonGuardar;
	}

	public void setButtonGuardar(Button buttonGuardar) {
		this.buttonGuardar = buttonGuardar;
	}
    
}
