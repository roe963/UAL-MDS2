package interfaz;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.vaadin.flow.component.UI;

import bds.BDPrincipal;
import bds.iAdministrador;
import vistas.VistaOfertaadministrador;

public class Oferta_administrador extends VistaOfertaadministrador {
	
	iAdministrador administrador = new BDPrincipal();

	public Oferta_administrador(basededatos.Oferta oferta) {
		
		//Producto[] productos = administrador.cargar_todos_productos();
		
		this.getLabelProducto().setText(oferta.getContiene_un().getNombre());
		this.getLabelFecha().setText(String.valueOf(oferta.getPrecio()));
		//this.getLabelFecha().setText(String.valueOf(oferta.getFecha()));
		this.getLabelFecha().setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date(oferta.getFecha())));
		
		/*this.getLayoutOferta().addClickListener(
			event -> {
	        	
				
				agregar_oferta.getTextFieldPrecio().setValue(String. valueOf(oferta.getPrecio()));
				
				
				//agregar_oferta.modificar_producto(oferta);
				agregar_oferta.getTextFieldIdProducto().setValue(String.valueOf(oferta.getId()));
				agregar_oferta.getTextFieldNombre().setValue(oferta.getNombre());
				//agregar_oferta.getSelectCategoria().setValue(oferta.getAsignado_a());
				agregar_oferta.asignarCategoria(oferta.getAsignado_a());
				agregar_oferta.getTextFieldPrecio().setValue(String. valueOf(oferta.getPrecio()));
				agregar_oferta.getTextAreaDescripcion().setValue(oferta.getDescripcion());
				agregar_producto.getTextFieldIdFoto().setValue(String.valueOf(fotos[0].getId()));
				agregar_oferta.getTextFieldImagen().setValue(fotos[0].getUrl());
				agregar_oferta.getCheckboxProductoActivo().setValue(oferta.getActivo());*
			}
		);*/
		
		finalizar_oferta(oferta);
		
	}

	public void finalizar_oferta(basededatos.Oferta oferta) {
		this.getButtonEliminar().addClickListener(
				event -> {
					administrador.finalizar_oferta(oferta.getId());
					
					UI.getCurrent().navigate("");
					UI.getCurrent().navigate("administrar_ofertas");
				}
			);
	}
}