package bds;

import java.util.ArrayList;
import basededatos.Categoria;
import basededatos.Producto;

public class Categorias {
	public BDPrincipal _bdprincipal_categorias;
	public ArrayList<Categoria> _contiene_categoria = new ArrayList<Categoria>();

	public Producto[] cargar_categoria(Categoria aCategoria) {
		throw new UnsupportedOperationException();
	}

	public void agregar_categoria(String aNombreCategoria) {
		throw new UnsupportedOperationException();
	}

	public Categoria[] cargar_categorias() {
		throw new UnsupportedOperationException();
	}

	public void activar_categoria(int aIdCategoria) {
		throw new UnsupportedOperationException();
	}

	public void cambiar_estado_categoria(int aIdCategoria, boolean aActivo) {
		throw new UnsupportedOperationException();
	}
}