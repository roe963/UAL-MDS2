package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vista-verperfil template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-verperfil")
@JsModule("./src/vista-verperfil.js")
public class VistaVerperfil extends PolymerTemplate<VistaVerperfil.VistaVerperfilModel> {

    @Id("textfield-nombre")
	private TextField textfieldNombre;
	@Id("correoElectrónico")
	private TextField correoElectrónico;
	@Id("radio-estado")
	private RadioButtonGroup<String> radioEstado;
	@Id("img-fotousuario")
	private Image imgFotousuario;
	@Id("textfield-fotousuario")
	private TextField textfieldFotousuario;
	@Id("button-guardar")
	private Button buttonGuardar;
	@Id("vistaDatosdecompra")
	private VistaDatosdecompra vistaDatosdecompra;

	/**
     * Creates a new VistaVerperfil.
     */
    public VistaVerperfil() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVerperfil and vista-verperfil
     */
    public interface VistaVerperfilModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
