package interfaz;

import java.util.Arrays;
import java.util.List;

import com.vaadin.flow.component.select.Select;

import basededatos.Categoria;
import bds.BDPrincipal;
import bds.iCliente;
import vistas.VistaVercatalogocliente;

public class Ver_catalogo_cliente extends VistaVercatalogocliente{
	
	Select<Categoria> labelSelect = new Select<>();
	String cadena = "";
	
	iCliente clientes = new BDPrincipal();
	
	public Ver_catalogo_cliente() {
		// Crear la interfaz lista productos		
		this.getVaadinHorizontalLayout().removeAll();		
		this.getVaadinHorizontalLayout().add(new Productos());
		
		// Cargar select categorias
		this.getLayoutSelectCategoria().removeAll();
		//labelSelect.setLabel("Categorias");
		labelSelect.setPlaceholder("Categorias");
		List<Categoria> departmentList = Arrays.asList(clientes.cargar_categorias());

		// Establece que valor de Categoria se va a agregar
		labelSelect.setItemLabelGenerator(Categoria::getNombre);
		labelSelect.setItems(departmentList);

		this.getLayoutSelectCategoria().add(labelSelect);
		
		labelSelect.addValueChangeListener(
        event -> {
        	
        	//seleccionar_categoria();
        	
        	System.out.println(labelSelect.getItemLabelGenerator());
        	
			//cantidadCache cantidaCache= new cantidadCache(producto.getId(), Integer.parseInt(labelSelect.getValue()) ); 
			//ViewChanger.cambiarCantidad(cantidaCache);
			//ViewChanger.CambiarVista(new Carrito());

		});
		
		
		
		/*Categoria[] categorias = clientes.cargar_categorias();
		
		//List playersList = Arrays.asList(categorias.toString());
		
		List<Categoria> list = new ArrayList<Categoria>(Arrays.asList(categorias));
		
		//System.out.println(categorias[0].getNombre());
		
		for (int i = 0; i < categorias.length; i++) {
			//labelSelect.setItems(categorias[i].getNombre());
			cadena += "\"" + categorias[i].getNombre() + "\"";
			
			if (i < categorias.length - 1) {
				cadena += ", ";
			}
		}
		
		System.out.println(cadena);
		
		this.getLayoutSelectCategoria().removeAll();
				
		///labelSelect.setItems("1", "2","3","4","5");
		//labelSelect.setValue(Integer.toString(cantidad.getCantidad()));
		labelSelect.setValue(categorias[0].getNombre());
		labelSelect.setPlaceholder("Categorias");
		//labelSelect.setLabel("Categorias");
		this.getLayoutSelectCategoria().add(labelSelect);*/
		
		
		
		
	}
	
	public void seleccionar_categoria() {
		//throw new UnsupportedOperationException();
		System.out.println("ai mama");
		
		/*this.getVaadinHorizontalLayout().removeAll();		
		this.getVaadinHorizontalLayout().add(new Categorias().cargar_categoria(null));*/
		
	}
}