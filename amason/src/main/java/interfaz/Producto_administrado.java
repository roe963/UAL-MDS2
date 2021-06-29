package interfaz;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Label;

import basededatos.Categoria;
import basededatos.Foto;
import basededatos.Producto;
import bds.BDPrincipal;
import bds.iAdministrador;
import vistas.VistaProductoadministrado;

public class Producto_administrado extends VistaProductoadministrado {
	
	iAdministrador administrador = new BDPrincipal();
	
	public Producto_administrado(basededatos.Producto producto, Agregar_producto agregar_producto) {
		
		Producto[] productos = administrador.cargar_todos_productos();
		Foto[] fotos = producto.contiene_una.toArray();
		
		this.getLabelProducto().setText(producto.getNombre().toString());
		this.getCheckboxActivar().setValue(producto.getActivo());
		
		this.getLayoutProducto().addClickListener(
			event -> {
	        						
				//agregar_producto.modificar_producto(producto);
				agregar_producto.getTextFieldIdProducto().setValue(String.valueOf(producto.getId()));
				agregar_producto.getTextFieldNombre().setValue(producto.getNombre());
				//agregar_producto.getSelectCategoria().setValue(producto.getAsignado_a());
				agregar_producto.cambiar_estado_producto(producto.getAsignado_a());
				agregar_producto.getTextFieldPrecio().setValue(String. valueOf(producto.getPrecio()));
				agregar_producto.getTextAreaDescripcion().setValue(producto.getDescripcion());
				agregar_producto.getTextFieldIdFoto().setValue(String.valueOf(fotos[0].getId()));
				agregar_producto.getTextFieldImagen().setValue(fotos[0].getUrl());
				agregar_producto.getCheckboxProductoActivo().setValue(producto.getActivo());
			}
		);
		
		marcar_como_activo(producto);
	}
	
	public void marcar_como_activo(basededatos.Producto producto) {
		this.getCheckboxActivar().addClickListener(
			event -> {
				
				administrador.cambiar_estado_producto(producto.getId(), this.getCheckboxActivar().getValue());
			}
		);
	}
}