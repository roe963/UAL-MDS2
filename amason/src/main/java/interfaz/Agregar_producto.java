package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.router.Route;

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
		System.out.println("1");
		this.getButtonAnadir().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				System.out.println("2");
				String nombre = getTextFieldNombre().getValue();
				//Categoria select
				
				/*String precio = getTextFieldNombre().getValue();
				String descripcion = getTextAreaDescripcion().getValue();
				String imagen1 = getTextFieldImagen1().getValue();
				String imagen2 = getTextFieldImagen2().getValue();
				String imagen3 = getTextFieldImagen3().getValue();
				String imagen4 = getTextFieldImagen4().getValue();
				String imagen5 = getTextFieldImagen5().getValue();*/
				
				System.out.println(nombre);
				
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
}