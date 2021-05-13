package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-valoracion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-valoracion")
@JsModule("./src/vista-valoracion.js")
public class VistaValoracion extends PolymerTemplate<VistaValoracion.VistaValoracionModel> {

    @Id("label-fecha")
	private Label labelFecha;
	@Id("label-descripcion")
	private Label labelDescripcion;

	public HorizontalLayout getHlValoracion() {
		return hlValoracion;
	}

	public void setHlValoracion(HorizontalLayout hlValoracion) {
		this.hlValoracion = hlValoracion;
	}

	@Id("hlvaloracion")
	private HorizontalLayout hlValoracion;

	public Label getLabelFecha() {
		return labelFecha;
	}

	public void setLabelFecha(Label labelFecha) {
		this.labelFecha = labelFecha;
	}

	public Label getLabelDescripcion() {
		return labelDescripcion;
	}

	public void setLabelDescripcion(Label labelDescripcion) {
		this.labelDescripcion = labelDescripcion;
	}

	/**
     * Creates a new VistaValoracion.
     */
    public VistaValoracion() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaValoracion and vista-valoracion
     */
    public interface VistaValoracionModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
