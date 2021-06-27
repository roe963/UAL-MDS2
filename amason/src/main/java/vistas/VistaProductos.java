package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;

import basededatos.Producto;
import bds.BDPrincipal;
import bds.iCliente;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-productos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productos")
@JsModule("./src/vista-productos.js")
public class VistaProductos extends PolymerTemplate<VistaProductos.VistaProductosModel> {

    @Id("layout-productos")
    private HorizontalLayout layoutProductos;

	public HorizontalLayout getLayoutProductos() {
        return layoutProductos;
    }

    public void setLayoutProductos(HorizontalLayout layoutProductos) {
        this.layoutProductos = layoutProductos;
    }

    /**
     * Creates a new VistaProductos.
     */
    public VistaProductos() {
        // You can initialise any data required for the connected UI components here.
    	
    }
    
    /*void cargar_productos() {
    	vaadinHorizontalLayout.removeAll();
    	
    	Producto[] productos = cliente.cargar_productos();

        for (int i = 0; i < productos.length; i++) {
            vaadinHorizontalLayout.add(new interfaz.Producto(productos[i]));
        }
    }*/

    /**
     * This model binds properties between VistaProductos and vista-productos
     */
    public interface VistaProductosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

