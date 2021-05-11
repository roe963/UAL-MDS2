package interfaz;

import com.vaadin.flow.component.html.Label;

import basededatos.Oferta;
import bds.BDPrincipal;
import bds.iCliente;
import vistas.VistaOfertas;

public class Ofertas extends VistaOfertas {
	/*public Cliente _cliente;
	public Oferta_producto _ofertas;*/
	
	iCliente clientes = new BDPrincipal();
	
	public Ofertas() {
		cargar_ofertas();
	}

	public void cargar_ofertas() {
		Oferta[] ofertas = clientes.cargar_ofertas();

		this.getVaadinHorizontalLayout().removeAll();

		if (ofertas.length != 0) {
			for (int i = 0; i < ofertas.length; i++) {
				this.getVaadinHorizontalLayout().add(new interfaz.Oferta(ofertas[i]));
			}

		} else {
			Label titulo = new Label();
			titulo.setText("No hay Ofertas en la BD");
			this.getVaadinHorizontalLayout().add(titulo);
		}
	}
}