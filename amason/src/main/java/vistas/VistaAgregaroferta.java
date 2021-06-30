package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;

/**
 * A Designer generated component for the vista-agregaroferta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-agregaroferta")
@JsModule("./src/vista-agregaroferta.js")
public class VistaAgregaroferta extends PolymerTemplate<VistaAgregaroferta.VistaAgregarofertaModel> {

    @Id("layout-selectProducto")
	private VerticalLayout layoutSelectProducto;
	@Id("select-producto")
	private Select selectProducto;
	@Id("textField-precio")
	private TextField textFieldPrecio;
	@Id("button-anadir")
	private Button buttonAnadir;
	@Id("datePicker-fechaFinOferta")
	private DatePicker datePickerFechaFinOferta;

	/**
     * Creates a new VistaAgregaroferta.
     */
    public VistaAgregaroferta() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAgregaroferta and vista-agregaroferta
     */
    public interface VistaAgregarofertaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public VerticalLayout getLayoutSelectProducto() {
		return layoutSelectProducto;
	}

	public void setLayoutSelectProducto(VerticalLayout layoutSelectProducto) {
		this.layoutSelectProducto = layoutSelectProducto;
	}

	public Select getSelectProducto() {
		return selectProducto;
	}

	public void setSelectProducto(Select selectProducto) {
		this.selectProducto = selectProducto;
	}

	public TextField getTextFieldPrecio() {
		return textFieldPrecio;
	}

	public void setTextFieldPrecio(TextField textFieldPrecio) {
		this.textFieldPrecio = textFieldPrecio;
	}

	public Button getButtonAnadir() {
		return buttonAnadir;
	}

	public void setButtonAnadir(Button buttonAnadir) {
		this.buttonAnadir = buttonAnadir;
	}

	public DatePicker getDatePickerFechaFinOferta() {
		return datePickerFechaFinOferta;
	}

	public void setDatePickerFechaFinOferta(DatePicker datePickerFechaFinOferta) {
		this.datePickerFechaFinOferta = datePickerFechaFinOferta;
	}
    
}
