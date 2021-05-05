package interfaz;

import vistas.VistaProducto;

public class Producto extends VistaProducto {
	/*private image _foto;
	private label _nombre;
	private label _precio;
	public Productos _productos;
	public Oferta_producto _oferta_producto;
	public Ver_producto _ver_producto;*/
	
	public Producto(basededatos.Producto productos) {
		this.getTextoproducto().setText(productos.getNombre().toString());
		//this.setLabelProducto(productos.getNombre());
		//this.setImgProducto(producto.getImgProducto());
	}
	
}