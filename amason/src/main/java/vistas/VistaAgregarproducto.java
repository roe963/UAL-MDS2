package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-agregarproducto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-agregarproducto")
@JsModule("./src/vista-agregarproducto.js")
public class VistaAgregarproducto extends PolymerTemplate<VistaAgregarproducto.VistaAgregarproductoModel> {

    @Id("textField-nombre")
	private TextField textFieldNombre;
	@Id("layout-selectCategoria")
	private VerticalLayout layoutSelectCategoria;
	@Id("select-categoria")
	private Select selectCategoria;
	@Id("textField-precio")
	private TextField textFieldPrecio;
	@Id("textArea-descripcion")
	private TextArea textAreaDescripcion;
	@Id("textField-imagen1")
	private TextField textFieldImagen1;
	@Id("textField-imagen2")
	private TextField textFieldImagen2;
	@Id("textField-imagen3")
	private TextField textFieldImagen3;
	@Id("textField-imagen4")
	private TextField textFieldImagen4;
	@Id("textField-imagen5")
	private TextField textFieldImagen5;
	@Id("layout-imagenPrincipal")
	private VerticalLayout layoutImagenPrincipal;
	@Id("button-anadir")
	private Button buttonAnadir;

	/**
     * Creates a new VistaAgregarproducto.
     */
    public VistaAgregarproducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAgregarproducto and vista-agregarproducto
     */
    public interface VistaAgregarproductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public TextField getTextFieldNombre() {
		return textFieldNombre;
	}

	public void setTextFieldNombre(TextField textFieldNombre) {
		this.textFieldNombre = textFieldNombre;
	}

	public VerticalLayout getLayoutSelectCategoria() {
		return layoutSelectCategoria;
	}

	public void setLayoutSelectCategoria(VerticalLayout layoutSelectCategoria) {
		this.layoutSelectCategoria = layoutSelectCategoria;
	}

	public Select getSelectCategoria() {
		return selectCategoria;
	}

	public void setSelectCategoria(Select selectCategoria) {
		this.selectCategoria = selectCategoria;
	}

	public TextField getTextFieldPrecio() {
		return textFieldPrecio;
	}

	public void setTextFieldPrecio(TextField textFieldPrecio) {
		this.textFieldPrecio = textFieldPrecio;
	}

	public TextArea getTextAreaDescripcion() {
		return textAreaDescripcion;
	}

	public void setTextAreaDescripcion(TextArea textAreaDescripcion) {
		this.textAreaDescripcion = textAreaDescripcion;
	}

	public TextField getTextFieldImagen1() {
		return textFieldImagen1;
	}

	public void setTextFieldImagen1(TextField textFieldImagen1) {
		this.textFieldImagen1 = textFieldImagen1;
	}

	public TextField getTextFieldImagen2() {
		return textFieldImagen2;
	}

	public void setTextFieldImagen2(TextField textFieldImagen2) {
		this.textFieldImagen2 = textFieldImagen2;
	}

	public TextField getTextFieldImagen3() {
		return textFieldImagen3;
	}

	public void setTextFieldImagen3(TextField textFieldImagen3) {
		this.textFieldImagen3 = textFieldImagen3;
	}

	public TextField getTextFieldImagen4() {
		return textFieldImagen4;
	}

	public void setTextFieldImagen4(TextField textFieldImagen4) {
		this.textFieldImagen4 = textFieldImagen4;
	}

	public TextField getTextFieldImagen5() {
		return textFieldImagen5;
	}

	public void setTextFieldImagen5(TextField textFieldImagen5) {
		this.textFieldImagen5 = textFieldImagen5;
	}

	public VerticalLayout getLayoutImagenPrincipal() {
		return layoutImagenPrincipal;
	}

	public void setLayoutImagenPrincipal(VerticalLayout layoutImagenPrincipal) {
		this.layoutImagenPrincipal = layoutImagenPrincipal;
	}

	public Button getButtonAnadir() {
		return buttonAnadir;
	}

	public void setButtonAnadir(Button buttonAnadir) {
		this.buttonAnadir = buttonAnadir;
	}
    
}
