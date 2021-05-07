package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-redactar template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-redactar")
@JsModule("./src/vista-redactar.js")
public class VistaRedactar extends PolymerTemplate<VistaRedactar.VistaRedactarModel> {

    /**
     * Creates a new VistaRedactar.
     */
    public VistaRedactar() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaRedactar and vista-redactar
     */
    public interface VistaRedactarModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
