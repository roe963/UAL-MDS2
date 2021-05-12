package interfaz;

import basededatos.Foto;
import basededatos.Oferta;
import basededatos.Producto;
import ual.mds2.ortegaortega.ViewChanger;
import vistas.VistaVeproducto;
import vistas.VistaVerproducto;

public class Ver_producto extends VistaVeproducto  {
	/*private label _nombre;
	private label _nombreProducto;
	private label _categoria;
	private label _nombreCategoria;
	private label _precio;
	private label _precioProducto;
	private label _valoracion;
	private label _valoracionMedia;
	private label _descripcion;
	private label _descripcionProducto;
	private label _numOpiniones;
	private image _foto1;
	private image _foto2;
	private image _foto3;
	private image _foto4;
	private image _foto5;
	public Producto _producto;
	public Valoraciones _valoraciones;*/
	
	public Ver_producto() {
		
	}
	
	public Ver_producto (basededatos.Producto producto) {
		cargar_producto(producto);		
	}
	

	public void cargar_producto (basededatos.Producto producto){
		this.getNombreProducto().setText(producto.getNombre());
		this.getNombreCategoria().setText(producto.getAsignado_a().getNombre());
		this.getNombrePrecio().setText(Double.toString(producto.getPrecio()));
		Oferta oferta = producto.getPertenece_a();
		
		
		if(oferta==  null) {
			//ocultar los titulo porque no hay ofertas
			this.getTituloAnteriorh41().setVisible(false);
			this.getPrecioAnterior().setVisible(false);
			this.getTituloOfertah4().setVisible(false);;
			this.getFechaOferta().setVisible(false);
			
		}else {			
			System.out.println("hay oferta");
			this.getPrecioAnterior().setText(Double.toString(oferta.getPrecio()));			
			this.getFechaOferta().setText(Long.toString(oferta.getFecha()));
		}
		
		
		Foto[] fotos= producto.contiene_una.toArray();

			
		if( fotos.length==0) {//si no tiene ninguna imagen poner esta por defecto
			this.getImg1Producto().setSrc("https://www.sabormarino.com/assets/images/default.png");			
		}else {
			this.getImg1Producto().setSrc(fotos[0].getUrl());			

		}
		
	}
}