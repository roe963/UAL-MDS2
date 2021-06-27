package interfaz;

import basededatos.Cantidad;
import ual.mds2.ortegaortega.Session;
import vistas.VistaProductosdelcarrito;

public class Productos_del_carrito extends VistaProductosdelcarrito {

    public Productos_del_carrito(Carrito carrito) {
        this.getProductosDelCarrito().removeAll();
        for (Cantidad cantidad : Session.getCarrito()) {
            this.getProductosDelCarrito().add(new Producto_del_carrito(carrito, cantidad));
        }
    }
}