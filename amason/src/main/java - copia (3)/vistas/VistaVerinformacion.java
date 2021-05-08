package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vista-verinformacion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-verinformacion")
@JsModule("./src/vista-verinformacion.js")
public class VistaVerinformacion extends PolymerTemplate<VistaVerinformacion.VistaVerinformacionModel> {

    /**
     * Creates a new VistaVerinformacion.
     */
    public VistaVerinformacion() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVerinformacion and vista-verinformacion
     */
    public interface VistaVerinformacionModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
