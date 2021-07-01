package interfaz;

import com.vaadin.flow.component.html.Label;

import bds.BDPrincipal;
import bds.iAdministrador;
import vistas.VistaCategorias;

public class Categorias extends VistaCategorias {
	
	iAdministrador administrador = new BDPrincipal();

	public Categorias() {
		basededatos.Categoria[] categorias = administrador.cargar_todas_categorias();
		
		this.getLayoutCategorias().removeAll();
		if (categorias.length != 0) {
            for (int i = 0; i < categorias.length; i++) {
            	this.getLayoutCategorias().add(new Categoria(categorias[i]));
            }
        } else {
            Label titulo= new Label();
            titulo.setText("No hay categorias en la BD");
            this.getLayoutCategorias().add(titulo);
        }
	}
}