package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vista-seleccionardirecciondeenvio template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-seleccionardirecciondeenvio")
@JsModule("./src/vista-seleccionardirecciondeenvio.js")
public class VistaSeleccionardirecciondeenvio extends PolymerTemplate<VistaSeleccionardirecciondeenvio.VistaSeleccionardirecciondeenvioModel> {

    /**
     * Creates a new VistaSeleccionardirecciondeenvio.
     */
    public VistaSeleccionardirecciondeenvio() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaSeleccionardirecciondeenvio and vista-seleccionardirecciondeenvio
     */
    public interface VistaSeleccionardirecciondeenvioModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
