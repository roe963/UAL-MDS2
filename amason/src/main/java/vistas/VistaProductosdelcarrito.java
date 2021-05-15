package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-productosdelcarrito template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productosdelcarrito")
@JsModule("./src/vista-productosdelcarrito.js")
public class VistaProductosdelcarrito extends PolymerTemplate<VistaProductosdelcarrito.VistaProductosdelcarritoModel> {

    @Id("VlProductos")
	private VerticalLayout vlProductos;

	public VerticalLayout getVlProductos() {
		return vlProductos;
	}

	public void setVlProductos(VerticalLayout vlProductos) {
		this.vlProductos = vlProductos;
	}

	/**
     * Creates a new VistaProductosdelcarrito.
     */
    public VistaProductosdelcarrito() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductosdelcarrito and vista-productosdelcarrito
     */
    public interface VistaProductosdelcarritoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
