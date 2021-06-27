package interfaz;

import basededatos.Pedido;
import vistas.VistaPedidoenviado;

public class Pedido_enviado extends VistaPedidoenviado {
    
    public Pedido_enviado(Pedido p) {
        System.out.println(p.getId());
        this.getLblPedido().setText("Pedido "+p.getId());
        this.getBtnVerDetallesPedido();
    }
	
}