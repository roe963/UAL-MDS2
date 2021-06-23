package interfaz;




import java.util.List;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.router.Route;

import ual.mds2.ortegaortega.MenuHeader;
import ual.mds2.ortegaortega.Session;
import ual.mds2.ortegaortega.ViewChanger;
import vistas.VistaCarrito;


@Route("carrito")
public class Carrito extends VistaCarrito {

	public Carrito() {
	    
	    MenuBar mb = MenuHeader.getMenuBar();
        this.getLayoutMenu().add(mb);
        this.getLayoutMenu().setHorizontalComponentAlignment(Alignment.CENTER, mb);
        
		System.out.println(ViewChanger.productoscarrito.size());

		double precioTotal = calcularPrecioTotal();
		
		this.getPrecioTotal().setText(String.valueOf(precioTotal));
		
		this.getVlProductos().removeAll();
//		Productos_del_carrito productos_del_carrito = new Productos_del_carrito();
		this.getVlProductos().add(new Productos_del_carrito(Session.getCarrito()));

		btnTramitarPedido();
	}
	
	
	@SuppressWarnings("unchecked")
	private void btnTramitarPedido() {
		this.getVaadinButton().addClickListener(new ComponentEventListener() {			 
			@Override
			public void onComponentEvent(ComponentEvent event) {
				Dialog d = new Dialog();
                d.add(new Tramitar_pedido(d ));
                d.open();
                
				
			}
		});
		
	}


	private double calcularPrecioTotal() {
		List<basededatos.Producto> lista = ViewChanger.getListaProductos();
		List<cantidadCache> listaCantidad= ViewChanger.getCantidadProductos();
		
		double suma = 0;
			
		
		if(lista.size() <=0 ) {
			return suma;			
		}else {			
			for (int i = 0; i < lista.size(); i++) {							
				suma+= lista.get(i).getPrecio() * listaCantidad.get(i).getCantidad();
			}
			return suma;

		}
	}
	
	
	//btn tramitar pedido
	
}