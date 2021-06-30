package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-ofertaadministrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ofertaadministrador")
@JsModule("./src/vista-ofertaadministrador.js")
public class VistaOfertaadministrador extends PolymerTemplate<VistaOfertaadministrador.VistaOfertaadministradorModel> {

    @Id("layout-oferta")
	private HorizontalLayout layoutOferta;
	@Id("label-producto")
	private Label labelProducto;
	@Id("label-precio")
	private Label labelPrecio;
	@Id("label-fecha")
	private Label labelFecha;
	@Id("button-eliminar")
	private Button buttonEliminar;

	/**
     * Creates a new VistaOfertaadministrador.
     */
    public VistaOfertaadministrador() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaOfertaadministrador and vista-ofertaadministrador
     */
    public interface VistaOfertaadministradorModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public HorizontalLayout getLayoutOferta() {
		return layoutOferta;
	}

	public void setLayoutOferta(HorizontalLayout layoutOferta) {
		this.layoutOferta = layoutOferta;
	}

	public Label getLabelProducto() {
		return labelProducto;
	}

	public void setLabelProducto(Label labelProducto) {
		this.labelProducto = labelProducto;
	}

	public Label getLabelPrecio() {
		return labelPrecio;
	}

	public void setLabelPrecio(Label labelPrecio) {
		this.labelPrecio = labelPrecio;
	}

	public Label getLabelFecha() {
		return labelFecha;
	}

	public void setLabelFecha(Label labelFecha) {
		this.labelFecha = labelFecha;
	}

	public Button getButtonEliminar() {
		return buttonEliminar;
	}

	public void setButtonEliminar(Button buttonEliminar) {
		this.buttonEliminar = buttonEliminar;
	}
    
}
