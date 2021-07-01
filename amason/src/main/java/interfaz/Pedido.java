package interfaz;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import com.vaadin.flow.component.UI;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaPedido;

public class Pedido extends VistaPedido {

    iAdministrador bd = new BDPrincipal();

    public Pedido(basededatos.Pedido p, String estado) {

        this.getLabelNpedido().setText(Integer.toString(p.getId()));
        this.getLabelNarticulos().setText(
                Arrays.stream(p.contiene_un.toArray()).map(c -> c.getCantidad()).reduce(0, Integer::sum).toString());
        this.getLabelFecha().setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date(p.getFecha())));
        this.getLabelPrecio().setText(Float.toString(p.getPrecio()) + "€");

        this.getLabelEstado().setText(estado);

        if (estado.equals("Enviado")) {
            System.out.println("enviado");
            this.getLabelEstado().getStyle().set("color", "orange");
        }

        if (estado.equals("Entregado")) {
            System.out.println("entregado");
            this.getLabelEstado().getStyle().set("color", "green");
        }

        this.getTbnVerDetallado().addClickListener(event -> {
            UI.getCurrent().navigate("pedido/" + p.getId());
        });
    }

    public void verificar_compra() {
        throw new UnsupportedOperationException();
    }
}