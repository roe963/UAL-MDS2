package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-ofertas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ofertas")
@JsModule("./src/vista-ofertas.js")
public class VistaOfertas extends PolymerTemplate<VistaOfertas.VistaOfertasModel> {

    @Id("layout-ofertas")
    private HorizontalLayout layoutOfertas;
 

    public HorizontalLayout getLayoutOfertas() {
        return layoutOfertas;
    }


    public void setLayoutOfertas(HorizontalLayout layoutOfertas) {
        this.layoutOfertas = layoutOfertas;
    }


    /**
     * Creates a new VistaOfertas.
     */
    public VistaOfertas() {
        // You can initialise any data required for the connected UI components here.
    }

    
    /**
     * This model binds properties between VistaOfertas and vista-ofertas
     */
    public interface VistaOfertasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
