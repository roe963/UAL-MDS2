package interfaz;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Label;

import basededatos.BDPrincipal;
import basededatos.Categoria;
import basededatos.Foto;
import basededatos.Producto;
import basededatos.iAdministrador;
import vistas.VistaProductoadministrado;

public class Producto_administrado extends VistaProductoadministrado {

    iAdministrador administrador = new BDPrincipal();

    public Producto_administrado(basededatos.Producto producto, Agregar_producto agregar_producto) {
        Foto[] fotos = producto.contiene_una.toArray();

        this.getLabelProducto().setText(producto.getNombre().toString());
        this.getCheckboxActivar().setValue(producto.getActivo());

        this.getLayoutProducto().addClickListener(event -> {

            agregar_producto.getTextFieldIdProducto().setValue(String.valueOf(producto.getId()));
            agregar_producto.getTextFieldNombre().setValue(producto.getNombre());
            agregar_producto.getSelectCategoria().setValue(producto.getAsignado_a());
            agregar_producto.getTextFieldPrecio().setValue(String.valueOf(producto.getPrecio()));
            agregar_producto.getTextAreaDescripcion().setValue(producto.getDescripcion());
            agregar_producto.getTextFieldIdFoto().setValue(String.valueOf(fotos[0].getId()));
            agregar_producto.getTextFieldImagen().setValue(fotos[0].getUrl());
            agregar_producto.getCheckboxProductoActivo().setValue(producto.getActivo());
        });

        this.getCheckboxActivar().addValueChangeListener(event -> {
            cambiar_estado_producto(producto);
            UI.getCurrent().navigate("");
            UI.getCurrent().navigate("administrar_productos");
        });

    }

    public void cambiar_estado_producto(basededatos.Producto producto) {
        this.getCheckboxActivar().addValueChangeListener(event -> {
            administrador.cambiar_estado_producto(producto.getId(), this.getCheckboxActivar().getValue());
        });
    }
}