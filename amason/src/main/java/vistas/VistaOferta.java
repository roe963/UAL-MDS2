package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vista-oferta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-oferta")
@JsModule("./src/vista-oferta.js")
public class VistaOferta extends PolymerTemplate<VistaOferta.VistaOfertaModel> {

    /**
     * Creates a new VistaOferta.
     */
    public VistaOferta() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaOferta and vista-oferta
     */
    public interface VistaOfertaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
