package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCliente;

public class Cliente extends VistaCliente {
	
//	public Button verCarrito;
	
	public VerticalLayout vl; 
	public Carrito carrito; 

	public Cliente() {

		vl = this.getLayoutCliente().as(VerticalLayout.class);		
		carrito = new Carrito();
		
		this.getVerCarrito().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				vl.removeAll();
				vl.add(carrito);
			}
		});
	}

	
}