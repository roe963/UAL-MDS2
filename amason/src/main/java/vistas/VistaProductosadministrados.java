package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.html.H4;

/**
 * A Designer generated component for the vista-productosadministrados template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productosadministrados")
@JsModule("./src/vista-productosadministrados.js")
public class VistaProductosadministrados extends PolymerTemplate<VistaProductosadministrados.VistaProductosadministradosModel> {

    @Id("layout-productos")
	private VerticalLayout layoutProductos;
//	@Id("vistaProductoAdministrado")
//	private Element vistaProductoAdministrado;
	/**
     * Creates a new VistaProductosadministrados.
     */
    public VistaProductosadministrados() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductosadministrados and vista-productosadministrados
     */
    public interface VistaProductosadministradosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public VerticalLayout getLayoutProductos() {
		return layoutProductos;
	}

	public void setLayoutProductos(VerticalLayout layoutProductos) {
		this.layoutProductos = layoutProductos;
	}

//	public Element getVistaProductoAdministrado() {
//		return vistaProductoAdministrado;
//	}
//
//	public void setVistaProductoAdministrado(Element vistaProductoAdministrado) {
//		this.vistaProductoAdministrado = vistaProductoAdministrado;
//	}
    
}
