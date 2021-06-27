package interfaz;

import com.vaadin.flow.component.UI;

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
        this.getPrecioPoducto().setText(String.valueOf(p.getPrecio()) + "€");
        this.getPrecioTotalPoducto().setText(String.valueOf(p.getPrecio() * c.getCantidad()) + "€");
        this.getImageProducto().setSrc(p.contiene_una.toArray()[0].getUrl());

        Elegir_cantidad ec = new Elegir_cantidad();
        ec.getSelectCantidad().setValue(c.getCantidad());

        ec.getSelectCantidad().addValueChangeListener(event -> {
            c.setCantidad(ec.getSelectCantidad().getValue());
            this.getPrecioTotalPoducto().setText(String.valueOf(p.getPrecio() * c.getCantidad()) + "€");
            carrito.getPrecioCarrito().setText(String.valueOf(Session.calcularPrecioTotalCarrito()) + "€");
        });

        this.getLayoutSelecCantidad().removeAll();
        this.getLayoutSelecCantidad().add(ec);

        this.getEliminarProducto().addClickListener(event -> {
            Session.removeFromCarrito(c);
            UI.getCurrent().navigate("cliente");
            UI.getCurrent().navigate("carrito");
        });
    }
}