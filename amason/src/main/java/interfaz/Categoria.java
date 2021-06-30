package interfaz;

import com.vaadin.flow.component.UI;

import bds.BDPrincipal;
import bds.iAdministrador;
import vistas.VistaCategoria;

public class Categoria extends VistaCategoria {
	
	iAdministrador administrador = new BDPrincipal();

	public Categoria(basededatos.Categoria categoria) {
		
		this.getLabelCategoria().setText(categoria.getNombre().toString());
		this.getCheckboxActivar().setValue(categoria.getActivo());
		
		cambiar_estado_categoria(categoria);
	}

	public void cambiar_estado_categoria(basededatos.Categoria categoria) {

		this.getCheckboxActivar().addClickListener(
			event -> {
				
				administrador.cambiar_estado_categoria(categoria.getId(), this.getCheckboxActivar().getValue());
				
			  	UI.getCurrent().navigate("");
				UI.getCurrent().navigate("administrar_categorias");
			}
		);
	}
}