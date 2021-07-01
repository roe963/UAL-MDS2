package interfaz;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dialog.Dialog;

import basededatos.BDPrincipal;
import basededatos.Producto;
import basededatos.iCliente;
import basededatos.iCliente_registrado;
import ual.mds2.ortegaortega.Session;
import vistas.VistaValorarproducto;

public class Valorar_producto extends VistaValorarproducto {
    
    iCliente_registrado bd = new BDPrincipal();
    
    public Valorar_producto(Producto p, Dialog d, UI current) {
        this.getNombreproducto().setText(p.getNombre());
        Elegir_cantidad ec = new Elegir_cantidad();
        ec.getSelectCantidad().setValue(1);
        this.getSelectPuntuacion().add(ec);
        this.getEnviarValoracion().addClickListener(event -> {
            valorar_producto(p, d, ec);
        });
    }
    
    public void valorar_producto(Producto p, Dialog d, Elegir_cantidad ec) {
        bd.valorar_producto(p.getId(), Session.getUsuario().getId(), ec.getSelectCantidad().getValue(), this.getDescripcionValoracion().getValue(), System.currentTimeMillis());
        d.close();
    }
}