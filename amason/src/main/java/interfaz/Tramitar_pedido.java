package interfaz;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;

import basededatos.Cantidad;
import bds.BDPrincipal;
import bds.iCliente_registrado;
import ual.mds2.ortegaortega.Session;
import vistas.VistaTramitarpedido;

public class Tramitar_pedido extends VistaTramitarpedido {

    iCliente_registrado bd = new BDPrincipal();

    public Tramitar_pedido(Dialog dialog) {

        basededatos.Cliente cliente = bd.cargar_perfil(Session.getUsuario().getId());

        Datos_de_compra dc = new Datos_de_compra();
        this.getDatosCompra().removeAll();
        this.getDatosCompra().add(dc);

        this.getButtonComprar().addClickListener(event -> {
            bd.realizar_pedido((Cantidad[]) Session.getCarrito().toArray(new Cantidad[Session.getCarrito().size()]),
                    cliente, dc.getTextfieldDireccion().getValue(), dc.getFormadepago().getValue());

            dialog.close();

            Session.vaciarCarrito();
            UI.getCurrent().getPage().reload();
        });

    }

    public void notificacion() {
        Span content = new Span("Tu Pedido se ha realizado correctamente!");
        Notification notification = new Notification(content);
        notification.setPosition(Position.MIDDLE);
        notification.setDuration(2000);
        notification.open();
    }
}