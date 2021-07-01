package interfaz;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Set;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dependency.CssImport;

import basededatos.Cantidad;
import basededatos.Pedido;
import basededatos.Pedido_entregado;
import basededatos.Pedido_enviado;
import basededatos.Pedido_pendiente;
import bds.BDPrincipal;
import bds.iCliente_registrado;
import vistas.VistaPedidoclienteregistrado;

@CssImport(value = "../frontend/styles/shared-styles.css")
public class Pedido_cliente_registrado extends VistaPedidoclienteregistrado {

    public Pedido_cliente_registrado(Pedido_pendiente pedido_pendiente) {
        cargardatos(pedido_pendiente.getId(), pedido_pendiente.getFecha(), pedido_pendiente.getPrecio(),
                pedido_pendiente.contiene_un.toArray(), "Pendiente");
    }

    public Pedido_cliente_registrado(Pedido_enviado pedido_enviado) {
        cargardatos(pedido_enviado.getId(), pedido_enviado.getFecha(), pedido_enviado.getPrecio(),
                pedido_enviado.contiene_un.toArray(), "Enviado");
    }

    public Pedido_cliente_registrado(Pedido_entregado pedido_entregado) {
        cargardatos(pedido_entregado.getId(), pedido_entregado.getFecha(), pedido_entregado.getPrecio(),
                pedido_entregado.contiene_un.toArray(), "Entregado");
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    private void cargardatos(int id, long fecha, float precio, Cantidad[] cantidades, String estado) {
        // TODO Auto-generated method stub

        this.getLabelNpedido().setText(Integer.toString(id));
        this.getLabelNarticulos()
                .setText(Arrays.stream(cantidades).map(c -> c.getCantidad()).reduce(0, Integer::sum).toString());
        this.getLabelFecha().setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date(fecha)));
        this.getLabelPrecio().setText(Float.toString(precio) + "€");

        this.getLabelEstado().setText(estado);

        if (estado.equals("Enviado")) {
            System.out.println("enviado");
            this.getLabelEstado().getStyle().set("color", "orange");
        }

        if (estado.equals("Entregado")) {
            System.out.println("entregado");
            this.getLabelEstado().getStyle().set("color", "green");
        }

        this.getBtnVerDetalle().addClickListener(event -> {
            System.out.println("has dado clic a btn ver detalle");
            UI.getCurrent().navigate("pedido/" + id);
        });

    }
}