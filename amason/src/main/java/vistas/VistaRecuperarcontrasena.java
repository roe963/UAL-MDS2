package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-recuperarcontrasena template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-recuperarcontrasena")
@JsModule("./src/vista-recuperarcontrasena.js")
public class VistaRecuperarcontrasena extends PolymerTemplate<VistaRecuperarcontrasena.VistaRecuperarcontrasenaModel> {

    @Id("input-user")
    private TextField inputUser;
    @Id("btn-recuperar")
    private Button btnRecuperar;
    
    

    public TextField getInputUser() {
        return inputUser;
    }

    public void setInputUser(TextField inputUser) {
        this.inputUser = inputUser;
    }

    public Button getBtnRecuperar() {
        return btnRecuperar;
    }

    public void setBtnRecuperar(Button btnRecuperar) {
        this.btnRecuperar = btnRecuperar;
    }

    /**
     * Creates a new VistaRecuperarcontrasena.
     */
    public VistaRecuperarcontrasena() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaRecuperarcontrasena and vista-recuperarcontrasena
     */
    public interface VistaRecuperarcontrasenaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
