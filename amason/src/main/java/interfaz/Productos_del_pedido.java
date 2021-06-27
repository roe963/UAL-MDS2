package interfaz;

import java.util.Vector;

import basededatos.Cantidad;
import vistas.VistaProductosdelpedido;

public class Productos_del_pedido extends VistaProductosdelpedido {

    public Productos_del_pedido(Cantidad[] cantidades) {
        super(cantidades);
        this.getProductosDelPedido().removeAll();
        for (int i = 0; i < cantidades.length; i++) {
            Cantidad cantidad = cantidades[i];
            System.out.println(cantidad.getContiene_un().getNombre());
            this.getProductosDelPedido().add(new Producto_del_pedido(cantidad));
        }
    }
}