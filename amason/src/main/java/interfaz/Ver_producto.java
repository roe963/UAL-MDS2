package interfaz;


import java.util.HashMap;
import java.util.Map;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;

import basededatos.Foto;
import basededatos.Oferta;
import basededatos.Valoracion;
import bds.BDPrincipal;
import bds.iCliente;
import vistas.VistaVeproducto;

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
	
	iCliente cliente = new BDPrincipal();

	public Ver_producto() {
		
	}
	
	public Ver_producto (basededatos.Producto producto) {
		cargar_producto(producto);		
		
	}
	

	public void cargar_producto (basededatos.Producto producto){
		basededatos.Valoracion[] valoraciones=  cliente.cargar_valoraciones(producto.getId());

		int valoracion= numeroValoracion(valoraciones);
		int nopiniones= valoraciones.length;
		
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
		cargarLasEstrellasDeValoracion(valoracion);
	
			
		//Sincronizar la n opinión
		this.getnOpiniones().setText(Integer.toString(nopiniones)+ " Opiniones");
		
		//El botón es visible cuando eres cliente   ????falta hacer que eres cliente para activar el botón
		
		Boolean activarBoton= false;
		if(activarBoton.equals(true)) {
			this.getClaseBotonProductoCliente().setVisible(true);			
		}else {
			this.getClaseBotonProductoCliente().setVisible(false);			

		}
		
		//configurar El tabs
		
		
		
		this.getVldescripcionAndValoracion().removeAll();
		
		Tab tab1 = new Tab("Descripción");
		Div page1 = new Div();
		Label label = new Label();
		label.setText(producto.getDescripcion());		
		page1.add(label);

		Tab tab2 = new Tab("Valoración");
		Div page2 = new Div();
		Valoraciones v = new Valoraciones(valoraciones); 
		page2.add(v);

		page2.setVisible(false);

		Map<Tab, Component> tabsToPages = new HashMap<>();
		tabsToPages.put(tab1, page1);
		tabsToPages.put(tab2, page2);
		Tabs tabs = new Tabs(tab1, tab2 );
		Div pages = new Div(page1, page2);

		tabs.addSelectedChangeListener(event -> {
		    tabsToPages.values().forEach(page -> page.setVisible(false));
		    Component selectedPage = tabsToPages.get(tabs.getSelectedTab());
		    selectedPage.setVisible(true);
		});

		this.getVldescripcionAndValoracion().add(tabs, pages);
		
	}

	private void cargarLasEstrellasDeValoracion(int valoracion) {
		// TODO Auto-generated method stub
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
		
		
	}

	private int numeroValoracion(Valoracion[] valoraciones) {
		// TODO Auto-generated method stub
		int suma= 0;		
		for (int i = 0; i < valoraciones.length; i++) {
			suma+= valoraciones[i].getPuntuacion();
		}
		
		return suma/valoraciones.length;
	}
}