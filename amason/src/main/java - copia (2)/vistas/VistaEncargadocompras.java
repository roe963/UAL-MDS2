package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-encargadocompras template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-encargadocompras")
@JsModule("./src/vista-encargadocompras.js")
public class VistaEncargadocompras extends PolymerTemplate<VistaEncargadocompras.VistaEncargadocomprasModel> {

    /**
     * Creates a new VistaEncargadocompras.
     */
    public VistaEncargadocompras() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEncargadocompras and vista-encargadocompras
     */
    public interface VistaEncargadocomprasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
