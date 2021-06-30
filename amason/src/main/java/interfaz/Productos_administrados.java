package interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;

import basededatos.Producto;
import bds.BDPrincipal;
import bds.iAdministrador;
import bds.iCliente;
import interfaz.Producto_administrado;
import vistas.VistaProductosadministrados;

public class Productos_administrados extends VistaProductosadministrados{
	
	iAdministrador administrador = new BDPrincipal();
	
	public Productos_administrados(Agregar_producto agregar_producto) {
		modificar_producto(agregar_producto);
	}
	
	public void modificar_producto(Agregar_producto agregar_producto) {
		
		Producto[] productos = administrador.cargar_todos_productos();
		
		this.getLayoutProductos().removeAll();
		if (productos.length != 0) {
            for (int i = 0; i < productos.length; i++) {
                this.getLayoutProductos().add(new interfaz.Producto_administrado(productos[i], agregar_producto));
            }
        }else {
            Label titulo= new Label();
            titulo.setText("No hay productos en la BD");
            this.getLayoutProductos().add(titulo);
        }
		
	}
	
}