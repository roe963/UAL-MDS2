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
import com.vaadin.flow.component.checkbox.Checkbox;

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
	@Id("textField-imagen")
	private TextField textFieldImagen;
	@Id("button-anadir")
	private Button buttonAnadir;
	@Id("checkbox-productoActivo")
	private Checkbox checkboxProductoActivo;
	@Id("textField-idProducto")
	private TextField textFieldIdProducto;
	@Id("textField-idFoto")
	private TextField textFieldIdFoto;
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

	public TextField getTextFieldImagen() {
		return textFieldImagen;
	}

	public void setTextFieldImagen(TextField textFieldImagen1) {
		this.textFieldImagen = textFieldImagen1;
	}

	public Button getButtonAnadir() {
		return buttonAnadir;
	}

	public void setButtonAnadir(Button buttonAnadir) {
		this.buttonAnadir = buttonAnadir;
	}

	public Checkbox getCheckboxProductoActivo() {
		return checkboxProductoActivo;
	}

	public void setCheckboxProductoActivo(Checkbox checkboxProductoActivo) {
		this.checkboxProductoActivo = checkboxProductoActivo;
	}

	public TextField getTextFieldIdProducto() {
		return textFieldIdProducto;
	}

	public void setTextFieldIdProducto(TextField textFieldIdProducto) {
		this.textFieldIdProducto = textFieldIdProducto;
	}

	public TextField getTextFieldIdFoto() {
		return textFieldIdFoto;
	}

	public void setTextFieldIdFoto(TextField textFieldIdFoto) {
		this.textFieldIdFoto = textFieldIdFoto;
	}
    
}
