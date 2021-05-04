package bds;

import java.util.ArrayList;
import java.util.Date;

import basededatos.Oferta;

public class Ofertas {
	public BDPrincipal _bdprincipal_ofertas;
	public ArrayList<Oferta> _contiene_oferta = new ArrayList<Oferta>();

	public void finalizar_oferta(int aIdOferta) {
		throw new UnsupportedOperationException();
	}

	public void agregar_oferta(int aIdProducto, double aPrecioOferta, Date aFechaFinOferta) {
		throw new UnsupportedOperationException();
	}

	public Oferta[] cargar_ofertas() {
		throw new UnsupportedOperationException();
	}
}