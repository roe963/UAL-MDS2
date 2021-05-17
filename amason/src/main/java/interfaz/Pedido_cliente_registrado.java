package interfaz;

import java.util.Set;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dependency.CssImport;

import basededatos.Pedido_entregado;
import basededatos.Pedido_enviado;
import basededatos.Pedido_pendiente;
import ual.mds2.ortegaortega.ViewChanger;
import vistas.VistaPedidoclienteregistrado;

@CssImport(value = "../frontend/styles/shared-styles.css")
public class Pedido_cliente_registrado extends VistaPedidoclienteregistrado {
	/*private label _numPedido;
	private label _numPedidoUsurio;
	private label _numArticulos;
	private label _numArticulosPedido;
	private label _fecha;
	private label _fechaPedido;
	private label _presio;
	private label _precioPedido;
	private label _estado;
	private button _verDetalle;
	public Pedidos_cliente_registrado _pedidos_cliente_registrado;
	public Ver_pedido _ver_pedido;*/
	
	
	public Pedido_cliente_registrado(Pedido_pendiente pedido_pendiente) {
		cargardatos(pedido_pendiente.getId(), pedido_pendiente.getFecha(),pedido_pendiente.getPrecio(),pedido_pendiente.contiene_un.getCollection(),"Pendiente");
	}

	

	public Pedido_cliente_registrado(Pedido_enviado pedido_enviado) {
		cargardatos(pedido_enviado.getId(), pedido_enviado.getFecha(),pedido_enviado.getPrecio(),pedido_enviado.contiene_un.getCollection(),"Enviado");
	}

	public Pedido_cliente_registrado(Pedido_entregado pedido_entregado) {
		cargardatos(pedido_entregado.getId(), pedido_entregado.getFecha(),pedido_entregado.getPrecio(),pedido_entregado.contiene_un.getCollection(),"Entregado");
	}
	
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void cargardatos(int id, long fecha, float precio, Set collection, String estado) {
		// TODO Auto-generated method stub
		
		this.getLabelNpedido().setText(Integer.toString(id));
		this.getLabelFecha().setText(Long.toString(fecha));
		this.getLabelPrecio().setText(Float.toString(precio));
		
		
		this.getLabelEstado().setText(estado);
		
		if(estado.equals("Enviado")) {
			this.getLabelEstado().addClassName("amarillo");
		}
		
		if(estado.equals("Entregado")) {
			this.getLabelEstado().addClassName("verde");
		}
		
		
		this.getBtnVerDetalle().addClickListener(new ComponentEventListener() {			 
			@Override
			public void onComponentEvent(ComponentEvent event) {
				System.out.println("has dado clic a btn ver detalle");
				ViewChanger.CambiarVista(new Productos_del_pedido());
			}
		});
				
	}
	
	
	


	
}