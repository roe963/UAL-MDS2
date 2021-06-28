package interfaz;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.vaadin.flow.component.dialog.Dialog;

import basededatos.Pedido;
import vistas.VistaVerinformacion;

public class Ver_informacion extends VistaVerinformacion {

    public Ver_informacion(Pedido p, Dialog d) {
        this.gethPedido().setText("Pedido " + p.getId());
        this.getLblNombreCliente().setText(p.getRealizado_por().getNombre());
        this.getLblDireccionEntrega().setText(p.getRealizado_por().getDireccionEnvio());
        this.getLblFechaPedido().setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date(p.getFecha())));
    }
}