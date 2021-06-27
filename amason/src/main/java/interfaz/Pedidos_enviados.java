package interfaz;

import bds.BDPrincipal;
import bds.iEmpresa_transportes;
import bds.iEncargado_compras;
import ual.mds2.ortegaortega.Session;
import ual.mds2.ortegaortega.TIPOUSUARIO;
import vistas.VistaPedidosenviados;

public class Pedidos_enviados extends VistaPedidosenviados {
    
    iEncargado_compras bd = new BDPrincipal();
    iEmpresa_transportes bd_trans = new BDPrincipal();

    public Pedidos_enviados() {
        
        basededatos.Pedido[] pedidos = null;
        
        if(Session.getTipo()==TIPOUSUARIO.ENCARGADO) {
            pedidos = bd.cargar_pedidos_enviados();
        }
        
        if (Session.getTipo()==TIPOUSUARIO.TRANSPORTES) {
            System.out.println(Session.getUsuario().getId());
            pedidos = bd_trans.cargar_pedidos_enviados(Session.getUsuario().getId());
        }
        
        for(basededatos.Pedido p : pedidos) {
            this.getLayoutPedidosEnviados().add(new Pedido_enviado(p));
        }
    }
}