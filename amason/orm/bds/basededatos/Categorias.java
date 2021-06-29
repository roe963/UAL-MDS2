package basededatos;

import java.util.Vector;
import basededatos.Categoria;

public class Categorias {
	public BDPrincipal _bdprincipal_categorias;
	public Vector<Categoria> _contiene_categoria = new Vector<Categoria>();

	public Producto[] cargar_categoria(Categoria aCategoria) {
		throw new UnsupportedOperationException();
	}

	public void agregar_categoria(String aNombreCategoria) {
		throw new UnsupportedOperationException();
	}

	public Categoria[] cargar_categorias() {
		throw new UnsupportedOperationException();
	}

	public void cambiar_estado_categoria(int aIdCategoria, boolean aActivo) {
		throw new UnsupportedOperationException();
	}
}