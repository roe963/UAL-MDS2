package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.select.Select;

/**
 * A Designer generated component for the vista-datosdecompra template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-datosdecompra")
@JsModule("./src/vista-datosdecompra.js")
public class VistaDatosdecompra extends PolymerTemplate<VistaDatosdecompra.VistaDatosdecompraModel> {

    @Id("textfield-direccion")
	private TextField textfieldDireccion;
	@Id("select-formadepago")
	private Select selectFormadepago;

	/**
     * Creates a new VistaDatosdecompra.
     */
    public VistaDatosdecompra() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaDatosdecompra and vista-datosdecompra
     */
    public interface VistaDatosdecompraModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
