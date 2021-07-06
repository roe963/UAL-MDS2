package interfaz;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;

import basededatos.Cantidad;
import basededatos.Producto;
import ual.mds2.ortegaortega.Session;
import vistas.VistaProductodelcarrito;

public class Producto_del_carrito extends VistaProductodelcarrito {

    public Producto_del_carrito(Carrito carrito, Cantidad c) {
        super(c);
        Producto p = c.getContiene_un();
        this.getNombreProducto().setText(p.getNombre());
        this.getCategoriaProducto().setText(p.getAsignado_a().getNombre());
        
        double precio = c.getContiene_un().getPertenece_a() == null ? c.getContiene_un().getPrecio() : c.getContiene_un().getPertenece_a().getPrecio();
        
        this.getPrecioPoducto().setText(String.valueOf(precio) + "€");
        this.getPrecioTotalPoducto().setText(String.valueOf(precio * c.getCantidad()) + "€");
        this.getImageProducto().setSrc(p.contiene_una.toArray()[0].getUrl());

        Elegir_cantidad ec = new Elegir_cantidad();
        ec.getSelectCantidad().setValue(c.getCantidad());

        ec.getSelectCantidad().addValueChangeListener(event -> {
            c.setCantidad(ec.getSelectCantidad().getValue());
            this.getPrecioTotalPoducto().setText(String.valueOf(precio * c.getCantidad()) + "€");
            carrito.getPrecioCarrito().setText(String.valueOf(Session.calcularPrecioTotalCarrito()) + "€");
        });

        this.getLayoutSelecCantidad().removeAll();
        this.getLayoutSelecCantidad().add(ec);

        this.getEliminarProducto().addClickListener(event -> {
        	new Notification(this.getNombreProducto().getText() + " eliminado del carrito", 3000, Position.MIDDLE).open();
            Session.removeFromCarrito(c);
            UI.getCurrent().navigate("cliente");
            UI.getCurrent().navigate("carrito");
        });
    }
}