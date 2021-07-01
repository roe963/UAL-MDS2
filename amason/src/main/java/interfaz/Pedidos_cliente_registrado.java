package interfaz;

import java.util.Vector;

import basededatos.BDPrincipal;
import basededatos.iCliente_registrado;
import interfaz.Pedido_cliente_registrado;
import vistas.VistaPedidosclienteregistrado;

public class Pedidos_cliente_registrado extends VistaPedidosclienteregistrado {
    
    iCliente_registrado clientes = new BDPrincipal();
    
	public Ver_pedidos _ver_pedidos;
	
	public Pedido_cliente_registrado[] pedidos;
	public Vector<Pedido_cliente_registrado> _pedido_cliente_registrado = new Vector<Pedido_cliente_registrado>();
}