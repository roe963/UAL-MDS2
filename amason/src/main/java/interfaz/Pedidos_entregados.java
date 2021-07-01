package interfaz;

import basededatos.BDPrincipal;
import basededatos.iEmpresa_transportes;
import ual.mds2.ortegaortega.Session;
import vistas.VistaPedidosentregados;

public class Pedidos_entregados extends VistaPedidosentregados {
    
    iEmpresa_transportes bd = new BDPrincipal();

    public Pedidos_entregados() {
        
        for(basededatos.Pedido p : bd.cargar_pedidos_entregados(Session.getUsuario().getId())) {
            this.getLayoutPedidosEntregados().add(new Pedido_entregado(p));
        }
    }
}