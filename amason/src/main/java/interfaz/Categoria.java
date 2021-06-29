package interfaz;

import bds.BDPrincipal;
import bds.iAdministrador;
import vistas.VistaCategoria;

public class Categoria extends VistaCategoria {
	
	iAdministrador administrador = new BDPrincipal();

	public Categoria(basededatos.Categoria categoria) {
		
		this.getLabelCategoria().setText(categoria.getNombre().toString());
		this.getCheckboxActivar().setValue(categoria.getActivo());
		
		marcar_como_activo(categoria);
	}

	public void marcar_como_activo(basededatos.Categoria categoria) {

		this.getCheckboxActivar().addClickListener(
			event -> {
				
				administrador.cambiar_estado_categoria(categoria.getId(), this.getCheckboxActivar().getValue());
			}
		);
	}
}