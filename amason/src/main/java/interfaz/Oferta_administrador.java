package interfaz;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.vaadin.flow.component.UI;

import bds.BDPrincipal;
import bds.iAdministrador;
import vistas.VistaOfertaadministrador;

public class Oferta_administrador extends VistaOfertaadministrador {
	
	iAdministrador administrador = new BDPrincipal();

	public Oferta_administrador(basededatos.Oferta oferta) {
		
		this.getLabelProducto().setText(oferta.getContiene_un().getNombre());
		this.getLabelFecha().setText(String.valueOf(oferta.getPrecio()));
		this.getLabelFecha().setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date(oferta.getFecha())));
		
		finalizar_oferta(oferta);
		
	}

	public void finalizar_oferta(basededatos.Oferta oferta) {
		this.getButtonEliminar().addClickListener(
				event -> {
					
					administrador.finalizar_oferta(oferta.getId());
					
					UI.getCurrent().navigate("");
					UI.getCurrent().navigate("administrar_ofertas");
				}
			);
	}
}