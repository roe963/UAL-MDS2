package interfaz;

import basededatos.Pedido;
import vistas.VistaPedidoentregado;

public class Pedido_entregado extends VistaPedidoentregado {

    public Pedido_entregado(Pedido p) {
        System.out.println(p.getId());
        this.getLblPedido().setText("Pedido "+p.getId());
        this.getBtnVerDetallesPedido();
    }
	
}