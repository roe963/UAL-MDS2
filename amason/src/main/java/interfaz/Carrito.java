package interfaz;




import java.util.List;


import ual.mds2.ortegaortega.ViewChanger;
import vistas.VistaCarrito;

public class Carrito extends VistaCarrito {

	public Carrito() {
		System.out.println(ViewChanger.getCantidadProductos().size());

		double precioTotal = calcularPrecioTotal();
		
		this.getPrecioTotal().setText(String.valueOf(precioTotal));
		this.getVlProductos().removeAll();
		Productos_del_carrito productos_del_carrito = new Productos_del_carrito();
		this.getVlProductos().add(productos_del_carrito);
				
		
	}
	
	
	private double calcularPrecioTotal() {
		List<basededatos.Producto> lista = ViewChanger.getListaProductos();
		List<cantidadCache> listaCantidad= ViewChanger.getCantidadProductos();
		double suma = 0;
			
		
		if(lista.size() <=0 ) {
			return suma;			
		}else {			
			for (int i = 0; i < lista.size(); i++) {							
				suma+= lista.get(i).getPrecio() * listaCantidad.get(i).getCantidad();
			}
			return suma;

		}
	}
	
}