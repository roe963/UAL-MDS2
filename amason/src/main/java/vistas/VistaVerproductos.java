package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-verproductos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-verproductos")
@JsModule("./src/vista-verproductos.js")
public class VistaVerproductos extends PolymerTemplate<VistaVerproductos.VistaVerproductosModel> {

    /**
     * Creates a new VistaVerproductos.
     */
    public VistaVerproductos() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVerproductos and vista-verproductos
     */
    public interface VistaVerproductosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
