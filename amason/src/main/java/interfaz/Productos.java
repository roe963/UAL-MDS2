package interfaz;

import java.util.ArrayList;
import java.util.Iterator;

import bds.BDPrincipal;
import bds.iCliente;
import vistas.VistaProductos;

public class Productos extends VistaProductos {
	public ArrayList<Producto> _producto = new ArrayList<Producto>();
	
	iCliente clientes = new BDPrincipal();
	
	public Productos() {
		
//		basededatos.Producto[] productos = null;
//		productos = clientes.cargar_productos();
		
		clientes.cargar_productos();
		
//		for (int i = 0; i < productos.length; i++) {
//			System.out.println(productos[i].getNombre());
//		}
	}
}