package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vista-agregarcategoria template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-agregarcategoria")
@JsModule("./src/vista-agregarcategoria.js")
public class VistaAgregarcategoria extends PolymerTemplate<VistaAgregarcategoria.VistaAgregarcategoriaModel> {

    /**
     * Creates a new VistaAgregarcategoria.
     */
    public VistaAgregarcategoria() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAgregarcategoria and vista-agregarcategoria
     */
    public interface VistaAgregarcategoriaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
