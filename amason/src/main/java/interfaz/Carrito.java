package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCarrito;

public class Carrito extends VistaCarrito {
	
	public VerticalLayout vl; 
	public Cliente cliente;

	public Carrito() {
		
		vl = this.getLayoutCarrito().as(VerticalLayout.class);		
//		cliente = new Cliente();
		
		this.getaInicio().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				vl.removeAll();
				vl.add(cliente);
			}
		});
	}
	
}