package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-veperfil template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-veperfil")
@JsModule("./src/vista-veperfil.js")
public class VistaVeperfil extends PolymerTemplate<VistaVeperfil.VistaVeperfilModel> {

    //////Barra Navegacion /////
    @Id("layout-menu")
    private VerticalLayout layoutMenu;

    public VerticalLayout getLayoutMenu() {
        return layoutMenu;
    }

    public void setLayoutMenu(VerticalLayout layoutMenu) {
        this.layoutMenu = layoutMenu;
    }
    ////// Barra Navegacion /////
	
	@Id("img-fotousuario")
	private Image imgFotousuario;
	@Id("textfield-nombre")
	private TextField textfieldNombre;
	@Id("correoElectrónico")
	private TextField correoElectrónico;
	@Id("button-guardar")
	private Button buttonGuardar;
	@Id("vlEstado")
	private VerticalLayout vlEstado;
	
	public TextField getTextfieldFotousuario() {
		return textfieldFotousuario;
	}

	public void setTextfieldFotousuario(TextField textfieldFotousuario) {
		this.textfieldFotousuario = textfieldFotousuario;
	}

	@Id("textfield-fotousuario")
	private TextField textfieldFotousuario;
	
	
	@Id("vlDireccionyformaPago")
	private VerticalLayout vlDireccionyformaPago;


	
	
	public VerticalLayout getVlDireccionyformaPago() {
		return vlDireccionyformaPago;
	}

	public void setVlDireccionyformaPago(VerticalLayout vlDireccionyformaPago) {
		this.vlDireccionyformaPago = vlDireccionyformaPago;
	}

	public Button getButtonGuardar() {
		return buttonGuardar;
	}

	public void setButtonGuardar(Button buttonGuardar) {
		this.buttonGuardar = buttonGuardar;
	}

	public VerticalLayout getVlEstado() {
		return vlEstado;
	}

	public void setVlEstado(VerticalLayout vlEstado) {
		this.vlEstado = vlEstado;
	}

	public TextField getTextfieldNombre() {
		return textfieldNombre;
	}

	public void setTextfieldNombre(TextField textfieldNombre) {
		this.textfieldNombre = textfieldNombre;
	}

	public TextField getCorreoElectrónico() {
		return correoElectrónico;
	}

	public void setCorreoElectrónico(TextField correoElectrónico) {
		this.correoElectrónico = correoElectrónico;
	}



	public Image getImgFotousuario() {
		return imgFotousuario;
	}

	public void setImgFotousuario(Image imgFotousuario) {
		this.imgFotousuario = imgFotousuario;
	}

	/**
     * Creates a new VistaVeperfil.
     */
    public VistaVeperfil() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVeperfil and vista-veperfil
     */
    public interface VistaVeperfilModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
