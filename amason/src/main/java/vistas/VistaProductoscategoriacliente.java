package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-productoscategoriacliente template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productoscategoriacliente")
@JsModule("./src/vista-productoscategoriacliente.js")
public class VistaProductoscategoriacliente extends PolymerTemplate<VistaProductoscategoriacliente.VistaProductoscategoriaclienteModel> {

	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("layoutSelectCategoria")
	private Element layoutSelectCategoria;

	/**
     * Creates a new VistaProductoscategoriacliente.
     */
    public VistaProductoscategoriacliente() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductoscategoriacliente and vista-productoscategoriacliente
     */
    public interface VistaProductoscategoriaclienteModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Element getLayoutSelectCategoria() {
		return layoutSelectCategoria;
	}

	public void setLayoutSelectCategoria(Element layoutSelectCategoria) {
		this.layoutSelectCategoria = layoutSelectCategoria;
	}
    
}
