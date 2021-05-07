package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vista-ofertasadministrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ofertasadministrador")
@JsModule("./src/vista-ofertasadministrador.js")
public class VistaOfertasadministrador extends PolymerTemplate<VistaOfertasadministrador.VistaOfertasadministradorModel> {

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
}
