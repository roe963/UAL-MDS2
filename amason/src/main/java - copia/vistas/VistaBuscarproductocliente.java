package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-buscarproductocliente template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscarproductocliente")
@JsModule("./src/vista-buscarproductocliente.js")
public class VistaBuscarproductocliente extends PolymerTemplate<VistaBuscarproductocliente.VistaBuscarproductoclienteModel> {

    /**
     * Creates a new VistaBuscarproductocliente.
     */
    public VistaBuscarproductocliente() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaBuscarproductocliente and vista-buscarproductocliente
     */
    public interface VistaBuscarproductoclienteModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
