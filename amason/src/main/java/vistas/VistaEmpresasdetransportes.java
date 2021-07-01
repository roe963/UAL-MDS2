package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-empresasdetransportes template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-empresasdetransportes")
@JsModule("./src/vista-empresasdetransportes.js")
public class VistaEmpresasdetransportes extends PolymerTemplate<VistaEmpresasdetransportes.VistaEmpresasdetransportesModel> {

    @Id("layout-empresasTransportes")
	private VerticalLayout layoutEmpresasTransportes;
	@Id("vistaEmpresadetransportes")
	private Element vistaEmpresadetransportes;

	/**
     * Creates a new VistaEmpresasdetransportes.
     */
    public VistaEmpresasdetransportes() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEmpresasdetransportes and vista-empresasdetransportes
     */
    public interface VistaEmpresasdetransportesModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public VerticalLayout getLayoutEmpresasTransportes() {
		return layoutEmpresasTransportes;
	}

	public void setLayoutEmpresasTransportes(VerticalLayout layoutEmpresasTransportes) {
		this.layoutEmpresasTransportes = layoutEmpresasTransportes;
	}

	public Element getVistaEmpresadetransportes() {
		return vistaEmpresadetransportes;
	}

	public void setVistaEmpresadetransportes(Element vistaEmpresadetransportes) {
		this.vistaEmpresadetransportes = vistaEmpresadetransportes;
	}
    
}
