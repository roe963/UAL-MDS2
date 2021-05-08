package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vista-agregarproducto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-agregarproducto")
@JsModule("./src/vista-agregarproducto.js")
public class VistaAgregarproducto extends PolymerTemplate<VistaAgregarproducto.VistaAgregarproductoModel> {

    /**
     * Creates a new VistaAgregarproducto.
     */
    public VistaAgregarproducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAgregarproducto and vista-agregarproducto
     */
    public interface VistaAgregarproductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
