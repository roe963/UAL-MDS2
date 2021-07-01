package interfaz;

import basededatos.BDPrincipal;
import basededatos.Usuario;
import basededatos.iCliente;
import basededatos.iIniciar_sesion;
import vistas.VistaIniciarsesion;

public class Iniciar_sesion extends VistaIniciarsesion{

	iIniciar_sesion ini= new BDPrincipal();
    iCliente cliente = new BDPrincipal();

    public Iniciar_sesion() {

    }
    
    public Usuario iniciar_sesion(String user, String password) {
        return ini.iniciar_sesion(user, password);
    }
}