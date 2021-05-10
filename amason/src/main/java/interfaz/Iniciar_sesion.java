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

    }
}