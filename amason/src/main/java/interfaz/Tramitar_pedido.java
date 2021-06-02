package interfaz;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;

import basededatos.Cantidad;
import basededatos.Valoracion;
import bds.BDPrincipal;
import bds.iCliente_registrado;
import ual.mds2.ortegaortega.ViewChanger;
import vistas.VistaTramitarpedido;

public class Tramitar_pedido extends VistaTramitarpedido {
	/*private event _comprar;
	public Carrito_cliente_registrado _carrito_cliente_registrado;
	public Datos_de_compra _datos_de_compra;
	public Verificar_compra _verificar_compra;*/

	
	iCliente_registrado iclientes_registrado = new BDPrincipal();

	public Tramitar_pedido(Dialog dialog ) {
		
		this.getVaadinVerticalLayout().removeAll();			
		String direccion= ViewChanger.getCliente().getDireccionEnvio();		
		Datos_de_compra datosCompra= new Datos_de_compra(direccion, "Tarjeta");
		this.getVaadinVerticalLayout().add( datosCompra);
		
		
		
		comprar(datosCompra, dialog);
		
	}
	
	@SuppressWarnings("unchecked")
	public void comprar(Datos_de_compra datosCompra, Dialog dialog) {
		this.getButtonComprar().addClickListener(new ComponentEventListener() {			 
			@Override
			public void onComponentEvent(ComponentEvent event) {
				
				String newDireccion = datosCompra.getTextfieldDireccion().getValue();
				String formaPago = datosCompra.labelSelect.getValue();
				
				
				//convertir una lista a un array
//				basededatos.Producto[]  ArrayProductos = null;
//				List<basededatos.Producto> listProducto = ViewChanger.getListaProductos();
//				List<cantidadCache> listCantidades = ViewChanger.getCantidadProductos();
				basededatos.Cliente cliente = ViewChanger.getCliente();

//				ArrayProductos = listProducto.stream().toArray(basededatos.Producto[]::new);
//				
//				int arrayCantidad[] = new int[listProducto.size()];
//				for (int i = 0; i < listProducto.size(); i++) {
//					arrayCantidad[i]= listCantidades.get(i).getCantidad();
//				}
				
				Cantidad[] cant = new Cantidad[ViewChanger.productoscarrito.size()];
				int aux = 0;
				for (Producto_del_carrito p : ViewChanger.productoscarrito) {
				    Cantidad c = new Cantidad();
				    c.setCantidad(p.getCantidad());
				    c.setContiene_un(p.getProducto());
                    cant[aux] = c;
                    aux++;
                }
				
				iclientes_registrado.realizar_pedido(cant, cliente, newDireccion, formaPago);
				
                ViewChanger.resetListaCantidadProducto();
				ViewChanger.resetListaProducto();
				dialog.close();
				ViewChanger.CambiarVista(new Carrito());
				
				notificacion();
				
			}
		});
		
	}
	
	
	
	public void notificacion() {
		Span content = new Span("Tu Pedido se ha realizado correctamente!");
		Notification notification = new Notification(content);
		notification.setPosition(Position.MIDDLE);
		notification.setDuration(2000);
		notification.open();
	}
}