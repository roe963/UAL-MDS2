package interfaz;

import com.vaadin.flow.component.select.Select;

import vistas.VistaDatosdecompra;

public class Datos_de_compra extends VistaDatosdecompra {
	/*
	 * private button _comprar; public Ver_perfil _ver_perfil; public
	 * Tramitar_pedido _tramitar_pedido; public Seleccionar_direccion_de_envio
	 * _seleccionar_direccion_de_envio; public Seleccionar_metodo_de_pago
	 * _seleccionar_metodo_de_pago;
	 */

	
	Select<String> labelSelect = new Select<>();

	public Datos_de_compra(String direccion, String formaPago) {
	

		this.getTextfieldDireccion().setValue(direccion);
		
		// carga el select
		this.getVlFormadePago().removeAll();
		labelSelect.setItems("Tarjeta", "Bizum");
		labelSelect.setValue(formaPago);
		labelSelect.setLabel("Forma de pago");
		this.getVlFormadePago().add(labelSelect);

	}

	

}