package interfaz;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;

import basededatos.BDPrincipal;
import basededatos.Cantidad;
import basededatos.iCliente_registrado;
import ual.mds2.ortegaortega.Session;
import vistas.VistaTramitarpedido;

public class Tramitar_pedido extends VistaTramitarpedido {

    iCliente_registrado bd = new BDPrincipal();
    
    basededatos.Cliente cliente;
    Datos_de_compra dc;
    Dialog dialog;
    UI ui;

    public Tramitar_pedido(Dialog dialog, UI ui) {

        cliente = bd.cargar_perfil(Session.getUsuario().getId());
        this.dialog = dialog;
        this.ui = ui;
        dc = new Datos_de_compra();
        this.getDatosCompra().removeAll();
        this.getDatosCompra().add(dc);

        this.getButtonComprar().addClickListener(event -> {
            comprar();
        });

    }
    
    public void comprar() {
        bd.realizar_pedido((Cantidad[]) Session.getCarrito().toArray(new Cantidad[Session.getCarrito().size()]),
                cliente, dc.getTextfieldDireccion().getValue(), dc.getFormadepago().getValue());

        dialog.close();
        new Notification("Tu Pedido se ha realizado correctamente!", 3000, Position.MIDDLE).open();
        Session.vaciarCarrito();
        ui.navigate("cliente");
    }
}