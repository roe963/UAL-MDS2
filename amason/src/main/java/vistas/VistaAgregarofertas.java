package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-agregarofertas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-agregarofertas")
@JsModule("./src/vista-agregarofertas.js")
public class VistaAgregarofertas extends PolymerTemplate<VistaAgregarofertas.VistaAgregarofertasModel> {

    /**
     * Creates a new VistaAgregarofertas.
     */
    public VistaAgregarofertas() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAgregarofertas and vista-agregarofertas
     */
    public interface VistaAgregarofertasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
