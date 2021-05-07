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
@Tag("vista-vercatalogocliente")
@JsModule("./src/vista-vercatalogocliente.js")
public class VistaVercatalogocliente extends PolymerTemplate<VistaVercatalogocliente.VistaVercatalogoclienteModel> {

    /**
     * Creates a new VistaCatalogo.
     */
    public VistaVercatalogocliente() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVercatalogocliente and vista-vercatalogocliente
     */
    public interface VistaVercatalogoclienteModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
