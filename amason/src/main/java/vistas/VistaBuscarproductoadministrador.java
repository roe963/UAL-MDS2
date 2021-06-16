package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-buscarproductoadministrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscarproductoadministrador")
@JsModule("./src/vista-buscarproductoadministrador.js")
public class VistaBuscarproductoadministrador extends PolymerTemplate<VistaBuscarproductoadministrador.VistaBuscarproductoadministradorModel> {
	
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("textfield-buscar")
	private TextField textfieldBuscar;
	@Id("button-buscar")
	private Button buttonBuscar;

	/**
     * Creates a new VistaBuscarproductoadministrador.
     */
    public VistaBuscarproductoadministrador() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaBuscarproductoadministrador and vista-buscarproductoadministrador
     */
    public interface VistaBuscarproductoadministradorModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public TextField getTextfieldBuscar() {
		return textfieldBuscar;
	}

	public void setTextfieldBuscar(TextField textfieldBuscar) {
		this.textfieldBuscar = textfieldBuscar;
	}

	public Button getButtonBuscar() {
		return buttonBuscar;
	}

	public void setButtonBuscar(Button buttonBuscar) {
		this.buttonBuscar = buttonBuscar;
	}
    
}
