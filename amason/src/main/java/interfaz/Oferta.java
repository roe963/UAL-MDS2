package interfaz;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.vaadin.flow.component.UI;

import basededatos.Foto;
import vistas.VistaOferta;

public class Oferta extends VistaOferta {

    public Oferta(basededatos.Oferta oferta) {

        this.getFechaOferta().setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date(oferta.getFecha())));
        Foto[] fotos = oferta.getContiene_un().contiene_una.toArray();

        this.getImgProducto().addClickListener(e -> {
            UI.getCurrent().navigate("producto/" + oferta.getContiene_un().getId());
        });

        if (fotos.length == 0) {// si no tiene ninguna imagen poner esta por defecto
            this.getImgProducto().setSrc("https://www.sabormarino.com/assets/images/default.png");
        } else {
            this.getImgProducto().setSrc(fotos[0].getUrl());
        }

        this.getNombreProducto().setText(oferta.getContiene_un().getNombre());
        this.getPrecioNormal().setText(String.valueOf(oferta.getContiene_un().getPrecio()) + "€");
        this.getPrecioOferta().setText(String.valueOf(oferta.getPrecio()) + "€");
    }
}
