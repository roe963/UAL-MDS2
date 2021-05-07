package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vista-ofertaadministrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ofertaadministrador")
@JsModule("./src/vista-ofertaadministrador.js")
public class VistaOfertaadministrador extends PolymerTemplate<VistaOfertaadministrador.VistaOfertaadministradorModel> {

    /**
     * Creates a new VistaOfertaadministrador.
     */
    public VistaOfertaadministrador() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaOfertaadministrador and vista-ofertaadministrador
     */
    public interface VistaOfertaadministradorModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
