package interfaz;

import basededatos.Pedido;
import vistas.VistaPedidopendiente;

public class Pedido_pendiente extends VistaPedidopendiente {
    
    public Pedido_pendiente(Pedido p) {
        this.getLblPedido().setText("Pedido "+p.getId());
        this.getBtnVerDetallesPedido();
        this.getBtnMarcarEntregado();
    }
	
}