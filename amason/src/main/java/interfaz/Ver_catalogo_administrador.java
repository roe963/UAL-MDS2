package interfaz;

import java.util.Arrays;
import java.util.List;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import basededatos.Categoria;
import basededatos.Producto;
import bds.BDPrincipal;
import bds.iAdministrador;
import ual.mds2.ortegaortega.MenuHeader;
import ual.mds2.ortegaortega.ViewChanger;
import vistas.VistaVercatalogoadministrador;

@PreserveOnRefresh
@Route("ver_catalogo_administrador")
public class Ver_catalogo_administrador extends VistaVercatalogoadministrador {
	
	Select<Categoria> labelSelect = new Select<>();
	String cadena = "";
	
	Producto[] todoslosproductos;
	
	iAdministrador bd = new BDPrincipal();
	
	public Ver_catalogo_administrador() {
		
		MenuBar mb = MenuHeader.getMenuBar();
        this.getLayoutMenu().add(mb);
        this.getLayoutMenu().setHorizontalComponentAlignment(Alignment.CENTER, mb);
        
        todoslosproductos = bd.cargar_todos_productos();
        buscar(todoslosproductos);
        
//		ViewChanger cambiarVista = new ViewChanger();
		TextField txtBuscar = this.getTextfieldBuscar();
		Button btnBuscar = this.getButtonBuscar();
		
		btnBuscar.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                if (txtBuscar.isEmpty()) {
                    buscar(todoslosproductos);
    			} else {
    			    buscar(Arrays.stream(todoslosproductos).filter(x ->x.getNombre().toLowerCase().contains((CharSequence) txtBuscar.getValue().toLowerCase())).toArray(Producto[]::new));
    			}
            }
        });
		
		//new Buscar_producto_cliente(this.getTextfieldBuscar().getValue());
		
		// Crear la interfaz lista productos		
//		this.getVaadinHorizontalLayout().removeAll();
//		this.getVaadinHorizontalLayout().add(new Productos(productosamostrar));
		
		// Cargar select categorias
		this.getLayoutSelectCategoria().removeAll();
		//labelSelect.setLabel("Categorias");
		labelSelect.setPlaceholder("Categorías");
		List<Categoria> departmentList = Arrays.asList(bd.cargar_categorias());

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
	
	private void buscar(Producto[] productos)
	{
	    this.getVaadinHorizontalLayout().removeAll();
        this.getVaadinHorizontalLayout().add(new Productos(productos));
	}
	public void seleccionar_categoria(int idCategoria) throws PersistentException {
		Producto[] productos = bd.cargar_productos_categoria(idCategoria);
		
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