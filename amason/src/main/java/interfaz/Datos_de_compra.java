package interfaz;

import basededatos.BDPrincipal;
import basededatos.iCliente_registrado;
import ual.mds2.ortegaortega.Session;
import vistas.VistaDatosdecompra;

public class Datos_de_compra extends VistaDatosdecompra {

    iCliente_registrado bd = new BDPrincipal();

    public Datos_de_compra() {

        basededatos.Cliente c = bd.cargar_perfil(Session.getUsuario().getId());

        System.out.println(c.getDireccionEnvio() + " " + c.getMetodoPago());

        this.getTextfieldDireccion().setValue(c.getDireccionEnvio());

        this.getFormadepago().setItems(new String[] { "Tarjeta", "PayPal" });
        this.getFormadepago().setValue(c.getMetodoPago());
    }
}