package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vista-vermensajesclienteregistrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-vermensajesclienteregistrado")
@JsModule("./src/vista-vermensajesclienteregistrado.js")
public class VistaVermensajesclienteregistrado extends PolymerTemplate<VistaVermensajesclienteregistrado.VistaVermensajesclienteregistradoModel> {

    /**
     * Creates a new VistaVermensajesclienteregistrado.
     */
    public VistaVermensajesclienteregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVermensajesclienteregistrado and vista-vermensajesclienteregistrado
     */
    public interface VistaVermensajesclienteregistradoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
