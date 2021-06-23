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
	
    @Id("textFlield-buscar")
	private TextField textFlieldNombre;
	@Id("textFlield-precio")
	private TextField textFlieldPrecio;
	@Id("descripción")
	private TextArea descripción;
	@Id("textFlield-imagen1")
	private TextField textFlieldImagen1;
	@Id("textFlield-imagen2")
	private TextField textFlieldImagen2;
	@Id("textFlield-imagen3")
	private TextField textFlieldImagen3;
	@Id("textFlield-imagen4")
	private TextField textFlieldImagen4;
	@Id("textFlield-imagen5")
	private TextField textFlieldImagen5;
	@Id("radioGroup-imagen")
	private RadioButtonGroup<String> radioGroupImagen;
	@Id("button-anadir")
	private Button buttonAnadir;
	@Id("select-categoria")
	private Select selectCategoria;

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

	public TextField getTextFlieldNombre() {
		return textFlieldNombre;
	}

	public void setTextFlieldNombre(TextField textFlieldNombre) {
		this.textFlieldNombre = textFlieldNombre;
	}

	public TextField getTextFlieldPrecio() {
		return textFlieldPrecio;
	}

	public void setTextFlieldPrecio(TextField textFlieldPrecio) {
		this.textFlieldPrecio = textFlieldPrecio;
	}

	public TextArea getDescripción() {
		return descripción;
	}

	public void setDescripción(TextArea descripción) {
		this.descripción = descripción;
	}

	public TextField getTextFlieldImagen1() {
		return textFlieldImagen1;
	}

	public void setTextFlieldImagen1(TextField textFlieldImagen1) {
		this.textFlieldImagen1 = textFlieldImagen1;
	}

	public TextField getTextFlieldImagen2() {
		return textFlieldImagen2;
	}

	public void setTextFlieldImagen2(TextField textFlieldImagen2) {
		this.textFlieldImagen2 = textFlieldImagen2;
	}

	public TextField getTextFlieldImagen3() {
		return textFlieldImagen3;
	}

	public void setTextFlieldImagen3(TextField textFlieldImagen3) {
		this.textFlieldImagen3 = textFlieldImagen3;
	}

	public TextField getTextFlieldImagen4() {
		return textFlieldImagen4;
	}

	public void setTextFlieldImagen4(TextField textFlieldImagen4) {
		this.textFlieldImagen4 = textFlieldImagen4;
	}

	public TextField getTextFlieldImagen5() {
		return textFlieldImagen5;
	}

	public void setTextFlieldImagen5(TextField textFlieldImagen5) {
		this.textFlieldImagen5 = textFlieldImagen5;
	}

	public RadioButtonGroup<String> getRadioGroupImagen() {
		return radioGroupImagen;
	}

	public void setRadioGroupImagen(RadioButtonGroup<String> radioGroupImagen) {
		this.radioGroupImagen = radioGroupImagen;
	}

	public Button getButtonAnadir() {
		return buttonAnadir;
	}

	public void setButtonAnadir(Button buttonAnadir) {
		this.buttonAnadir = buttonAnadir;
	}

	public Select getSelectCategoria() {
		return selectCategoria;
	}

	public void setSelectCategoria(Select selectCategoria) {
		this.selectCategoria = selectCategoria;
	}
    
}
