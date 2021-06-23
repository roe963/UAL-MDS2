package interfaz;

import java.util.HashMap;
import java.util.Map;

import org.orm.PersistentException;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.OptionalParameter;
import com.vaadin.flow.router.Route;

import basededatos.Cantidad;
import basededatos.CantidadDAO;
import basededatos.Foto;
import basededatos.Oferta;
import basededatos.Producto;
import basededatos.Valoracion;
import bds.BDPrincipal;
import bds.iCliente;
import ual.mds2.ortegaortega.MenuHeader;
import ual.mds2.ortegaortega.Session;
import ual.mds2.ortegaortega.ViewChanger;
import vistas.VistaVerproducto;

@Route("producto")
public class Ver_producto extends VistaVerproducto implements HasUrlParameter<String> {
	/*
	 * private label _nombre; private label _nombreProducto; private label
	 * _categoria; private label _nombreCategoria; private label _precio; private
	 * label _precioProducto; private label _valoracion; private label
	 * _valoracionMedia; private label _descripcion; private label
	 * _descripcionProducto; private label _numOpiniones; private image _foto1;
	 * private image _foto2; private image _foto3; private image _foto4; private
	 * image _foto5; public Producto _producto; public Valoraciones _valoraciones;
	 */
    
    @Override
    public void setParameter(BeforeEvent event, @OptionalParameter String parameter) {
        System.out.println(parameter);
        
        try {
            Producto p = basededatos.ProductoDAO.getProductoByORMID(Integer.parseInt(parameter));
            cargar_producto(p);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (PersistentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

	iCliente cliente = new BDPrincipal();

	public Ver_producto() {
	    MenuBar mb = MenuHeader.getMenuBar();
        this.getLayoutMenu().add(mb);
        this.getLayoutMenu().setHorizontalComponentAlignment(Alignment.CENTER, mb);
	}

//	public Ver_producto(basededatos.Producto producto) {
//		cargar_producto(producto);
//
//	}

	public void cargar_producto(basededatos.Producto producto) {
		basededatos.Valoracion[] valoraciones = cliente.cargar_valoraciones(producto.getId());

		int valoracion = numeroValoracion(valoraciones);
		int nopiniones = valoraciones.length;

		this.getNombreProducto().setText(producto.getNombre());
		this.getNombreCategoria().setText(producto.getAsignado_a().getNombre());
		this.getNombrePrecio().setText(Double.toString(producto.getPrecio()));
		Oferta oferta = producto.getPertenece_a();

		// Oculta botones cuando ese producto no tiene ofertas
		if (oferta == null) {
			// ocultar los titulo porque no hay ofertas
			this.getTituloAnteriorh41().setVisible(false);
			this.getPrecioAnterior().setVisible(false);
			this.getTituloOfertah4().setVisible(false);
			;
			this.getFechaOferta().setVisible(false);

		} else {
			this.getPrecioAnterior().setText(Double.toString(oferta.getPrecio()));
			this.getFechaOferta().setText(Long.toString(oferta.getFecha()));
		}

		// Sincroniza la imagen principal
		Foto[] fotos = producto.contiene_una.toArray();
		if (fotos.length == 0) {// si no tiene ninguna imagen poner esta por defecto
			this.getImg1Producto().setSrc("https://www.sabormarino.com/assets/images/default.png");
		} else {
			this.getImg1Producto().setSrc(fotos[0].getUrl());

		}

		// sincronizar el resto de las imagenes
		cargarElRestoDeImagenes(producto);

		// Sincronizar las estreallas para la valoración
		cargarLasEstrellasDeValoracion(valoracion);

		// Sincronizar la n opinión
		this.getnOpiniones().setText(Integer.toString(nopiniones) + " Opiniones");

		// El botón es visible cuando eres cliente ????falta hacer que eres cliente para
		// activar el botón
		
		
		
		Boolean activarBoton = false;
		if(ViewChanger.getEresAdministrador().equals("ADMINISTRADOR")) {
			activarBoton= false; //ocultar el boton
		}else {
			activarBoton= true;//activa el boton cuando eres cliente, y no estas registrado
		}
		
		// configurar El tabs

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
		Tabs tabs = new Tabs(tab1, tab2);
		Div pages = new Div(page1, page2);

		tabs.addSelectedChangeListener(event -> {
			tabsToPages.values().forEach(page -> page.setVisible(false));
			Component selectedPage = tabsToPages.get(tabs.getSelectedTab());
			selectedPage.setVisible(true);
		});

		this.getVldescripcionAndValoracion().add(tabs, pages);
		
		
		this.getButtonComprar().addClickListener(event -> {
		    System.out.println("Se añade al carrito" +producto.getNombre());
		    Producto_del_carrito p = new Producto_del_carrito(producto, 1);
		    Session.getCarrito().add(p);
		});
	}
	
	public void notificacion() {
		Span content = new Span("Tu producto se ha añadido correctamente al carrito!");
		Notification notification = new Notification(content);
		notification.setPosition(Position.MIDDLE);
		notification.setDuration(2000);
		notification.open();
	}

	private void cargarElRestoDeImagenes(Producto producto) {

		// TODO Auto-generated method stub

		Foto[] fotos = producto.contiene_una.toArray();

		for (int i = 1; i < producto.contiene_una.toArray().length; i++) {
				Image image = new Image();
				image.setHeight("15%");
				image.setWidth("15%");
				image.setSrc(fotos[i].getUrl());			
				this.getVlCargarImagenes().add(image);			
	
			
		}

	}

	private void cargarLasEstrellasDeValoracion(int valoracion) {
		for (int i = 0; i < 5; i++) {

			if (i < valoracion) {
				Icon IconEstrella = VaadinIcon.STAR.create();
				IconEstrella.setColor("gold");
				this.getHlValoracion().add(IconEstrella);
			} else {
				Icon IconEstrellaVacia = VaadinIcon.STAR_O.create();
				IconEstrellaVacia.setColor("gold");
				this.getHlValoracion().add(IconEstrellaVacia);
			}
		}

	}

	private int numeroValoracion(Valoracion[] valoraciones) {

		if (valoraciones.length <= 0) {// cuando no hay valoración
			return 0;
		}

		int suma = 0;
		for (int i = 0; i < valoraciones.length; i++) {
			suma += valoraciones[i].getPuntuacion();
		}

		return suma / valoraciones.length;
	}
	
	
}