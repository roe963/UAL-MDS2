package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-seleccionarmetododepago template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-seleccionarmetododepago")
@JsModule("./src/vista-seleccionarmetododepago.js")
public class VistaSeleccionarmetododepago extends PolymerTemplate<VistaSeleccionarmetododepago.VistaSeleccionarmetododepagoModel> {

    /**
     * Creates a new VistaSeleccionarmetododepago.
     */
    public VistaSeleccionarmetododepago() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaSeleccionarmetododepago and vista-seleccionarmetododepago
     */
    public interface VistaSeleccionarmetododepagoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
