package interfaz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.boot.origin.SystemEnvironmentOrigin;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.select.Select;

import basededatos.BDPrincipal;
import basededatos.Categoria;
import basededatos.iAdministrador;
import vistas.VistaAgregaroferta;

public class Agregar_oferta extends VistaAgregaroferta {
	
	iAdministrador administrador = new BDPrincipal();
	
	Select<basededatos.Producto> labelSelect = new Select<>();

	public Agregar_oferta() {
		
	    this.getLayoutSelectProducto().removeAll();
        labelSelect.setPlaceholder("Productos");
        List<basededatos.Producto> departmentList = Arrays.asList(administrador.cargar_todos_productos());

        // Establece que valor de Producto se va a agregar
        labelSelect.setItemLabelGenerator(basededatos.Producto::getNombre);
        labelSelect.setItems(departmentList);
        
        this.getLayoutSelectProducto().add(labelSelect);
		
		this.getButtonAnadir().addClickListener(event -> agregar_oferta());
	}
	
	public void agregar_oferta() {		
		Double precio = null;
		Date d = null;
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		try {
		    precio = Double.parseDouble(getTextFieldPrecio().getValue());
		    d = f.parse(getDatePickerFechaFinOferta().getValue().toString());
		} catch (Exception e) {
		    e.printStackTrace();
		}
		basededatos.Producto producto = labelSelect.getValue();
		
		if (precio == null || d == null || producto == null) {
            new Notification("Precio y fecha no pueden estar vacíos", 3000, Position.MIDDLE).open();;
        } else {
            administrador.agregar_oferta(producto.getId(), precio, d.getTime());
            UI.getCurrent().navigate("");
            UI.getCurrent().navigate("administrar_ofertas");
            new Notification("Oferta añadida correctamente", 3000, Position.MIDDLE).open();;
        }
        
	}	
}