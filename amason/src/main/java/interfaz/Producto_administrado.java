package interfaz;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Label;

import basededatos.Categoria;
import basededatos.Foto;
import basededatos.Producto;
import bds.BDPrincipal;
import bds.iCliente;
import vistas.VistaProductoadministrado;

public class Producto_administrado extends VistaProductoadministrado {
	
	iCliente clientes = new BDPrincipal();
	
	public Producto_administrado(basededatos.Producto producto,Agregar_producto agregar_producto) {
		Producto[] productos = clientes.cargar_productos();
		
		this.getLabelProducto().setText(producto.getNombre().toString());
		
		this.getLayoutProducto().addClickListener(
			event -> {
	        						
				//agregar_producto.modificar_producto(producto);
				agregar_producto.getTextFieldNombre().setValue(producto.getNombre());
				//agregar_producto.getSelectCategoria().setValue(producto.getAsignado_a());
				agregar_producto.cambiar_estado_producto(producto.getAsignado_a());
				agregar_producto.getTextFieldPrecio().setValue(String. valueOf(producto.getPrecio()));
				agregar_producto.getTextAreaDescripcion().setValue(producto.getDescripcion());
				agregar_producto.getTextFieldImagen().setValue(String. valueOf(producto.getPrecio()));
				agregar_producto.getCheckboxProductoActivo().setValue(producto.getActivo());
			}
		);
	}
	
	public void marcar_como_activo() {
		throw new UnsupportedOperationException();
	}
}