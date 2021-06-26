package interfaz;

import vistas.VistaElegircantidad;

public class Elegir_cantidad extends VistaElegircantidad {

    public Elegir_cantidad() {
        this.getSelectCantidad().setItems(new Integer[] {1, 2, 3, 4, 5});
    }
    
}