package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.select.Select;

import basededatos.Cantidad;
import basededatos.Foto;
import basededatos.Producto;
import ual.mds2.ortegaortega.ViewChanger;
import vistas.VistaProductodelcarrito;

public class Producto_del_carrito extends VistaProductodelcarrito {
	/*private event _eliminar;
	private String _nombreProducto;
	private String _categoriaProducto;
	private int _cantidad;
	private double _precio;
	private String _foto;
	public Productos_del_carrito _productos_del_carrito;
	public Elegir_cantidad _elegir_cantidad;*/

	Select<String> labelSelect = new Select<>();
	
	Producto producto;
	int cantidad;

	
	public Producto getProducto() {
        return producto;
    }


    public void setProducto(Producto producto) {
        this.producto = producto;
    }


    public int getCantidad() {
        return cantidad;
    }


    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public Producto_del_carrito(Producto producto, int cantidad) {	
		this.producto = producto;
		this.cantidad = cantidad;
		cargarDatosAlFront(producto,cantidad);		
		eliminar(producto);
		
	}
	
	
	private void cargarDatosAlFront(Producto producto,int cantidad) {
		this.gethProducto().setText(producto.getNombre());
		this.gethPrecio().setText(Double.toString(producto.getPrecio()));
		this.getLabelCategoria().setText(producto.getAsignado_a().getNombre());
		
		Foto[] fotos= producto.contiene_una.toArray();
		
		if( fotos.length==0) {//si no tiene ninguna imagen poner esta por defecto
			this.getImgProducto().setSrc("https://www.sabormarino.com/assets/images/default.png");			
		}else {
			this.getImgProducto().setMaxHeight("30%");
			this.getImgProducto().setMaxWidth("30%");
			this.getImgProducto().setSrc(fotos[0].getUrl());			
		}
		
		this.getVaadinVerticalLayout2().removeAll();
		labelSelect.setItems("1","2","3","4","5");
		labelSelect.setValue(Integer.toString(this.cantidad));
		labelSelect.setLabel("Cantidad");		
		this.getVaadinVerticalLayout2().add(labelSelect);		

		labelSelect.addValueChangeListener(
		        event -> {
					this.cantidad = Integer.parseInt(labelSelect.getValue()) ; 
		});
		
		
	}


	@SuppressWarnings("unchecked")
	public void eliminar(Producto producto) {
		this.getButtonEliminar().addClickListener(new ComponentEventListener() {			 
			@Override
			public void onComponentEvent(ComponentEvent event) {
							
				cantidadCache  cantidadCache = new cantidadCache(producto.getId(), 1);				
				ViewChanger.removeCantidadProducto(cantidadCache);
				ViewChanger.removeProducto(producto);
				ViewChanger.CambiarVista(new Carrito());
				
				
			}
		});
	}
	
	
}