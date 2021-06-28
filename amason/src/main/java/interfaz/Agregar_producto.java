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
import bds.iAdministrador;
import bds.iCliente;
import ual.mds2.ortegaortega.MenuHeader;
import vistas.VistaAgregarproducto;

public class Agregar_producto extends VistaAgregarproducto {
	
	iAdministrador iadministrador = new BDPrincipal();
	
	Select<Categoria> labelSelect = new Select<>();
	
	iCliente clientes = new BDPrincipal();
	Categoria categoria = null;
	
	public Agregar_producto() {
		
		getCheckboxProductoActivo().setValue(true);
		cargar_categorias();
		
		this.getButtonAnadir().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				agregar_producto();
			}
		});
	}
	
	public void agregar_producto() {
		String nombre = getTextFieldNombre().getValue();
		String precio = getTextFieldPrecio().getValue();
		String descripcion = getTextAreaDescripcion().getValue();
		String imagen = getTextFieldImagen().getValue();
		int activo = 1;
		
		if(getCheckboxProductoActivo().getValue() == false) {
			activo = 0;
		}
		
		iadministrador.agregar_producto(nombre, categoria, Double.parseDouble(precio), descripcion, imagen);
	}

	public void cargar_categorias() {
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
        	        	
        	categoria = event.getValue();
		});
	}

	public void modificar_producto(basededatos.Producto producto) {
		this.getTextFieldNombre().setValue(producto.getNombre());
	}

	public void cambiar_estado_producto(Categoria categoria) {
		//throw new UnsupportedOperationException();
		labelSelect.setValue(categoria);
	}
}