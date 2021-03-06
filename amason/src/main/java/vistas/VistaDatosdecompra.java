package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.dom.Element;

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
	private Select<String> formadepago;
	
	public TextField getTextfieldDireccion() {
		return textfieldDireccion;
	}

	public void setTextfieldDireccion(TextField textfieldDireccion) {
		this.textfieldDireccion = textfieldDireccion;
	}

	public Select<String> getFormadepago() {
        return formadepago;
    }

    public void setFormadepago(Select<String> formadepago) {
        this.formadepago = formadepago;
    }

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
