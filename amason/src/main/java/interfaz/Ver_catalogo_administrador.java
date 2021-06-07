package interfaz;

import java.util.Arrays;
import java.util.List;

import org.orm.PersistentException;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.select.Select;

import basededatos.Categoria;
import basededatos.Producto;
import bds.BDPrincipal;
import bds.iCliente;
import vistas.VistaVercatalogoadministrador;

public class Ver_catalogo_administrador extends VistaVercatalogoadministrador {
	
	Select<Categoria> labelSelect = new Select<>();
	String cadena = "";
	
	iCliente clientes = new BDPrincipal();
	
	public Ver_catalogo_administrador() {
		// Crear la interfaz lista productos		
		this.getVaadinHorizontalLayout().removeAll();
		this.getVaadinHorizontalLayout().add(new Productos());
		
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
        	
        	try {
				seleccionar_categoria(event.getValue().getId());
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});
		
	}
	
	public void seleccionar_categoria(int idCategoria) throws PersistentException {
Producto[] productos = clientes.cargar_productos_categoria(idCategoria);
		
		this.getVaadinHorizontalLayout().removeAll();			
		if (productos.length != 0) {
            for (int i = 0; i < productos.length; i++) {
                this.getVaadinHorizontalLayout().add(new interfaz.Producto(productos[i]));
            }
        }else {
            Label titulo= new Label();
            titulo.setText("No hay productos en la BD");
            this.getVaadinHorizontalLayout().add(titulo);
        }
	}
}