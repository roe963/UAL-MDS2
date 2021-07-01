package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import bds.BDPrincipal;
import bds.iAdministrador;
import ual.mds2.ortegaortega.MenuHeader;
import vistas.VistaAdministrarempleados;

@PreserveOnRefresh
@Route("administrar_empleados")
public class Administrar_empleados extends VistaAdministrarempleados {
	
	iAdministrador administrador = new BDPrincipal();
	
	public Administrar_empleados() {
		MenuBar mb = MenuHeader.getMenuBar();
	    this.getLayoutMenu().add(mb);
	    this.getLayoutMenu().setHorizontalComponentAlignment(Alignment.CENTER, mb);
	    
	    Agregar_empleado agregar_empleado = new Agregar_empleado();
	    this.getLayoutAnadirUsuario().removeAll();
	  	this.getLayoutAnadirUsuario().add(agregar_empleado);
	  	
	  	this.getLayoutEncargadoCompras().removeAll();
	  	this.getLayoutEncargadoCompras().add(new Encargados_de_compras(agregar_empleado));
	  	
	  	this.getLayoutEmpresaTransportes().removeAll();
	  	this.getLayoutEmpresaTransportes().add(new Empresas_de_transporte(agregar_empleado));
	  	
	  	this.getButtonGuardar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				//System.out.println("boton guardar");
								
				int idUsuario = Integer. parseInt(agregar_empleado.getTextFieldIdUsuario().getValue());
				
				String usuario = agregar_empleado.getTextFieldUsuario().getValue();
				String password = agregar_empleado.getTextFieldPassword().getValue();
				
				if(!(agregar_empleado.getTextFieldUsuario().isEmpty() && agregar_empleado.getTextFieldPassword().isEmpty()
						&& agregar_empleado.tipoUsuario == 0)) {
					
					if (agregar_empleado.tipoUsuario == 1) {
						administrador.modificar_usuario_encargado_compras(idUsuario, usuario, password);
						
						getLayoutEncargadoCompras().removeAll();
						getLayoutEncargadoCompras().add(new Encargados_de_compras(agregar_empleado));
					}
					if (agregar_empleado.tipoUsuario == 2) {
						administrador.modificar_usuario_empresa_transportes(idUsuario, usuario, password);
						
						getLayoutEmpresaTransportes().removeAll();
						getLayoutEmpresaTransportes().add(new Empresas_de_transporte(agregar_empleado));
					}
				  	
				  	UI.getCurrent().navigate("");
					UI.getCurrent().navigate("administrar_empleados");
					
					new Notification("Los datos se han modificado correctamente", 3000, Position.MIDDLE).open();
				} else {
					new Notification("No se ha realizado ningún cambio", 3000, Position.MIDDLE).open();
				}
				
			}
		});
	}
	
//	public void cargar_empleados() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void agregar_usuario() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void modificar_usuario() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void cambiar_estado_usaurio() {
//		throw new UnsupportedOperationException();
//	}
	
}