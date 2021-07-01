package interfaz;

import com.vaadin.flow.component.html.Label;

import bds.BDPrincipal;
import bds.iAdministrador;
import vistas.VistaOfertasadministrador;

public class Ofertas_administrador extends VistaOfertasadministrador {
	
	iAdministrador administrador = new BDPrincipal();
	interfaz.Oferta_administrador oferta_administrador;
	
	public Ofertas_administrador() {
		cargar_ofertas();
	}

	public void cargar_ofertas() {
		basededatos.Oferta[] ofertas = administrador.cargar_ofertas();
		
		this.getLayoutOfertas().removeAll();
		if (ofertas.length != 0) {
            for (int i = 0; i < ofertas.length; i++) {
            	oferta_administrador = new interfaz.Oferta_administrador(ofertas[i]);
            	this.getLayoutOfertas().add(oferta_administrador);
            }
        } else {
            Label titulo= new Label();
            titulo.setText("No hay ofertas en la BD");
            this.getLayoutOfertas().add(titulo);
        }
	}
	
}