package interfaz;

import basededatos.Categoria;
import bds.BDPrincipal;
import bds.iCliente;
import vistas.VistaProductos;

public class Productos extends VistaProductos {

    iCliente clientes = new BDPrincipal();

    public Productos() {

        basededatos.Producto[] productos = clientes.cargar_productos();
        
        this.getLayoutProductos().removeAll();
        for (int i = 0; i < productos.length; i++) {
            this.getLayoutProductos().add(new Producto(productos[i]));
        }
    }

    public Productos(Categoria categoria) {
        basededatos.Producto[] productos = clientes.cargar_productos_categoria(categoria.getId());
        
        this.getLayoutProductos().removeAll();
        for (int i = 0; i < productos.length; i++) {
            this.getLayoutProductos().add(new Producto(productos[i]));
        }
    }
}