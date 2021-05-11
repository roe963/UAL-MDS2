package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-veproducto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-veproducto")
@JsModule("./src/vista-veproducto.js")
public class VistaVeproducto extends PolymerTemplate<VistaVeproducto.VistaVeproductoModel> {

    /**
     * Creates a new VistaVeproducto.
     */
    public VistaVeproducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVeproducto and vista-veproducto
     */
    public interface VistaVeproductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
