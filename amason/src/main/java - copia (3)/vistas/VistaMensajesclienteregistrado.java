package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vista-mensajesclienteregistrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-mensajesclienteregistrado")
@JsModule("./src/vista-mensajesclienteregistrado.js")
public class VistaMensajesclienteregistrado extends PolymerTemplate<VistaMensajesclienteregistrado.VistaMensajesclienteregistradoModel> {

    /**
     * Creates a new VistaMensajesclienteregistrado.
     */
    public VistaMensajesclienteregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaMensajesclienteregistrado and vista-mensajesclienteregistrado
     */
    public interface VistaMensajesclienteregistradoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
