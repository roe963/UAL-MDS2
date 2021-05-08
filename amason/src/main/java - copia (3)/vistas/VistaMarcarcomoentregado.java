package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vista-marcarcomoentregado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-marcarcomoentregado")
@JsModule("./src/vista-marcarcomoentregado.js")
public class VistaMarcarcomoentregado extends PolymerTemplate<VistaMarcarcomoentregado.VistaMarcarcomoentregadoModel> {

    /**
     * Creates a new VistaMarcarcomoentregado.
     */
    public VistaMarcarcomoentregado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaMarcarcomoentregado and vista-marcarcomoentregado
     */
    public interface VistaMarcarcomoentregadoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
