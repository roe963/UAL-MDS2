package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-administrarofertas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-administrarofertas")
@JsModule("./src/vista-administrarofertas.js")
public class VistaAdministrarofertas extends PolymerTemplate<VistaAdministrarofertas.VistaAdministrarofertasModel> {

    /**
     * Creates a new VistaAdministrarofertas.
     */
    public VistaAdministrarofertas() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAdministrarofertas and vista-administrarofertas
     */
    public interface VistaAdministrarofertasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
