package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import basededatos.Cliente;
import ual.mds2.ortegaortega.MenuHeader;
import vistas.VistaAdministrarproductos;

@PreserveOnRefresh
@Route("administrar_productos")
public class Administrar_productos extends VistaAdministrarproductos {
	/*private label _productosActivos;
	private textField _buscarProducto;
	private button _guardarProducto;
	public Administrador _administrador;
	public Productos_administrados _productos_administrados;
	public Agregar_producto _agregar_producto;*/

	public Administrar_productos() {
	    MenuBar mb = MenuHeader.getMenuBar();
	    this.getLayoutMenu().add(mb);
	    this.getLayoutMenu().setHorizontalComponentAlignment(Alignment.CENTER, mb);
	    
	    //Crear la interfaz ofertas
	    this.getLayoutAnadirProducto().removeAll();
	  	this.getLayoutAnadirProducto().add(new Agregar_producto());
	    
	    //new Agregar_producto();
	    
	    /*Agregar_producto agregar_producto = new Agregar_producto();
		
	    System.out.println("1");
	    
		agregar_producto.getButtonAnadir().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				System.out.println("2");
				String nombre = agregar_producto.getTextFieldNombre().getValue();
				//Categoria select
				
				String precio = agregar_producto.getTextFieldNombre().getValue();
				String descripcion = agregar_producto.getTextAreaDescripcion().getValue();
				String imagen1 = agregar_producto.getTextFieldImagen1().getValue();
				String imagen2 = agregar_producto.getTextFieldImagen2().getValue();
				String imagen3 = agregar_producto.getTextFieldImagen3().getValue();
				String imagen4 = agregar_producto.getTextFieldImagen4().getValue();
				String imagen5 = agregar_producto.getTextFieldImagen5().getValue();
				//Imagen Principal radio-group
				System.out.println("3");
				System.out.println(nombre);
				
//				String nombre = getTextfieldNombre().getValue();
//				String email = getCorreoElectrónico().getValue();
//				String direccionEnvio = datosCompra.getTextfieldDireccion().getValue();
//				String metodoPago = datosCompra.labelSelect.getValue();
//
//				String fotoURL = getTextfieldFotousuario().getValue();
//
//				Boolean activo = false;
//
//				if (radioGroup.getValue().equals("Operativo")) {
//					activo = true;
//				}
//				if (radioGroup.getValue().equals("No Operativo")) {
//					activo = false;
//				}
//
//				if (!(nombre.equals(cliente.getNombre()) && email.equals(cliente.getEmail())
//						&& direccionEnvio.equals(cliente.getDireccionEnvio())
//						&& metodoPago.equals(cliente.getMetodoPago()) && fotoURL.equals(cliente.getFotoURL())
//						&& activo.equals(cliente.getActivo()))) {
//					iclientes_registrado.guardar_perfil(cliente.getId(), nombre, email, direccionEnvio, metodoPago,
//							fotoURL, activo);
//					cargar_perfil();
//
//					notificacion("Los datos se han modificado correctamente.");
//				} else {
//					notificacion("No se ha realizado ningún cambio.");
//				}

			}
		});*/
	}
	
	public void agregar_producto() {
		throw new UnsupportedOperationException();
	}

	public void cargar_categorias() {
		throw new UnsupportedOperationException();
	}

	public void cargar_productos() {
		throw new UnsupportedOperationException();
	}

	public void modificar_producto() {
		throw new UnsupportedOperationException();
	}

	public void cambiar_estado_producto() {
		throw new UnsupportedOperationException();
	}
}