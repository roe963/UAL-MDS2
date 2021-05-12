package interfaz;

import basededatos.Foto;
import ual.mds2.ortegaortega.ViewChanger;
import vistas.VistaProducto;

public class Producto extends VistaProducto {
	/*private image _foto;
	private label _nombre;
	private label _precio;
	public Productos _productos;
	public Oferta_producto _oferta_producto;
	public Ver_producto _ver_producto;*/
    
	public Producto(basededatos.Producto producto) {
	    
		this.getTextoproducto().setText(producto.getNombre().toString());
		
		Foto[] fotos= producto.contiene_una.toArray();

		this.getImgProducto().addClickListener(e->{
            System.out.println("has dado click");
            ViewChanger.CambiarVista(new Ver_producto(producto));
        });
		
		if( fotos.length==0) {//si no tiene ninguna imagen poner esta por defecto
			this.getImgProducto().setSrc("https://www.sabormarino.com/assets/images/default.png");			
		}else {
			this.getImgProducto().setSrc(fotos[0].getUrl());			

		}
	}
	
	
}