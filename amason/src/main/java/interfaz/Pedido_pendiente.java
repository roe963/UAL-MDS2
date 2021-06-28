package interfaz;

import com.vaadin.flow.component.dialog.Dialog;

import basededatos.Pedido;
import vistas.VistaPedidopendiente;

public class Pedido_pendiente extends VistaPedidopendiente {

    public Pedido_pendiente(Pedido p) {
        this.getLblPedido().setText("Pedido " + p.getId());
        this.getBtnVerDetallesPedido().addClickListener(event -> {
            Dialog d = new Dialog();
            d.setWidth("30%");
            d.add(new Ver_informacion(p, d));
            d.open();
        });
        this.getBtnMarcarEnviado().addClickListener(event -> {
            
        });
    }

}