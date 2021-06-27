package interfaz;

import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import ual.mds2.ortegaortega.MenuHeader;
import vistas.VistaEmpresatransportes;

@PreserveOnRefresh
@Route("empresatransportes")
public class Empresa_transportes extends VistaEmpresatransportes {
	
	public Empresa_transportes() {
	    MenuBar mb = MenuHeader.getMenuBar();
        this.getLayoutHeader().removeAll();
        this.getLayoutHeader().add(mb);
        this.getLayoutHeader().setHorizontalComponentAlignment(Alignment.CENTER, mb);
        this.getLayoutPedidosEnviados().add(new Pedidos_enviados());
        this.getLayoutPedidosEntregados().add(new Pedidos_entregados());
	}
}