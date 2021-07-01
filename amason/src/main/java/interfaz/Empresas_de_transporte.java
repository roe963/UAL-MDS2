package interfaz;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaEmpresasdetransportes;

public class Empresas_de_transporte extends VistaEmpresasdetransportes {
	
	iAdministrador administrador = new BDPrincipal();
	
	Agregar_empleado ae;
	
	public Empresas_de_transporte(Agregar_empleado agregar_empleado) {
	    
	    ae = agregar_empleado;
	    
	    basededatos.Empresa_transportes[] empresaTransportes = administrador.cargar_empleados_empresa_transportes();
        
        this.getLayoutEmpresasTransportes().removeAll();
        if (empresaTransportes.length != 0) {
            for (int i = 0; i < empresaTransportes.length; i++) {
                this.getLayoutEmpresasTransportes().add(new interfaz.Empresa_de_transportes(empresaTransportes[i], agregar_empleado));
            }
        } else {
            Label titulo= new Label();
            titulo.setText("No hay empresas de transportes en la BD");
            this.getLayoutEmpresasTransportes().add(titulo);
        }
	}

    public void modificar_usuario_empresa_transportes() {
        String nombre = ae.getTextFieldUsuario().getValue();
        String password = ae.getTextFieldPassword().getValue();
        Integer idUsuario = null;
        
        try {
            idUsuario = Integer.parseInt(ae.getTextFieldUsuario().getValue());
        } catch(Exception e) {
            
        }
        
        if (nombre.isEmpty() || password.isEmpty() || idUsuario == null) {
            new Notification("Usuario, contraseña y tipo de usuario no puede estar vacíos", 3000, Position.MIDDLE).open();;
        } else {
            administrador.modificar_usuario_empresa_transportes((int)idUsuario, nombre, password);
            UI.getCurrent().navigate("");
            UI.getCurrent().navigate("administrar_empleados");
            new Notification(nombre + " añadido correctamente", 3000, Position.MIDDLE).open();;
        }
        
    }
}