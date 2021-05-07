package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vista-respuesta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-respuesta")
@JsModule("./src/vista-respuesta.js")
public class VistaRespuesta extends PolymerTemplate<VistaRespuesta.VistaRespuestaModel> {

    /**
     * Creates a new VistaRespuesta.
     */
    public VistaRespuesta() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaRespuesta and vista-respuesta
     */
    public interface VistaRespuestaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
