package interfaz;

import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import ual.mds2.ortegaortega.MenuHeader;
import vistas.VistaEncargadocompras;

@PreserveOnRefresh
@Route("encargadocompras")
public class Encargado_compras extends VistaEncargadocompras {
	
	public Encargado_compras() {
        MenuBar mb = MenuHeader.getMenuBar();
        this.getLayoutHeader().removeAll();
        this.getLayoutHeader().add(mb);
        this.getLayoutHeader().setHorizontalComponentAlignment(Alignment.CENTER, mb);
		this.getLayoutPedidosPendientes().add(new Pedidos_pendientes());
        this.getLayoutPedidosEnviados().add(new Pedidos_enviados());
	}
}