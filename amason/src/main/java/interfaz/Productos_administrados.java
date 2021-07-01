package interfaz;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;

import basededatos.BDPrincipal;
import basededatos.Categoria;
import basededatos.Producto;
import basededatos.iAdministrador;
import vistas.VistaProductosadministrados;

public class Productos_administrados extends VistaProductosadministrados {

    iAdministrador administrador = new BDPrincipal();

    Agregar_producto ap;

    public Productos_administrados(Agregar_producto agregar_producto) {
        Producto[] productos = administrador.cargar_todos_productos();

        ap = agregar_producto;

        this.getLayoutProductos().removeAll();
        if (productos.length != 0) {
            for (int i = 0; i < productos.length; i++) {
                this.getLayoutProductos().add(new interfaz.Producto_administrado(productos[i], ap));
            }
        } else {
            Label titulo = new Label();
            titulo.setText("No hay productos en la BD");
            this.getLayoutProductos().add(titulo);
        }
    }

    public void modificar_producto() {

        Integer idProducto = null;
        Integer idFoto = null;
        basededatos.Categoria categoria = (Categoria) ap.getSelectCategoria().getValue();
        String nombre = ap.getTextFieldNombre().getValue();
        String descripcion = ap.getTextAreaDescripcion().getValue();
        String imagen = ap.getTextFieldImagen().getValue();
        Double precio = null;
        try {
            precio = Double.parseDouble(ap.getTextFieldPrecio().getValue());
            idProducto = Integer.parseInt(ap.getTextFieldIdProducto().getValue());
            idFoto = Integer.parseInt(ap.getTextFieldIdFoto().getValue());
        } catch (Exception e) {
            // TODO: handle exception
        }

        if (ap.getTextFieldNombre().isEmpty() || idProducto == null || idFoto == null || precio == null
                || ap.getTextFieldImagen().isEmpty() || categoria == null) {

            new Notification("No se ha podido realizar ningún cambio.", 3000, Position.MIDDLE).open();

        } else {
            administrador.modificar_proucto((int)idProducto, (int)idFoto, nombre, categoria, (double)precio, descripcion, imagen);

//            getLayoutProductos().removeAll();
//            getLayoutProductos().add(new Productos_administrados(agregar_producto));

            UI.getCurrent().navigate("");
            UI.getCurrent().navigate("administrar_productos");

            new Notification("Los datos se han modificado correctamente.", 3000, Position.MIDDLE).open();
        }
    }

}