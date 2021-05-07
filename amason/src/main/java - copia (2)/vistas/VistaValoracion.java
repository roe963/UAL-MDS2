package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-valoracion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-valoracion")
@JsModule("./src/vista-valoracion.js")
public class VistaValoracion extends PolymerTemplate<VistaValoracion.VistaValoracionModel> {

    /**
     * Creates a new VistaValoracion.
     */
    public VistaValoracion() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaValoracion and vista-valoracion
     */
    public interface VistaValoracionModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
