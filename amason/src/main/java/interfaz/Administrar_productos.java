package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
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
	    //this.getLayoutAnadirProducto().removeAll();
	  	//this.getLayoutAnadirProducto().add(agregar_producto);
	    agregar_producto(agregar_producto);
	  	
	  	//this.getLayoutProductos().removeAll();
	  	//this.getLayoutProductos().add(new Productos_administrados(agregar_producto));
	  	cargar_todos_productos(agregar_producto);
	  	
	  	modificar_producto(agregar_producto);
	}
	
	public void agregar_producto(Agregar_producto agregar_producto) {
		this.getLayoutAnadirProducto().removeAll();
	  	this.getLayoutAnadirProducto().add(agregar_producto);
	}

	public void cargar_categorias() {
		throw new UnsupportedOperationException();
	}

	public void cargar_todos_productos(Agregar_producto agregar_producto) {
		this.getLayoutProductos().removeAll();
	  	this.getLayoutProductos().add(new Productos_administrados(agregar_producto));
	}

	public void modificar_producto(Agregar_producto agregar_producto) {
		this.getButtonGuardar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				agregar_producto.getTextFieldNombre().getValue();
				
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
				
				/*if (!(nombre.equals(cliente.getNombre()) && email.equals(cliente.getEmail())
						&& direccionEnvio.equals(cliente.getDireccionEnvio())
						&& metodoPago.equals(cliente.getMetodoPago()) && fotoURL.equals(cliente.getFotoURL())
						&& activo.equals(cliente.getActivo()))) {
					iclientes_registrado.guardar_perfil(cliente.getId(), nombre, email, direccionEnvio, metodoPago,
							fotoURL, activo);
					cargar_perfil();

					notificacion("Los datos se han modificado correctamente.");
				} else {
					notificacion("No se ha realizado ningún cambio.");
				}*/
				
				/*if(!(nombre.equals(cliente.getNombre()) && )) {
					
				}*/
				
				administrador.modificar_proucto(idProducto, idFoto, nombre, agregar_producto.categoria, Double.parseDouble(precio), descripcion, imagen);
				cargar_todos_productos(agregar_producto);
			}
		});
	}

	public void cambiar_estado_producto() {
		throw new UnsupportedOperationException();
	}
	
	public void notificacion(String mensaje) {
		Span content = new Span(mensaje);
		Notification notification = new Notification(content);
		notification.setPosition(Position.MIDDLE);
		notification.setDuration(2000);
		notification.open();
	}
	
}