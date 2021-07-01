package interfaz;

import com.vaadin.flow.component.UI;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaCategoria;

public class Categoria extends VistaCategoria {

    iAdministrador administrador = new BDPrincipal();

    public Categoria(basededatos.Categoria categoria) {

        this.getLabelCategoria().setText(categoria.getNombre().toString());
        this.getCheckboxActivar().setValue(categoria.getActivo());

        this.getCheckboxActivar().addValueChangeListener(event -> {
            cambiar_estado_categoria(categoria);

            UI.getCurrent().navigate("");
            UI.getCurrent().navigate("administrar_categorias");
        });

    }

    public void cambiar_estado_categoria(basededatos.Categoria categoria) {

        administrador.cambiar_estado_categoria(categoria.getId(), this.getCheckboxActivar().getValue());
    }
}