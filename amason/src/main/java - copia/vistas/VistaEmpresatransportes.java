package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-empresatransportes template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-empresatransportes")
@JsModule("./src/vista-empresatransportes.js")
public class VistaEmpresatransportes extends PolymerTemplate<VistaEmpresatransportes.VistaEmpresatransportesModel> {

    /**
     * Creates a new VistaEmpresatransportes.
     */
    public VistaEmpresatransportes() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEmpresatransportes and vista-empresatransportes
     */
    public interface VistaEmpresatransportesModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
