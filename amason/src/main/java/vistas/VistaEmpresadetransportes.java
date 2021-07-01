package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.checkbox.Checkbox;

/**
 * A Designer generated component for the vista-empresadetransportes template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-empresadetransportes")
@JsModule("./src/vista-empresadetransportes.js")
public class VistaEmpresadetransportes extends PolymerTemplate<VistaEmpresadetransportes.VistaEmpresadetransportesModel> {

    @Id("layout-empresaTransportes")
	private HorizontalLayout layoutEmpresaTransportes;
	@Id("label-empresaTransportes")
	private Label labelEmpresaTransportes;
	@Id("checkbox-empresaTransportes")
	private Checkbox checkboxEmpresaTransportes;

	/**
     * Creates a new VistaEmpresadetransportes.
     */
    public VistaEmpresadetransportes() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEmpresadetransportes and vista-empresadetransportes
     */
    public interface VistaEmpresadetransportesModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public HorizontalLayout getLayoutEmpresaTransportes() {
		return layoutEmpresaTransportes;
	}

	public void setLayoutEmpresaTransportes(HorizontalLayout layoutEmpresaTransportes) {
		this.layoutEmpresaTransportes = layoutEmpresaTransportes;
	}

	public Label getLabelEmpresaTransportes() {
		return labelEmpresaTransportes;
	}

	public void setLabelEmpresaTransportes(Label labelEmpresaTransportes) {
		this.labelEmpresaTransportes = labelEmpresaTransportes;
	}

	public Checkbox getCheckboxEmpresaTransportes() {
		return checkboxEmpresaTransportes;
	}

	public void setCheckboxEmpresaTransportes(Checkbox checkboxEmpresaTransportes) {
		this.checkboxEmpresaTransportes = checkboxEmpresaTransportes;
	}
    
}
