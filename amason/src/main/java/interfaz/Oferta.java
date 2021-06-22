package interfaz;

import com.vaadin.flow.component.UI;

import basededatos.Foto;
import basededatos.Producto;
import ual.mds2.ortegaortega.ViewChanger;
import vistas.VistaOferta;

public class Oferta extends VistaOferta {
	
	public Oferta(basededatos.Oferta oferta) {
				
		long fecha = oferta.getFecha();
		float precio = oferta.getPrecio();
		
		Producto producto = oferta.getContiene_un();
		
		this.getImg().addClickListener(e->{
            UI.getCurrent().navigate("producto/" + producto.getId());
        });
		
		
		if(producto==null) {//Cuando un producto esta sin asociar a una oferta.
			this.getLabel().setText(("producto sin-asociar"));
			this.getImg().setSrc("https://www.sabormarino.com/assets/images/default.png");
			this.getLabel1().setText(("Mirar-BD"));
		}else {
			Foto[] fotos = oferta.getContiene_un().contiene_una.toArray();
			
			this.getLabel().setText(Long.toString(fecha));
			this.getLabel1().setText(Float.toString(precio));
			
			if( fotos.length==0) {//si no tiene ninguna imagen poner esta por defecto
				this.getImg().setSrc("https://www.sabormarino.com/assets/images/default.png");			
			}else {
				this.getImg().setMaxHeight("30%");
				this.getImg().setMaxWidth("30%");
				this.getImg().setSrc(fotos[0].getUrl());			
				
			}
		
		}
		
		
	}

}
