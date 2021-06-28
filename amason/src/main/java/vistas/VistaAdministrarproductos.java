package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-administrarproductos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-administrarproductos")
@JsModule("./src/vista-administrarproductos.js")
public class VistaAdministrarproductos extends PolymerTemplate<VistaAdministrarproductos.VistaAdministrarproductosModel> {
	
    //////Barra Navegacion /////
    @Id("layout-menu")
    private VerticalLayout layoutMenu;
    
    public VerticalLayout getLayoutMenu() {
        return layoutMenu;
    }

    public void setLayoutMenu(VerticalLayout layoutMenu) {
        this.layoutMenu = layoutMenu;
    }
    //////Barra Navegacion /////
	
	@Id("layout-productos")
	private HorizontalLayout layoutProductos;
	@Id("button-guardar")
	private Button buttonGuardar;
	@Id("layout-anadirProducto")
	private VerticalLayout layoutAnadirProducto;
	@Id("textFlield-buscar")
	private TextField textFlieldBuscar;
	@Id("button-buscar")
	private Button buttonBuscar;

	/**
     * Creates a new VistaAdministrarproductos.
     */
    public VistaAdministrarproductos() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAdministrarproductos and vista-administrarproductos
     */
    public interface VistaAdministrarproductosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public TextField getTextFlieldBuscar() {
		return textFlieldBuscar;
	}

	public void setTextFlieldBuscar(TextField textFlieldBuscar) {
		this.textFlieldBuscar = textFlieldBuscar;
	}

	public HorizontalLayout getLayoutProductos() {
		return layoutProductos;
	}

	public void setLayoutProductos(HorizontalLayout layoutProductos) {
		this.layoutProductos = layoutProductos;
	}

	public Button getButtonGuardar() {
		return buttonGuardar;
	}

	public void setButtonGuardar(Button buttonGuardar) {
		this.buttonGuardar = buttonGuardar;
	}

	public VerticalLayout getLayoutAnadirProducto() {
		return layoutAnadirProducto;
	}

	public void setLayoutAnadirProducto(VerticalLayout layoutAnadirProducto) {
		this.layoutAnadirProducto = layoutAnadirProducto;
	}

	public Button getButtonBuscar() {
		return buttonBuscar;
	}

	public void setButtonBuscar(Button buttonBuscar) {
		this.buttonBuscar = buttonBuscar;
	}
    
}
