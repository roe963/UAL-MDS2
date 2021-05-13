package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.html.Label;

import vistas.VistaValoraciones;

public class Valoraciones extends VistaValoraciones {
	public Ver_producto _ver_producto;
	public Vector<Valoracion> _valoracion = new Vector<Valoracion>();
	
	
	
	public Valoraciones (basededatos.Valoracion[] valoraciones) {
		
		this.getVaadinVerticalLayout().removeAll();		
		
		if (valoraciones.length != 0) {
            for (int i = 0; i < valoraciones.length; i++) {
                this.getVaadinVerticalLayout().add(new interfaz.Valoracion(valoraciones[i]));
            }
        }else {
            Label titulo= new Label();
            titulo.setText("No hay productos en la BD");
            this.getVaadinVerticalLayout().add(titulo);
        }
		
		
		
	}
	
}