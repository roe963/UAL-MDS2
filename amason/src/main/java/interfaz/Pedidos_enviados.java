package interfaz;

import bds.BDPrincipal;
import bds.iEncargado_compras;
import vistas.VistaPedidosenviados;

public class Pedidos_enviados extends VistaPedidosenviados {
    iEncargado_compras bd = new BDPrincipal();

    public Pedidos_enviados() {
        for(basededatos.Pedido p : bd.cargar_pedidos_enviados()) {
            this.getLayoutPedidosEnviados().add(new Pedido_enviado(p));
        }
    }
}