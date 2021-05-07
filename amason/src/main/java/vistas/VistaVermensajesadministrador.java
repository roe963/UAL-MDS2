package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vista-vermensajesadministrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-vermensajesadministrador")
@JsModule("./src/vista-vermensajesadministrador.js")
public class VistaVermensajesadministrador extends PolymerTemplate<VistaVermensajesadministrador.VistaVermensajesadministradorModel> {

    /**
     * Creates a new VistaVermensajesadministrador.
     */
    public VistaVermensajesadministrador() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVermensajesadministrador and vista-vermensajesadministrador
     */
    public interface VistaVermensajesadministradorModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
