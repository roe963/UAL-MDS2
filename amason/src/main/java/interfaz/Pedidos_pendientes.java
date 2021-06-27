package interfaz;

import bds.BDPrincipal;
import bds.iEncargado_compras;
import vistas.VistaPedidospendientes;

public class Pedidos_pendientes extends VistaPedidospendientes {
    
    iEncargado_compras bd = new BDPrincipal();

    public Pedidos_pendientes() {
        for(basededatos.Pedido p : bd.cargar_pedidos_pendientes()) {
            this.getLayoutPedidosPendinetes().add(new Pedido_pendiente(p));
        }
    }
}