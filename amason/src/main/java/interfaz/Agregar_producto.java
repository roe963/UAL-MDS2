package interfaz;

import java.util.Arrays;
import java.util.List;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.radiobutton.RadioGroupVariant;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.router.Route;

import basededatos.Categoria;
import bds.BDPrincipal;
import bds.iCliente;
import ual.mds2.ortegaortega.MenuHeader;
import vistas.VistaAgregarproducto;

public class Agregar_producto extends VistaAgregarproducto {
	/*private label _nombre;
	private textField _nombreProducto;
	private label _categoria;
	private textField _nombreCategoria;
	private label _precio;
	private textField _precioProducto;
	private dialog _descripcionProducto;
	private label _imagen1;
	private label _imagen2;
	private label _imagen3;
	private label _imagen4;
	private label _imagen5;
	private image _imagenProducto1;
	private image _imagenProducto2;
	private image _imagenProducto3;
	private image _imagenProducto4;
	private image _imagenProducto5;
	private label _imagenPrincipal;
	private checkbox _imagenPrincipal1;
	private checkbox _imagenPrincipal2;
	private checkbox _imagenPrincipal3;
	private checkbox _imagenPrincipal4;
	private checkbox _imagenPrincipal5;
	private button _anadirProducto;
	public Administrar_productos _administrar_productos;*/
	
	Select<Categoria> labelSelect = new Select<>();
	
	iCliente clientes = new BDPrincipal();
	
	public Agregar_producto() {
		
		/*String nombre = this.getTextFieldNombre().getValue();
		//Categoria select
		
		String precio = this.getTextFieldNombre().getValue();
		String descripcion = this.getTextAreaDescripcion().getValue();
		String imagen1 = this.getTextFieldImagen1().getValue();
		String imagen2 = this.getTextFieldImagen2().getValue();
		String imagen3 = this.getTextFieldImagen3().getValue();
		String imagen4 = this.getTextFieldImagen4().getValue();
		String imagen5 = this.getTextFieldImagen5().getValue();*/
		
		// Cargar select categorias
		this.getLayoutSelectCategoria().removeAll();
		//labelSelect.setLabel("Categorias");
		labelSelect.setPlaceholder("Categorías");
		List<Categoria> departmentList = Arrays.asList(clientes.cargar_categorias());

		// Establece que valor de Categoria se va a agregar
		labelSelect.setItemLabelGenerator(Categoria::getNombre);
		labelSelect.setItems(departmentList);
		
		this.getLayoutSelectCategoria().add(labelSelect);
		
		labelSelect.addValueChangeListener(
        event -> {
        	
        	System.out.println("entro click");
        	
        	/*try {
				seleccionar_categoria(event.getValue().getId());
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
        	
        	
        	
        	//System.out.println(event.getValue().getNombre());
        	//System.out.println(event.getValue().getId());
        	
			//cantidadCache cantidaCache= new cantidadCache(producto.getId(), Integer.parseInt(labelSelect.getValue()) ); 
			//ViewChanger.cambiarCantidad(cantidaCache);
			//ViewChanger.CambiarVista(new Carrito());

		});
		
		
		RadioButtonGroup<String> radioGroup = new RadioButtonGroup<>();
		radioGroup.setLabel("Imágen Principal");
		radioGroup.setItems("Imagen1", "Imagen2", "Imagen3", "Imagen4", "Imagen5");
		radioGroup.addThemeVariants(RadioGroupVariant.LUMO_HELPER_ABOVE_FIELD);
		
		this.getLayoutImagenPrincipal().add(radioGroup);
		radioGroup.setValue("Imagen1");
		
		this.getButtonAnadir().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				String nombre = getTextFieldNombre().getValue();
				//String categoria = getSelectCategoria().getValue().toString();
				String precio = getTextFieldPrecio().getValue();
				String descripcion = getTextAreaDescripcion().getValue();
				String imagen1 = getTextFieldImagen1().getValue();
				String imagen2 = getTextFieldImagen2().getValue();
				String imagen3 = getTextFieldImagen3().getValue();
				String imagen4 = getTextFieldImagen4().getValue();
				String imagen5 = getTextFieldImagen5().getValue();
				String imagenPrincipal = radioGroup.getValue();
				
				System.out.println(nombre);
				//System.out.println(categoria);
				System.out.println(precio);
				System.out.println(descripcion);
				System.out.println(imagen1);
				System.out.println(imagen2);
				System.out.println(imagen3);
				System.out.println(imagen4);
				System.out.println(imagen5);
				System.out.println(imagenPrincipal);
				
				
				/*String nombre = getTextfieldNombre().getValue();
				String email = getCorreoElectrónico().getValue();
				String direccionEnvio = datosCompra.getTextfieldDireccion().getValue();
				String metodoPago = datosCompra.labelSelect.getValue();

				String fotoURL = getTextfieldFotousuario().getValue();

				Boolean activo = false;

				if (radioGroup.getValue().equals("Operativo")) {
					activo = true;
				}
				if (radioGroup.getValue().equals("No Operativo")) {
					activo = false;
				}

				if (!(nombre.equals(cliente.getNombre()) && email.equals(cliente.getEmail())
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

			}
		});
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