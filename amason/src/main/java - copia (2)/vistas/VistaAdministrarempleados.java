package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-administrarempleados template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-administrarempleados")
@JsModule("./src/vista-administrarempleados.js")
public class VistaAdministrarempleados extends PolymerTemplate<VistaAdministrarempleados.VistaAdministrarempleadosModel> {

    /**
     * Creates a new VistaAdministrarempleados.
     */
    public VistaAdministrarempleados() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAdministrarempleados and vista-administrarempleados
     */
    public interface VistaAdministrarempleadosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
