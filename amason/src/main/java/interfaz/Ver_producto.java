package interfaz;

import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;

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
		int valoracion= 4;
		int nopiniones= 20;
		this.getNombreProducto().setText(producto.getNombre());
		this.getNombreCategoria().setText(producto.getAsignado_a().getNombre());
		this.getNombrePrecio().setText(Double.toString(producto.getPrecio()));
		Oferta oferta = producto.getPertenece_a();
		
		//Oculta botones cuando ese producto no tiene ofertas
		if(oferta ==  null) {
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
		
		//Sincroniza la imagen principal
		Foto[] fotos= producto.contiene_una.toArray();			
		if( fotos.length==0) {//si no tiene ninguna imagen poner esta por defecto
			this.getImg1Producto().setSrc("https://www.sabormarino.com/assets/images/default.png");			
		}else {
			this.getImg1Producto().setSrc(fotos[0].getUrl());			

		}
		
		//Sincronizar las estreallas para la valoración
		for (int i = 0; i < 5; i++) {			
	
			if(i<valoracion) {
				Icon IconEstrella = VaadinIcon.STAR.create();
				IconEstrella.setColor("gold");
				this.getHlValoracion().add(IconEstrella);				
			}else {
				Icon IconEstrellaVacia = VaadinIcon.STAR_O.create();
				IconEstrellaVacia.setColor("gold");
				this.getHlValoracion().add(IconEstrellaVacia);	
			}			
		}
		
			
		//Sincronizar la n opinión
		this.getnOpiniones().setText(Integer.toString(nopiniones)+ " Opiniones");
		
		//El botón es visible cuando eres cliente   ????falta hacer que eres cliente para activar el botón
		
		Boolean activarBoton= false;
		if(activarBoton.equals(true)) {
			this.getClaseBotonProductoCliente().setVisible(true);			
		}else {
			this.getClaseBotonProductoCliente().setVisible(false);			

		}
		

		
	}
}