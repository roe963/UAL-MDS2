package interfaz;

import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import ual.mds2.ortegaortega.MenuHeader;
import vistas.VistaVertodoslospedidos;

@PreserveOnRefresh
@Route("ver_todos_los_pedidos")
public class Ver_todos_los_pedidos extends VistaVertodoslospedidos {
	
	public Ver_todos_los_pedidos() {
		/*MenuBar mb = MenuHeader.getMenuBar();
        this.getLayoutMenu().add(mb);
        this.getLayoutMenu().setHorizontalComponentAlignment(Alignment.CENTER, mb);*/
	}
	
	public void cargar_pedidos() {
		throw new UnsupportedOperationException();
	}

	public void detalle_pedido() {
		throw new UnsupportedOperationException();
	}
}