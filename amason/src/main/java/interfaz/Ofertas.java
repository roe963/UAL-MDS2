package interfaz;

import com.vaadin.flow.component.html.Label;

import basededatos.BDPrincipal;
import basededatos.Oferta;
import basededatos.iCliente;
import vistas.VistaOfertas;

public class Ofertas extends VistaOfertas {
	
	iCliente clientes = new BDPrincipal();
	
	public Ofertas() {
	    Oferta[] ofertas = clientes.cargar_ofertas();
	    if (ofertas.length != 0) {
		    for (int i = 0; i < ofertas.length; i++) {
	            this.getLayoutOfertas().add(new interfaz.Oferta(ofertas[i]));
	        }
	    } else {
            Label titulo= new Label();
            titulo.setText("No hay ofertas en la BD");
            this.getLayoutOfertas().add(titulo);
        }
	}
}