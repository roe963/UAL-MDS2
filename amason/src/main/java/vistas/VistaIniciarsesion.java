package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-iniciarsesion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-iniciarsesion")
@JsModule("./src/vista-iniciarsesion.js")
public class VistaIniciarsesion extends PolymerTemplate<VistaIniciarsesion.VistaIniciarsesionModel> {

	@Id("login")
	private LoginForm loginForm;
	
	
    public LoginForm getLoginForm() {
		return loginForm;
	}

	public void setLoginForm(LoginForm loginForm) {
		this.loginForm = loginForm;
	}

	/**
     * Creates a new VistaIniciarsesion.
     */
    public VistaIniciarsesion() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaIniciarsesion and vista-iniciarsesion
     */
    public interface VistaIniciarsesionModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
