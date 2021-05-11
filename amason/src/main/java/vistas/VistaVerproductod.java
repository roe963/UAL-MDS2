package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-verproductod template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-verproductod")
@JsModule("./src/vista-verproductod.js")
public class VistaVerproductod extends PolymerTemplate<VistaVerproductod.VistaVerproductodModel> {

    /**
     * Creates a new VistaVerproductod.
     */
    public VistaVerproductod() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVerproductod and vista-verproductod
     */
    public interface VistaVerproductodModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
