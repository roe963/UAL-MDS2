package interfaz;

import java.util.Iterator;

import com.vaadin.flow.component.html.Label;

import basededatos.Cantidad;
import basededatos.Pedido_entregado;
import basededatos.Pedido_enviado;
import basededatos.Pedido_pendiente;
import bds.BDPrincipal;
import bds.iCliente_registrado;
import ual.mds2.ortegaortega.ViewChanger;
import vistas.VistaVerpedidos;

public class Ver_pedidos extends VistaVerpedidos {
	/*public Cliente_registrado _cliente_registrado;
	public Pedidos_cliente_registrado _pedidos_cliente_registrado;*/
	
	
	iCliente_registrado cliente_registrado = new BDPrincipal();
	
	public Ver_pedidos() {
		cargar_pedidos_cliente_registrado();	
	}
	
	
	public void cargar_pedidos_cliente_registrado() {
		
		Pedido_pendiente[] arrayPedidosPendientes = cliente_registrado.cargar_pedidos_pendientes_cliente_registrado(ViewChanger.getIdUsuario());
		
		Pedido_enviado[] arrayPedidosEnviados = cliente_registrado.cargar_pedidos_enviados_cliente_registrado(ViewChanger.getIdUsuario());
		
		Pedido_entregado[] arrayPedidosEntregado = cliente_registrado.cargar_pedidos_entregados_cliente_registrado(ViewChanger.getIdUsuario());


		
		this.getVaadinVerticalLayout().removeAll();
		
		
		
		cargar_pedidos_pendientes(arrayPedidosPendientes);
		
		cargar_pedidosEnviados(arrayPedidosEnviados);
		
		cargar_pedidoEntregado(arrayPedidosEntregado);
		
	}


	private void cargar_pedidoEntregado(Pedido_entregado[] arrayPedidosEntregado) {
		if (arrayPedidosEntregado.length != 0) {
            for (int i = 0; i < arrayPedidosEntregado.length; i++) {
                this.getVaadinVerticalLayout().add(new  Pedido_cliente_registrado(arrayPedidosEntregado[i]));
            }
        }else {
            Label titulo= new Label();
            titulo.setText("No hay pedidos Entregados...");
            this.getVaadinVerticalLayout().add(titulo);
        }
	}


	private void cargar_pedidosEnviados(Pedido_enviado[] arrayPedidosEnviados) {
		if (arrayPedidosEnviados.length != 0) {
            for (int i = 0; i < arrayPedidosEnviados.length; i++) {
                this.getVaadinVerticalLayout().add(new  Pedido_cliente_registrado(arrayPedidosEnviados[i]));
            }
        }else {
            Label titulo= new Label();
            titulo.setText("No hay pedidos Enviados...");
            this.getVaadinVerticalLayout().add(titulo);
        }
		
	}


	private void cargar_pedidos_pendientes(Pedido_pendiente[] arrayPedidosPendientes ) {
		if (arrayPedidosPendientes.length != 0) {
            for (int i = 0; i < arrayPedidosPendientes.length; i++) {
                this.getVaadinVerticalLayout().add(new  Pedido_cliente_registrado(arrayPedidosPendientes[i]));
            }
        }else {
            Label titulo= new Label();
            titulo.setText("No hay pedidos pendientes...");
            this.getVaadinVerticalLayout().add(titulo);
        }
		
	}

}