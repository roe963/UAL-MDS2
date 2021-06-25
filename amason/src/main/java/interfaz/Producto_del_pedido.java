package interfaz;

import basededatos.Cantidad;
import basededatos.Producto;
import vistas.VistaProductodelpedido;

public class Producto_del_pedido extends VistaProductodelpedido {

    public Producto_del_pedido(Cantidad c) {
        super(c);
        Producto p = c.getContiene_un();
        this.getNombreProducto().setText(p.getNombre());
        this.getCantidadProducto().setText(p.getAsignado_a().getNombre());
        this.getCantidadProducto().setText(String.valueOf(c.getCantidad()));
        this.getPrecioPoducto().setText(String.valueOf(p.getPrecio())+"€");
        this.getPrecioTotalPoducto().setText(String.valueOf(p.getPrecio()*c.getCantidad())+"€");
        this.getImageProducto().setSrc(p.contiene_una.toArray()[0].getUrl());
    }
}