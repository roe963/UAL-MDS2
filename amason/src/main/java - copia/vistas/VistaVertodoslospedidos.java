package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-vertodoslospedidos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-vertodoslospedidos")
@JsModule("./src/vista-vertodoslospedidos.js")
public class VistaVertodoslospedidos extends PolymerTemplate<VistaVertodoslospedidos.VistaVertodoslospedidosModel> {

    /**
     * Creates a new VistaVertodoslospedidos.
     */
    public VistaVertodoslospedidos() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVertodoslospedidos and vista-vertodoslospedidos
     */
    public interface VistaVertodoslospedidosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
