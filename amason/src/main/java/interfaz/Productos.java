package interfaz;

import java.util.ArrayList;
import java.util.Iterator;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.html.Label;

import basededatos.Producto;
import bds.BDPrincipal;
import bds.iCliente;
import vistas.VistaProductos;

public class Productos extends VistaProductos {
	//public ArrayList<Producto> _producto = new ArrayList<Producto>();
	
	iCliente clientes = new BDPrincipal();
	
	public Productos() {
		
		Producto[] productos = clientes.cargar_productos();	
		
		this.getVaadinHorizontalLayout().removeAll();			
		if (productos.length != 0) {
            for (int i = 0; i < productos.length; i++) {
                this.getVaadinHorizontalLayout().add(new interfaz.Producto(productos[i]));
            }
        }else {
            Label titulo= new Label();
            titulo.setText("No hay productos en la BD");
            this.getVaadinHorizontalLayout().add(titulo);
        }
		
	}
}