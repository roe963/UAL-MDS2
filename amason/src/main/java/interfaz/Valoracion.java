package interfaz;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;

import vistas.VistaValoracion;

public class Valoracion extends VistaValoracion {
	/*private label _valoracion;
	private label _fecha;
	private label _opinion;
	public Valoraciones _valoraciones;*/
	
	public Valoracion(basededatos.Valoracion valoracion) {
		
		this.getLabelDescripcion().setText(valoracion.getComentario());
		this.getLabelFecha().setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date(valoracion.getFecha())));
		
		for (int i = 0; i < 5; i++) {			
			
			if(i<valoracion.getPuntuacion()) {
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
}