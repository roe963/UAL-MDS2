package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.TextField;

import basededatos.Categoria;
import basededatos.Producto;
import bds.BDPrincipal;
import bds.iCliente;
import ual.mds2.ortegaortega.ViewChanger;
import vistas.VistaBuscarproductoadministrador;

public class Buscar_producto_administrador extends VistaBuscarproductoadministrador {
	
	Select<Categoria> labelSelect = new Select<>();
	String cadena = "";
	
	iCliente clientes = new BDPrincipal();
	
	public Buscar_producto_administrador() {
		super();
		// TODO Auto-generated constructor stub
		
		ViewChanger cambiarVista = new ViewChanger();
		TextField txtBuscar = this.getTextfieldBuscar();
		Button btnBuscar = this.getButtonBuscar();
		
		btnBuscar.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                if (txtBuscar.isEmpty()) {
                	//cambiarVista.CambiarVista(new Ver_catalogo_cliente());
                	cambiarVista.CambiarVista(new Ver_catalogo_administrador());
                	System.out.println("Vacio");
    			} else {
    				//cambiarVista.CambiarVista(new Buscar_producto_cliente(txtBuscar.getValue()));
    				cambiarVista.CambiarVista(new Buscar_producto_administrador(txtBuscar.getValue()));
    			}
            }
        });
		
		// Crear la interfaz lista productos		
		this.getVaadinHorizontalLayout().removeAll();
		this.getVaadinHorizontalLayout().add(new Productos());
	}
	
	public Buscar_producto_administrador(String nombreProducto) {
		super();		
		// Crear la interfaz lista productos		
		//this.getVaadinHorizontalLayout().removeAll();
		//this.getVaadinHorizontalLayout().add(new Productos());
		busqueda_producto(nombreProducto);
	}

	public void busqueda_producto(String nombreProducto) {
		Producto[] productos = clientes.busqueda_producto(nombreProducto);
		
		this.getVaadinHorizontalLayout().removeAll();			
		if (productos.length != 0) {
            for (int i = 0; i < productos.length; i++) {
                this.getVaadinHorizontalLayout().add(new interfaz.Producto(productos[i]));
            }
        }else {
            Label titulo= new Label();
            titulo.setText("No disponemos de productos con ese nombre.");
            this.getVaadinHorizontalLayout().add(titulo);
        }
	}
}