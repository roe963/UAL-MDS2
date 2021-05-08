package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vista-valorarproducto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-valorarproducto")
@JsModule("./src/vista-valorarproducto.js")
public class VistaValorarproducto extends PolymerTemplate<VistaValorarproducto.VistaValorarproductoModel> {

    /**
     * Creates a new VistaValorarproducto.
     */
    public VistaValorarproducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaValorarproducto and vista-valorarproducto
     */
    public interface VistaValorarproductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
