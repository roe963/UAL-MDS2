package interfaz;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dialog.Dialog;

import basededatos.Producto;
import bds.BDPrincipal;
import bds.iCliente;
import ual.mds2.ortegaortega.Session;
import vistas.VistaValorarproducto;

public class Valorar_producto extends VistaValorarproducto {
    
    iCliente bd = new BDPrincipal();
    
    public Valorar_producto(Producto p, Dialog d, UI current) {
        this.getNombreproducto().setText(p.getNombre());
        Elegir_cantidad ec = new Elegir_cantidad();
        ec.getSelectCantidad().setValue(1);
        this.getSelectPuntuacion().add(ec);
        this.getEnviarValoracion().addClickListener(event -> {
            bd.valorar_producto(p.getId(), Session.getUsuario().getId(), ec.getSelectCantidad().getValue(), this.getDescripcionValoracion().getValue(), System.currentTimeMillis());
            d.close();
        });
    }
}