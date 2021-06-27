package interfaz;

import basededatos.Oferta;
import bds.BDPrincipal;
import bds.iCliente;
import vistas.VistaOfertas;

public class Ofertas extends VistaOfertas {
	
	iCliente clientes = new BDPrincipal();
	
	public Ofertas() {
	    Oferta[] ofertas = clientes.cargar_ofertas();
	    for (int i = 0; i < ofertas.length; i++) {
            this.getLayoutOfertas().add(new interfaz.Oferta(ofertas[i]));
        }
	}
}