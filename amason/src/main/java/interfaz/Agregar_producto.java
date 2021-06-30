package interfaz;

import java.util.Arrays;
import java.util.List;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.radiobutton.RadioGroupVariant;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.Route;

import basededatos.Categoria;
import bds.BDPrincipal;
import bds.iAdministrador;
import bds.iCliente;
import ual.mds2.ortegaortega.MenuHeader;
import vistas.VistaAgregarproducto;

public class Agregar_producto extends VistaAgregarproducto {
	
	iAdministrador administrador = new BDPrincipal();
	
	Select<Categoria> labelSelect = new Select<>();
	
	Categoria categoria = null;
	
	public Agregar_producto() {		
		getTextFieldIdProducto().setVisible(false);
		getTextFieldIdFoto().setVisible(false);
		
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
		String descripcion = getTextAreaDescripcion().getValue();
		String imagen = getTextFieldImagen().getValue();
		int activo = 1;
		
		if(getCheckboxProductoActivo().getValue() == false) {
			activo = 0;
		}
		Double precio = null;
		try {
		    precio = Double.parseDouble(getTextFieldPrecio().getValue());
		} catch (Exception e) {
        }
		
		if (nombre.isEmpty() || precio == null || categoria == null) {
		    new Notification("Nombre, precio y categoría no puede estar vacíos", 3000, Position.MIDDLE).open();;
		} else {
		    administrador.agregar_producto(nombre, categoria, precio, descripcion, imagen);
            UI.getCurrent().navigate("");
            UI.getCurrent().navigate("administrar_productos");
            new Notification(nombre + " añadido correctamente", 3000, Position.MIDDLE).open();;
		}
	}

	public void cargar_categorias() {
		// Cargar select categorias
		this.getLayoutSelectCategoria().removeAll();
		//labelSelect.setLabel("Categorias");
		labelSelect.setPlaceholder("Categorías");
		List<Categoria> departmentList = Arrays.asList(administrador.cargar_categorias());

		// Establece que valor de Categoria se va a agregar
		labelSelect.setItemLabelGenerator(Categoria::getNombre);
		labelSelect.setItems(departmentList);
		
		this.getLayoutSelectCategoria().add(labelSelect);
		
		labelSelect.addValueChangeListener(
        event -> {
        	        	
        	categoria = event.getValue();
		});
	}

	public void asignarCategoria(Categoria categoria) {
		labelSelect.setValue(categoria);
	}
}