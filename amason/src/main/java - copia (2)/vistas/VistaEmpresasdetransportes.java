package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-empresasdetransportes template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-empresasdetransportes")
@JsModule("./src/vista-empresasdetransportes.js")
public class VistaEmpresasdetransportes extends PolymerTemplate<VistaEmpresasdetransportes.VistaEmpresasdetransportesModel> {

    /**
     * Creates a new VistaEmpresasdetransportes.
     */
    public VistaEmpresasdetransportes() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEmpresasdetransportes and vista-empresasdetransportes
     */
    public interface VistaEmpresasdetransportesModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
