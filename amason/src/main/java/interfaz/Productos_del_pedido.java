package interfaz;

import java.util.Vector;

import basededatos.Cantidad;
import interfaz.Producto_del_pedido;
import vistas.VistaProductodelpedido;
import vistas.VistaProductosdelpedido;

public class Productos_del_pedido extends VistaProductosdelpedido {
    /*
     * public Ver_pedido _ver_pedido; public Vector<Producto_del_pedido>
     * _producto_del_pedido = new Vector<Producto_del_pedido>();
     */

    public Productos_del_pedido(Cantidad[] cantidades) {
        super(cantidades);
        // You can initialise any data required for the connected UI components here.
        this.getProductosDelPedido().removeAll();
        for (int i = 0; i < cantidades.length; i++) {
            Cantidad cantidad = cantidades[i];
            System.out.println(cantidad.getContiene_un().getNombre());
            this.getProductosDelPedido().add(new Producto_del_pedido(cantidad));
        }
    }

    public void valorar_producto() {
        throw new UnsupportedOperationException();
    }
}