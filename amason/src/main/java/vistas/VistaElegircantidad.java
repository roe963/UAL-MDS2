package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vista-elegircantidad template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-elegircantidad")
@JsModule("./src/vista-elegircantidad.js")
public class VistaElegircantidad extends PolymerTemplate<VistaElegircantidad.VistaElegircantidadModel> {

    /**
     * Creates a new VistaElegircantidad.
     */
    public VistaElegircantidad() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaElegircantidad and vista-elegircantidad
     */
    public interface VistaElegircantidadModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
