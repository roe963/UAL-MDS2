package interfaz;

import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import basededatos.iCliente_registrado;
import ual.mds2.ortegaortega.MenuHeader;
import vistas.VistaVertodoslospedidos;

@PreserveOnRefresh
@Route("ver_todos_los_pedidos")
public class Ver_todos_los_pedidos extends VistaVertodoslospedidos {
    
    iAdministrador bd = new BDPrincipal();
	
	public Ver_todos_los_pedidos() {
		MenuBar mb = MenuHeader.getMenuBar();
		this.getLayoutMenu().removeAll();
        this.getLayoutMenu().add(mb);
        this.getLayoutMenu().setHorizontalComponentAlignment(Alignment.CENTER, mb);
        
        this.getLayoutPedidos().removeAll();
        this.getLayoutPedidos().add(new Pedidos(bd.cargar_pedidos_pendientes(), "Pendiente"));
        this.getLayoutPedidos().add(new Pedidos(bd.cargar_pedidos_enviados(), "Enviado"));
        this.getLayoutPedidos().add(new Pedidos(bd.cargar_pedidos_entregados(), "Entregado"));
	}
}