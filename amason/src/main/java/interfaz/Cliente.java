package interfaz;

import bds.BDPrincipal;
import bds.iCliente;
import vistas.VistaCliente;

public class Cliente extends VistaCliente {
	
	public Cliente() {
		//Crear la interfaz ofertas
		this.getVaadinHorizontalLayout1().removeAll();
		this.getVaadinHorizontalLayout1().add(new Ofertas());	
		
		//crear la interfaz top ventas		
		this.getVaadinHorizontalLayout().removeAll();		
		this.getVaadinHorizontalLayout().add(new Productos());
	}
	
}