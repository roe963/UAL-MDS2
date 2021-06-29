package basededatos;

import java.util.Vector;
import basededatos.Valoracion;

public class Valoraciones {
	public BDPrincipal _bdprincipal_valoraciones;
	public Vector<Valoracion> _contine_valoracion = new Vector<Valoracion>();

	public void valorar_producto(int aIdProducto, int aIdUsuario, int aPuntiacion, String aComentario, long aFecha) {
		throw new UnsupportedOperationException();
	}

	public Valoracion[] cargar_valoraciones(int aIdProducto) {
		throw new UnsupportedOperationException();
	}
}