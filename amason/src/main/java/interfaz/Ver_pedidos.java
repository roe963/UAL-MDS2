package interfaz;

import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.router.Route;

import basededatos.Pedido_entregado;
import basededatos.Pedido_enviado;
import basededatos.Pedido_pendiente;
import bds.BDPrincipal;
import bds.iCliente_registrado;
import ual.mds2.ortegaortega.MenuHeader;
import ual.mds2.ortegaortega.Session;
import vistas.VistaVerpedidos;

@Route("pedidos")
public class Ver_pedidos extends VistaVerpedidos {

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

        this.getMisPedidos().removeAll();

        for (int i = 0; i < arrayPedidosPendientes.length; i++) {
            this.getMisPedidos().add(new Pedido_cliente_registrado(arrayPedidosPendientes[i]));
        }

        for (int i = 0; i < arrayPedidosEnviados.length; i++) {
            this.getMisPedidos().add(new Pedido_cliente_registrado(arrayPedidosEnviados[i]));
        }

        for (int i = 0; i < arrayPedidosEntregado.length; i++) {
            this.getMisPedidos().add(new Pedido_cliente_registrado(arrayPedidosEntregado[i]));
        }
    }
}