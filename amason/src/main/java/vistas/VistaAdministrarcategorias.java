package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-administrarcategorias template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-administrarcategorias")
@JsModule("./src/vista-administrarcategorias.js")
public class VistaAdministrarcategorias extends PolymerTemplate<VistaAdministrarcategorias.VistaAdministrarcategoriasModel> {

    /**
     * Creates a new VistaAdministrarcategorias.
     */
    public VistaAdministrarcategorias() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAdministrarcategorias and vista-administrarcategorias
     */
    public interface VistaAdministrarcategoriasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
