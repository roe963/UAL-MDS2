package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import basededatos.Cliente;
import bds.BDPrincipal;
import bds.iAdministrador;
import ual.mds2.ortegaortega.MenuHeader;
import vistas.VistaAdministrarproductos;

@PreserveOnRefresh
@Route("administrar_productos")
public class Administrar_productos extends VistaAdministrarproductos {
	
	iAdministrador administrador = new BDPrincipal();

	public Administrar_productos() {
	    MenuBar mb = MenuHeader.getMenuBar();
	    this.getLayoutMenu().add(mb);
	    this.getLayoutMenu().setHorizontalComponentAlignment(Alignment.CENTER, mb);
	    
	    Agregar_producto agregar_producto = new Agregar_producto();
	    this.getLayoutAnadirProducto().removeAll();
	  	this.getLayoutAnadirProducto().add(agregar_producto);
	    //agregar_producto(agregar_producto);
	  	
	  	this.getLayoutProductos().removeAll();
	  	this.getLayoutProductos().add(new Productos_administrados(agregar_producto));
	  	//cargar_todos_productos(agregar_producto);
	  	
	  	modificar_producto(agregar_producto);
	}
	
//	public void agregar_producto(Agregar_producto agregar_producto) {
//		this.getLayoutAnadirProducto().removeAll();
//	  	this.getLayoutAnadirProducto().add(agregar_producto);
//	  	
//	  	agregar_producto.getButtonAnadir().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
//			@Override
//			public void onComponentEvent(ClickEvent<Button> event) {
//				
//				agregar_producto.agregar_producto();
//				cargar_todos_productos(agregar_producto);
//			}
//		});
//	}

//	public void cargar_categorias() {
//		throw new UnsupportedOperationException();
//	}

//	public void cargar_todos_productos(Agregar_producto agregar_producto) {
//		this.getLayoutProductos().removeAll();
//	  	this.getLayoutProductos().add(new Productos_administrados(agregar_producto));
//	}

	public void modificar_producto(Agregar_producto agregar_producto) {
		this.getButtonGuardar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
								
				int idProducto = Integer. parseInt(agregar_producto.getTextFieldIdProducto().getValue());
				int idFoto = Integer. parseInt(agregar_producto.getTextFieldIdFoto().getValue());
				
				String nombre = agregar_producto.getTextFieldNombre().getValue();
				String precio = agregar_producto.getTextFieldPrecio().getValue();
				String descripcion = agregar_producto.getTextAreaDescripcion().getValue();
				String imagen = agregar_producto.getTextFieldImagen().getValue();
				int activo = 1;
				
				if(agregar_producto.getCheckboxProductoActivo().getValue() == false) {
					activo = 0;
				}
				
				if(!(agregar_producto.getTextFieldNombre().isEmpty() && agregar_producto.getTextFieldPrecio().isEmpty()
						&& agregar_producto.getTextAreaDescripcion().isEmpty() && agregar_producto.getTextFieldImagen().isEmpty()
						&& agregar_producto.categoria.toString().isEmpty())) {
					
					administrador.modificar_proucto(idProducto, idFoto, nombre, agregar_producto.categoria, Double.parseDouble(precio), descripcion, imagen);
					//cargar_todos_productos(agregar_producto);
					getLayoutProductos().removeAll();
				  	getLayoutProductos().add(new Productos_administrados(agregar_producto));
				  	
				  	UI.getCurrent().navigate("");
					UI.getCurrent().navigate("administrar_productos");
					
					notificacion("Los datos se han modificado correctamente.");
				} else {
					notificacion("No se ha realizado ningún cambio.");
				}
				
			}
		});
	}

//	public void cambiar_estado_producto() {
//		throw new UnsupportedOperationException();
//	}
	
	public void notificacion(String mensaje) {
		Span content = new Span(mensaje);
		Notification notification = new Notification(content);
		notification.setPosition(Position.MIDDLE);
		notification.setDuration(2000);
		notification.open();
	}
	
}