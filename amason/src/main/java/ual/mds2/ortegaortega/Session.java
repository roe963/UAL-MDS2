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

    public static Usuario getCliente() {
        return usuario;
    }

    public static void setUsuario(Usuario u) {
        usuario = u;
    }

    private static List<Producto_del_carrito> carrito = new ArrayList<>();

    public static List<Producto_del_carrito> getCarrito() {
        return carrito;
    }

    public static void setCarrito(List<Producto_del_carrito> c) {
        carrito = c;
    }

    public static void updateCantidad(int index, int cant) {
        carrito.get(index).setCantidad(cant);
    }
    
    public static void vaciarCarrito() {
        carrito.clear();
    }
}
