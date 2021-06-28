package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.menubar.MenuBar;
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
	    
	    //Crear la interfaz ofertas
	    this.getLayoutAnadirProducto().removeAll();
	    Agregar_producto agregar_producto = new Agregar_producto();
	  	this.getLayoutAnadirProducto().add(agregar_producto);
	  	
	  	this.getLayoutProductos().removeAll();
	  	this.getLayoutProductos().add(new Productos_administrados(agregar_producto));
	  	
	  	modificar_producto(agregar_producto);
	}
	
	public void agregar_producto() {
		throw new UnsupportedOperationException();
	}

	public void cargar_categorias() {
		throw new UnsupportedOperationException();
	}

	public void cargar_todos_productos() {
		throw new UnsupportedOperationException();
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
				
				administrador.modificar_proucto(idProducto, idFoto, nombre, agregar_producto.categoria, Double.parseDouble(precio), descripcion, imagen);
			}
		});
	}

	public void cambiar_estado_producto() {
		throw new UnsupportedOperationException();
	}
}