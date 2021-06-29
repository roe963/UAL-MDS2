package interfaz;

import com.vaadin.flow.component.html.Label;

import bds.BDPrincipal;
import bds.iAdministrador;
import vistas.VistaCategorias;

public class Categorias extends VistaCategorias {
	
	iAdministrador administrador = new BDPrincipal();
	interfaz.Categoria categoria;

	public Categorias(Agregar_categoria agregar_categoria) {
		basededatos.Categoria[] categorias = administrador.cargar_categorias();
		
		this.getLayoutCategorias().removeAll();
		if (categorias.length != 0) {
            for (int i = 0; i < categorias.length; i++) {
                //this.getLayoutCategorias().add(new interfaz.Categoria(categorias[i]));
            	categoria = new interfaz.Categoria(categorias[i]);
            	this.getLayoutCategorias().add(categoria);
            }
        }else {
            Label titulo= new Label();
            titulo.setText("No hay productos en la BD");
            this.getLayoutCategorias().add(titulo);
        }
	}
	
//	public void cambiar_estado_categoria() {
//		throw new UnsupportedOperationException();
//	}
	
}