package interfaz;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dialog.Dialog;

import basededatos.Pedido;
import bds.BDPrincipal;
import bds.iEmpresa_transportes;
import ual.mds2.ortegaortega.Session;
import ual.mds2.ortegaortega.TIPOUSUARIO;
import vistas.VistaPedidoenviado;

public class Pedido_enviado extends VistaPedidoenviado {

    iEmpresa_transportes bd = new BDPrincipal();

    public Pedido_enviado(Pedido p) {
        System.out.println(p.getId());
        this.getLblPedido().setText("Pedido " + p.getId());
        this.getBtnVerDetallesPedido().addClickListener(event -> {
            Dialog d = new Dialog();
            d.setWidth("30%");
            d.add(new Ver_informacion(p, d));
            d.open();
        });
        this.getBtnEntregarPedido().setVisible(Session.getTipo() == TIPOUSUARIO.TRANSPORTES);
        this.getBtnEntregarPedido().addClickListener(event -> {
            bd.marcar_como_entregado(p.getId());
            UI.getCurrent().navigate("");
            UI.getCurrent().navigate("empresatransportes");
        });
    }
}