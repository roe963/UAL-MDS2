package interfaz;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.vaadin.flow.component.UI;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaOfertaadministrador;

public class Oferta_administrador extends VistaOfertaadministrador {

    iAdministrador administrador = new BDPrincipal();

    public Oferta_administrador(basededatos.Oferta oferta) {

        this.getLabelProducto().setText(oferta.getContiene_un().getNombre());
        this.getLabelPrecio().setText(String.valueOf(oferta.getPrecio())+"€");
        this.getLabelFecha().setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date(oferta.getFecha())));

        this.getButtonEliminar().addClickListener(event -> {
            finalizar_oferta(oferta);

            UI.getCurrent().navigate("");
            UI.getCurrent().navigate("administrar_ofertas");
        });
    }

    public void finalizar_oferta(basededatos.Oferta oferta) {
        administrador.finalizar_oferta(oferta.getId());
    }
}