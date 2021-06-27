package ual.mds2.ortegaortega;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Cantidad;
import basededatos.Usuario;
import interfaz.Producto_del_carrito;

public class Session {

    private static VerticalLayout layout = new VerticalLayout();

    public static VerticalLayout getLayout() {
        return layout;
    }

    public static void setLayout(VerticalLayout layout) {
        Session.layout = layout;
    }

    private static TIPOUSUARIO tipo = TIPOUSUARIO.CLIENTE;

    public static TIPOUSUARIO getTipo() {
        return tipo;
    }

    public static void setTipo(TIPOUSUARIO t) {
        tipo = t;
    }

    private static Usuario usuario = null;

    public static Usuario getUsuario() {
        return usuario;
    }

    public static void setUsuario(Usuario u) {
        usuario = u;
    }

    private static List<Cantidad> carrito = new ArrayList<>();

    public static List<Cantidad> getCarrito() {
        return carrito;
    }

    public static void setCarrito(List<Cantidad> c) {
        carrito = c;
    }

    public static void addToCarrito(Cantidad c) {
        Boolean existe = false;

        for (Cantidad aux : Session.getCarrito()) {
            if (aux.getContiene_un().getId() == c.getContiene_un().getId()) {
                existe = true;
                aux.setCantidad(aux.getCantidad() + 1);
                break;
            }
        }

        if (!existe)
            carrito.add(c);
    }
    
    public static void removeFromCarrito(Cantidad c) {
        for (Cantidad aux : Session.getCarrito()) {
            if (aux.getContiene_un().getId() == c.getContiene_un().getId()) {
                carrito.remove(aux);
                break;
            }
        }
    }
    
    public static double calcularPrecioTotalCarrito() {
        Double precioTotal = 0.0;
        for(Cantidad c: carrito) {
            precioTotal += c.getCantidad()*c.getContiene_un().getPrecio();
        }
        return precioTotal;
    }

    public static void updateCantidad(int index, int cant) {
        carrito.get(index).setCantidad(cant);
    }

    public static void vaciarCarrito() {
        carrito.clear();
    }
}
