package interfaz;

import java.util.Vector;
import interfaz.Pedido;
import vistas.VistaPedidos;

public class Pedidos extends VistaPedidos {
    
   public Pedidos(basededatos.Pedido[] pedidos) {
       for(basededatos.Pedido p : pedidos) {
           this.getLayoutPedidos().add(new Pedido(p));
       }
   }
}