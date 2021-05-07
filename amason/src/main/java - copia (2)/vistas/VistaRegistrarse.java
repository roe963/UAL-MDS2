package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.select.Select;

/**
 * A Designer generated component for the vista-registrarse template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-registrarse")
@JsModule("./src/vista-registrarse.js")
public class VistaRegistrarse extends PolymerTemplate<VistaRegistrarse.VistaRegistrarseModel> {

	@Id("textarea-nombre")
	private TextField textareaNombre;
	@Id("textarea-email")
	private TextField textareaEmail;
	@Id("password")
	private PasswordField password;
	@Id("repeatpassword")
	private PasswordField repeatpassword;
	@Id("textarea-direccion")
	private TextField textareaDireccion;
	@Id("select-formadepago")
	private Select selectFormadepago;
	@Id("img-fotousaurio")
	private Image imgFotousaurio;
	@Id("textarea-fotousuario")
	private TextField textareaFotousuario;
	@Id("button-crearcuenta")
	protected Button buttonCrearcuenta;
	

	public TextField getTextareaNombre() {
		return textareaNombre;
	}

	public TextField getTextareaEmail() {
		return textareaEmail;
	}

	public PasswordField getPassword() {
		return password;
	}

	public PasswordField getRepeatpassword() {
		return repeatpassword;
	}

	public TextField getTextareaDireccion() {
		return textareaDireccion;
	}
	
	public Select getSelectFormadepago() {
		return selectFormadepago;
	}

	public Image getImgFotousaurio() {
		return imgFotousaurio;
	}

	public TextField getTextareaFotousuario() {
		return textareaFotousuario;
	}

	public Button getButtonCrearcuenta() {
		return buttonCrearcuenta;
	}

	/**
     * Creates a new VistaRegistrarse.
     */
    public VistaRegistrarse() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaRegistrarse and vista-registrarse
     */
    public interface VistaRegistrarseModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
