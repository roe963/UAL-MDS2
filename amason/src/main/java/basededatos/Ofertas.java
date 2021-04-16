package basededatos;

import java.util.Vector;
import basededatos.Oferta;

public class Ofertas {
	public BDPrincipal _bdprincipal_ofertas;
	public Vector<Oferta> _contiene_oferta = new Vector<Oferta>();

	public void finalizar_oferta() {
		throw new UnsupportedOperationException();
	}

	public void agregar_oferta(int aIdProducto, double aPrecioOferta, date aFechaFinOferta) {
		throw new UnsupportedOperationException();
	}

	public Oferta[] cargar_ofertas() {
		throw new UnsupportedOperationException();
	}
}