package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;

import bds.BDPrincipal;
import bds.iAdministrador;
import vistas.VistaAgregarcategoria;

public class Agregar_categoria extends VistaAgregarcategoria {
	
	iAdministrador administrador = new BDPrincipal();
	
	public Agregar_categoria() {
		getTextFieldIdCategoria().setVisible(false);
				
		this.getButtonAnadir().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				agregar_categoria();
				
				UI.getCurrent().navigate("");
				UI.getCurrent().navigate("administrar_categorias");
			}
		});
	}
	
	public void agregar_categoria() {
		String nombre = getTextFieldNombre().getValue();
		if (!nombre.isEmpty())	administrador.agregar_categoria(nombre);
	}
	
}