package interfaz;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dialog.Dialog;

import basededatos.Cantidad;
import basededatos.Producto;
import ual.mds2.ortegaortega.Session;
import ual.mds2.ortegaortega.TIPOUSUARIO;
import vistas.VistaProductodelpedido;

public class Producto_del_pedido extends VistaProductodelpedido {
    
    public Producto_del_pedido(Cantidad c) {
        super(c);
        Producto p = c.getContiene_un();
        this.getNombreProducto().setText(p.getNombre());
        this.getCategoriaProducto().setText(p.getAsignado_a().getNombre());
        this.getCantidadProducto().setText(String.valueOf(c.getCantidad()));
        this.getPrecioPoducto().setText(String.valueOf(p.getPrecio())+"€");
        this.getPrecioTotalPoducto().setText(String.valueOf(p.getPrecio()*c.getCantidad())+"€");
        this.getImageProducto().setSrc(p.contiene_una.toArray()[0].getUrl());
        this.getValorarProducto().setVisible(Session.getTipo()==TIPOUSUARIO.REGISTRADO);
        this.getValorarProducto().addClickListener(event -> {
            Dialog d = new Dialog();
            d.add(new Valorar_producto(p, d, UI.getCurrent()));
            d.open();
        });
    }
}