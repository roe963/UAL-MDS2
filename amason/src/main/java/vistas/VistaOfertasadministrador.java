package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.polymertemplate.Id;
import vistas.VistaOfertaadministrador;

/**
 * A Designer generated component for the vista-ofertasadministrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ofertasadministrador")
@JsModule("./src/vista-ofertasadministrador.js")
public class VistaOfertasadministrador extends PolymerTemplate<VistaOfertasadministrador.VistaOfertasadministradorModel> {

    @Id("layout-ofertas")
	private VerticalLayout layoutOfertas;
//	@Id("vistaOfertaAdministrador")
//	private VistaOfertaadministrador vistaOfertaAdministrador;

	/**
     * Creates a new VistaOfertasadministrador.
     */
    public VistaOfertasadministrador() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaOfertasadministrador and vista-ofertasadministrador
     */
    public interface VistaOfertasadministradorModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public VerticalLayout getLayoutOfertas() {
		return layoutOfertas;
	}

	public void setLayoutOfertas(VerticalLayout layoutOfertas) {
		this.layoutOfertas = layoutOfertas;
	}

//	public VistaOfertaadministrador getVistaOfertaAdministrador() {
//		return vistaOfertaAdministrador;
//	}
//
//	public void setVistaOfertaAdministrador(VistaOfertaadministrador vistaOfertaAdministrador) {
//		this.vistaOfertaAdministrador = vistaOfertaAdministrador;
//	}
    
}
