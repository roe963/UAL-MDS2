package interfaz;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.select.Select;

import basededatos.Categoria;
import basededatos.Producto;
import bds.BDPrincipal;
import bds.iCliente;
import vistas.VistaBuscarproductocliente;

public class Buscar_producto_cliente extends VistaBuscarproductocliente {
	
	Select<Categoria> labelSelect = new Select<>();
	String cadena = "";
	
	iCliente clientes = new BDPrincipal();
	
	public Buscar_producto_cliente() {
		super();
		// TODO Auto-generated constructor stub
		
		// Crear la interfaz lista productos		
		this.getVaadinHorizontalLayout().removeAll();
		this.getVaadinHorizontalLayout().add(new Productos());
	}
	
	public Buscar_producto_cliente(String nombreProducto) {
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