package interfaz;

import java.awt.Label;
import java.util.ArrayList;
import java.util.Iterator;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;

import basededatos.Producto;
import bds.BDPrincipal;
import bds.iCliente;
import vistas.VistaProductos;

public class Productos extends VistaProductos {
	//public ArrayList<Producto> _producto = new ArrayList<Producto>();
	
	iCliente clientes = new BDPrincipal();
	
	public Productos() {
		
/*		Producto[] productos = clientes.cargar_productos();
		
		//clientes.cargar_productos();
		//System.out.println(clientes.cargar_productos());
		
		Notification.show(productos[0].getNombre(),2000,Position.BOTTOM_CENTER);
		
//		for (int i = 0; i < productos.length; i++) {
//			System.out.println(productos[i].getNombre());
//		}*/
		
		Producto[] productos = clientes.cargar_productos();	
		
		this.getVaadinHorizontalLayout().removeAll();			
			for (int i = 0; i < productos.length; i++) {
			this.getVaadinHorizontalLayout().add(new interfaz.Producto(productos[i]));
		}	
		
	}
}