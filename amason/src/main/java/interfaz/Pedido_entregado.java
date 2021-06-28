package interfaz;

import com.vaadin.flow.component.dialog.Dialog;

import basededatos.Pedido;
import vistas.VistaPedidoentregado;

public class Pedido_entregado extends VistaPedidoentregado {

    public Pedido_entregado(Pedido p) {
        System.out.println(p.getId());
        this.getLblPedido().setText("Pedido " + p.getId());
        this.getBtnVerDetallesPedido().addClickListener(event -> {
            Dialog d = new Dialog();
            d.setWidth("30%");
            d.add(new Ver_informacion(p, d));
            d.open();
        });
    }

}