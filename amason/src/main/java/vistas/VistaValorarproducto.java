package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-valorarproducto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-valorarproducto")
@JsModule("./src/vista-valorarproducto.js")
public class VistaValorarproducto extends PolymerTemplate<VistaValorarproducto.VistaValorarproductoModel> {

    @Id("h-nombreproducto")
    private H4 nombreproducto;
    
    @Id("layout-selectpuntuacion")
    private VerticalLayout selectPuntuacion;
    
    @Id("textarea-descripcionvaloracion")
    private TextArea descripcionValoracion;

    @Id("button-enviarvaloracion")
    private Button enviarValoracion;

    public H4 getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(H4 nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public VerticalLayout getSelectPuntuacion() {
        return selectPuntuacion;
    }

    public void setSelectPuntuacion(VerticalLayout selectPuntuacion) {
        this.selectPuntuacion = selectPuntuacion;
    }

    public TextArea getDescripcionValoracion() {
        return descripcionValoracion;
    }

    public void setDescripcionValoracion(TextArea descripcionValoracion) {
        this.descripcionValoracion = descripcionValoracion;
    }

    public Button getEnviarValoracion() {
        return enviarValoracion;
    }

    public void setEnviarValoracion(Button enviarValoracion) {
        this.enviarValoracion = enviarValoracion;
    }

    /**
     * Creates a new VistaValorarproducto.
     */
    public VistaValorarproducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaValorarproducto and vista-valorarproducto
     */
    public interface VistaValorarproductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
