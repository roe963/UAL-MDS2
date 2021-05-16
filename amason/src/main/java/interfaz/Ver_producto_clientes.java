package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;

import basededatos.Cantidad;
import ual.mds2.ortegaortega.ViewChanger;
import vistas.VistaVerproductoclientes;

//public class Ver_producto_clientes extends Ver_producto {
public class Ver_producto_clientes extends VistaVerproductoclientes {
	/*private event _anadir_producto_al_carrito;
	public Producto_clientes _producto_clientes;*/

	/*public void anadir_producto_al_carrito() {
		throw new UnsupportedOperationException();
	}

	public Producto cargar_producto() {
		throw new UnsupportedOperationException();
	}
	*/
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Ver_producto_clientes(basededatos.Producto producto) {
		
		
		this.getButtonComprar().addClickListener(new ComponentEventListener() {			 
			@Override
			public void onComponentEvent(ComponentEvent event) {
				System.out.println("Se añade al carrito" +producto.getNombre());
				
				if(ViewChanger.getIdUsuario() == -1) {
					Span content = new Span("Para comprar tienes que iniciar sesión!!");
					Notification notification = new Notification(content);
					notification.setPosition(Position.MIDDLE);
					notification.setDuration(2000);
					notification.open();
					
				}else {
					
					
					
					ViewChanger.addProducto(producto);					
					cantidadCache cantidadCache= new cantidadCache(producto.getId(), 1);					
					ViewChanger.addCantidadProductos(cantidadCache);
					notificacion();
										
				}
				
				
			}
		});
		
	}
	
	
	public void notificacion() {
		Span content = new Span("Tu producto se ha añadido correctamente al carrito!");
		Notification notification = new Notification(content);
		notification.setPosition(Position.MIDDLE);
		notification.setDuration(2000);
		notification.open();
	}
}