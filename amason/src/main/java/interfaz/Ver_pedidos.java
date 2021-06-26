package interfaz;

import java.util.Iterator;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.router.Route;

import basededatos.Cantidad;
import basededatos.Pedido_entregado;
import basededatos.Pedido_enviado;
import basededatos.Pedido_pendiente;
import bds.BDPrincipal;
import bds.iCliente_registrado;
import ual.mds2.ortegaortega.MenuHeader;
import ual.mds2.ortegaortega.Session;
import ual.mds2.ortegaortega.ViewChanger;
import vistas.VistaVerpedidos;

@Route("pedidos")
public class Ver_pedidos extends VistaVerpedidos {
    /*
     * public Cliente_registrado _cliente_registrado; public
     * Pedidos_cliente_registrado _pedidos_cliente_registrado;
     */

    iCliente_registrado cliente_registrado = new BDPrincipal();

    public Ver_pedidos() {
        MenuBar mb = MenuHeader.getMenuBar();
        this.getLayoutMenu().removeAll();
        this.getLayoutMenu().add(mb);
        this.getLayoutMenu().setHorizontalComponentAlignment(Alignment.CENTER, mb);

        Pedido_pendiente[] arrayPedidosPendientes = cliente_registrado
                .cargar_pedidos_pendientes_cliente_registrado(Session.getUsuario().getId());

        Pedido_enviado[] arrayPedidosEnviados = cliente_registrado
                .cargar_pedidos_enviados_cliente_registrado(Session.getUsuario().getId());

        Pedido_entregado[] arrayPedidosEntregado = cliente_registrado
                .cargar_pedidos_entregados_cliente_registrado(Session.getUsuario().getId());

        this.getVaadinVerticalLayout().removeAll();

        for (int i = 0; i < arrayPedidosPendientes.length; i++) {
            this.getVaadinVerticalLayout().add(new Pedido_cliente_registrado(arrayPedidosPendientes[i]));
        }

        for (int i = 0; i < arrayPedidosEnviados.length; i++) {
            this.getVaadinVerticalLayout().add(new Pedido_cliente_registrado(arrayPedidosEnviados[i]));
        }

        for (int i = 0; i < arrayPedidosEntregado.length; i++) {
            this.getVaadinVerticalLayout().add(new Pedido_cliente_registrado(arrayPedidosEntregado[i]));
        }
    }
}