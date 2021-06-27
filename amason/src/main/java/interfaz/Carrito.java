package interfaz;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import ual.mds2.ortegaortega.MenuHeader;
import ual.mds2.ortegaortega.Session;
import ual.mds2.ortegaortega.TIPOUSUARIO;
import vistas.VistaCarrito;

@PreserveOnRefresh
@Route("carrito")
public class Carrito extends VistaCarrito {

    public Carrito() {
        MenuBar mb = MenuHeader.getMenuBar();
        this.getLayoutMenu().removeAll();
        this.getLayoutMenu().add(mb);
        this.getLayoutMenu().setHorizontalComponentAlignment(Alignment.CENTER, mb);
        
        this.getPrecioCarrito().setText(String.valueOf(Session.calcularPrecioTotalCarrito()) + "€");

        this.getProductosDelCarrito().removeAll();
        this.getProductosDelCarrito().add(new Productos_del_carrito(this));
        
        this.getTramitarPedido().setEnabled(Session.getTipo()==TIPOUSUARIO.REGISTRADO);

        this.getTramitarPedido().addClickListener(event -> {
            Dialog d = new Dialog();
            d.add(new Tramitar_pedido(d, UI.getCurrent()));
            d.open();
        });
    }
}