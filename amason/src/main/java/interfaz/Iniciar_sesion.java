package interfaz;

import basededatos.Usuario;
import bds.BDPrincipal;
import bds.iCliente;
import bds.iIniciar_sesion;
import ual.mds2.ortegaortega.ViewChanger;
import vistas.VistaIniciarsesion;

public class Iniciar_sesion extends VistaIniciarsesion{

	iIniciar_sesion ini= new BDPrincipal();
    iCliente cliente = new BDPrincipal();

    public Iniciar_sesion() {

        this.getLoginForm().addLoginListener(e -> {

            String email = e.getUsername();
            String password= e.getPassword();

            Usuario usuario= ini.iniciar_sesion(email, password);


            if(usuario.getPassword().equals("TIPO_CLIENTE")) {
                System.out.println("Abrir ventana TIPO_CLIENTE"+usuario.getEmail());
                ViewChanger.CambiarVista(new Cliente(), false);
            }
            if(usuario.getPassword().equals("TIPO_ADMINISTRADOR")) {
                System.out.println("Abrir ventana TIPO_ADMINISTRADOR"+usuario.getEmail());

            }

            if(usuario.getPassword().equals("TIPO_EMPRESA_TRANSPORTE")) {
                System.out.println("Abrir ventana TIPO_EMPRESA_TRANSPORTE"+usuario.getEmail());
            }

            if(usuario.getPassword().equals("TIPO_ENCARGADO")) {
                System.out.println("Abrir ventana TIPO_ENCARGADO"+usuario.getEmail());
            }

            if(usuario.getPassword().equals("INCORRECTO")) {
                    System.out.println("Correo o password incorrecto");

            }
        });

    }
}