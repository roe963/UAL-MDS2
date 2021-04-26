package basededatos;

import java.util.ArrayList;
import basededatos.Valoracion;

public class Valoraciones {
	public BDPrincipal _bdprincipal_valoraciones;
	public ArrayList<Valoracion> _contine_valoracion = new ArrayList<Valoracion>();

	public void valorar_producto(int aIdProducto, int aIdUsuario, int aPuntiacion, String aComentario) {
		throw new UnsupportedOperationException();
	}
}