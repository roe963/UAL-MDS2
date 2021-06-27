package interfaz;

import com.vaadin.flow.component.UI;
import basededatos.Foto;
import vistas.VistaProducto;

public class Producto extends VistaProducto {

    public Producto(basededatos.Producto producto) {        
        Foto[] fotos = producto.contiene_una.toArray();

        this.getImgProducto().addClickListener(e -> {
            UI.getCurrent().navigate("producto/" + producto.getId());
        });

        if (fotos.length == 0) {// si no tiene ninguna imagen poner esta por defecto
            this.getImgProducto().setSrc("https://www.sabormarino.com/assets/images/default.png");
        } else {
            this.getImgProducto().setSrc(fotos[0].getUrl());
        }

        this.getNombreProducto().setText(producto.getNombre());
        this.getPrecioProducto().setText(String.valueOf(producto.getPrecio()) + "€");
    }

}