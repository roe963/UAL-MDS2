package interfaz;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import com.vaadin.flow.component.UI;

import bds.BDPrincipal;
import bds.iAdministrador;
import vistas.VistaPedido;

public class Pedido extends VistaPedido{
    
    iAdministrador bd = new BDPrincipal();

	public Pedido(basededatos.Pedido p) {
	    
	    this.getLabelNpedido().setText(Integer.toString(p.getId()));
        this.getLabelNarticulos()
                .setText(Arrays.stream(cantidades).map(c -> c.getCantidad()).reduce(0, Integer::sum).toString());
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
            System.out.println("has dado clic a btn ver detalle");
        });
    }

    public void verificar_compra() {
		throw new UnsupportedOperationException();
	}
}