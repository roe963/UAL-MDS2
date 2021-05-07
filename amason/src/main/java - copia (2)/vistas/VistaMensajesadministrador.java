package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-mensajesadministrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-mensajesadministrador")
@JsModule("./src/vista-mensajesadministrador.js")
public class VistaMensajesadministrador extends PolymerTemplate<VistaMensajesadministrador.VistaMensajesadministradorModel> {

    /**
     * Creates a new VistaMensajesadministrador.
     */
    public VistaMensajesadministrador() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaMensajesadministrador and vista-mensajesadministrador
     */
    public interface VistaMensajesadministradorModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
