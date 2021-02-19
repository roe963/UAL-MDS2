package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-catalogo template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-catalogo")
@JsModule("./src/vista-catalogo.js")
public class VistaCatalogo extends PolymerTemplate<VistaCatalogo.VistaCatalogoModel> {

    /**
     * Creates a new VistaCatalogo.
     */
    public VistaCatalogo() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCatalogo and vista-catalogo
     */
    public interface VistaCatalogoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
