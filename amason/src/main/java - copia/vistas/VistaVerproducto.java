package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-verproducto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-verproductos")
@JsModule("./src/vista-verproducto.js")
public class VistaVerproducto extends PolymerTemplate<VistaVerproducto.VistaVerproductoModel> {

    /**
     * Creates a new VistaVerproducto.
     */
    public VistaVerproducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVerproducto and vista-verproducto
     */
    public interface VistaVerproductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
