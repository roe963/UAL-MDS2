package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.OptionalParameter;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import basededatos.BDPrincipal;
import basededatos.Categoria;
import basededatos.Producto;
import basededatos.iCliente;
import ual.mds2.ortegaortega.MenuHeader;
import vistas.VistaBuscarproductocliente;

@PreserveOnRefresh
@Route("buscar_producto_cliente")
public class Buscar_producto_cliente extends VistaBuscarproductocliente implements HasUrlParameter<String> {
	
	@Override
    public void setParameter(BeforeEvent event, @OptionalParameter String parameter) {
        System.out.println(parameter);
        
        try {
            /*Producto p = basededatos.ProductoDAO.getProductoByORMID(Integer.parseInt(parameter));
            cargar_producto(p);*/
        	busqueda_producto(parameter);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
	
	Select<Categoria> labelSelect = new Select<>();
	String cadena = "";
	
	iCliente clientes = new BDPrincipal();
	
	public Buscar_producto_cliente() {
		super();
		// TODO Auto-generated constructor stub
		
		MenuBar mb = MenuHeader.getMenuBar();
	    this.getLayoutMenu().add(mb);
	    this.getLayoutMenu().setHorizontalComponentAlignment(Alignment.CENTER, mb);
		
		// Crear la interfaz lista productos		
		this.getVaadinHorizontalLayout().removeAll();
		this.getVaadinHorizontalLayout().add(new Productos());
	}
	
	public Buscar_producto_cliente(String nombreProducto) {
		super();		
		// Crear la interfaz lista productos		
		//this.getVaadinHorizontalLayout().removeAll();
		//this.getVaadinHorizontalLayout().add(new Productos());
		busqueda_producto(nombreProducto);
	}

	public void busqueda_producto(String nombreProducto) {
		
		Producto[] productos = clientes.busqueda_producto(nombreProducto);
		
		this.getVaadinHorizontalLayout().removeAll();			
		if (productos.length != 0) {
            for (int i = 0; i < productos.length; i++) {
                this.getVaadinHorizontalLayout().add(new interfaz.Producto(productos[i]));
            }
        }else {
            Label titulo= new Label();
            titulo.setText("No disponemos de productos con ese nombre.");
            this.getVaadinHorizontalLayout().add(titulo);
        }
	}
}