package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vista-valoraciones template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-valoraciones")
@JsModule("./src/vista-valoraciones.js")
public class VistaValoraciones extends PolymerTemplate<VistaValoraciones.VistaValoracionesModel> {

    /**
     * Creates a new VistaValoraciones.
     */
    public VistaValoraciones() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaValoraciones and vista-valoraciones
     */
    public interface VistaValoracionesModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
