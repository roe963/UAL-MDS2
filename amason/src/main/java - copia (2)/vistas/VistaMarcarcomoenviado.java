package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-marcarcomoenviado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-marcarcomoenviado")
@JsModule("./src/vista-marcarcomoenviado.js")
public class VistaMarcarcomoenviado extends PolymerTemplate<VistaMarcarcomoenviado.VistaMarcarcomoenviadoModel> {

    /**
     * Creates a new VistaMarcarcomoenviado.
     */
    public VistaMarcarcomoenviado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaMarcarcomoenviado and vista-marcarcomoenviado
     */
    public interface VistaMarcarcomoenviadoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
