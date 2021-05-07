package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vista-agregarempleado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-agregarempleado")
@JsModule("./src/vista-agregarempleado.js")
public class VistaAgregarempleado extends PolymerTemplate<VistaAgregarempleado.VistaAgregarempleadoModel> {

    /**
     * Creates a new VistaAgregarempleado.
     */
    public VistaAgregarempleado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAgregarempleado and vista-agregarempleado
     */
    public interface VistaAgregarempleadoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
