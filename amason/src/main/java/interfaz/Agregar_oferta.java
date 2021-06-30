package interfaz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.boot.origin.SystemEnvironmentOrigin;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.select.Select;

import basededatos.Categoria;
import bds.BDPrincipal;
import bds.iAdministrador;
import vistas.VistaAgregaroferta;

public class Agregar_oferta extends VistaAgregaroferta {
	
	iAdministrador administrador = new BDPrincipal();
	
	Select<basededatos.Producto> labelSelect = new Select<>();
	
	basededatos.Producto producto = null;

	public Agregar_oferta() {
		
		cargar_productos();
		
		this.getButtonAnadir().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				Agregar_oferta();
				
				UI.getCurrent().navigate("");
				UI.getCurrent().navigate("administrar_ofertas");
			}
		});
	}
	
	public void Agregar_oferta() {
		
		String precio = getTextFieldPrecio().getValue();
		String fecha = getDatePickerFechaFinOferta().getValue().toString();
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		try {
		    Date d = f.parse(fecha);
		    long fechaLong = d.getTime();
		    System.out.println(fechaLong);
		    
		    if (!precio.isEmpty() && !fecha.isEmpty()) administrador.agregar_oferta(producto.getId(), Double.parseDouble(precio), fechaLong);
		    
		} catch (ParseException e) {
		    e.printStackTrace();
		}
	}
	
	public void cargar_productos() {
		// Cargar select categorias
		this.getLayoutSelectProducto().removeAll();
		labelSelect.setPlaceholder("Productos");
		List<basededatos.Producto> departmentList = Arrays.asList(administrador.cargar_todos_productos());

		// Establece que valor de Producto se va a agregar
		labelSelect.setItemLabelGenerator(basededatos.Producto::getNombre);
		labelSelect.setItems(departmentList);
		
		this.getLayoutSelectProducto().add(labelSelect);
		
		labelSelect.addValueChangeListener(
        event -> {
        	        	
        	producto = event.getValue();
		});
	}
	
}