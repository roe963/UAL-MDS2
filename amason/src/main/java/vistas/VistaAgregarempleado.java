package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-agregarempleado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-agregarempleado")
@JsModule("./src/vista-agregarempleado.js")
public class VistaAgregarempleado extends PolymerTemplate<VistaAgregarempleado.VistaAgregarempleadoModel> {

    @Id("textField-idUsuario")
	private TextField textFieldIdUsuario;
	@Id("textField-usuario")
	private TextField textFieldUsuario;
	@Id("textField-password")
	private TextField textFieldPassword;
	@Id("layout-selectTipoUsuario")
	private VerticalLayout layoutSelectTipoUsuario;
	@Id("select-tipoUsuario")
	private Select selectTipoUsuario;
	@Id("button-anadir")
	private Button buttonAnadir;

	/**
     * Creates a new VistaAgregarempleado.
     */
    public VistaAgregarempleado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAgregarempleado and vista-agregarempleado
     */
    public interface VistaAgregarempleadoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public TextField getTextFieldIdUsuario() {
		return textFieldIdUsuario;
	}

	public void setTextFieldIdUsuario(TextField textFieldIdUsuario) {
		this.textFieldIdUsuario = textFieldIdUsuario;
	}

	public TextField getTextFieldUsuario() {
		return textFieldUsuario;
	}

	public void setTextFieldUsuario(TextField textFieldUsuario) {
		this.textFieldUsuario = textFieldUsuario;
	}

	public TextField getTextFieldPassword() {
		return textFieldPassword;
	}

	public void setTextFieldPassword(TextField textFieldPassword) {
		this.textFieldPassword = textFieldPassword;
	}

	public VerticalLayout getLayoutSelectTipoUsuario() {
		return layoutSelectTipoUsuario;
	}

	public void setLayoutSelectTipoUsuario(VerticalLayout layoutSelectTipoUsuario) {
		this.layoutSelectTipoUsuario = layoutSelectTipoUsuario;
	}

	public Select getSelectTipoUsuario() {
		return selectTipoUsuario;
	}

	public void setSelectTipoUsuario(Select selectTipoUsuario) {
		this.selectTipoUsuario = selectTipoUsuario;
	}

	public Button getButtonAnadir() {
		return buttonAnadir;
	}

	public void setButtonAnadir(Button buttonAnadir) {
		this.buttonAnadir = buttonAnadir;
	}
    
}
