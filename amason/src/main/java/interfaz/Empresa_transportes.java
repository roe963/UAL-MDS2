package interfaz;

import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import basededatos.BDPrincipal;
import basededatos.iEmpresa_transportes;
import basededatos.iIniciar_sesion;
import ual.mds2.ortegaortega.MenuHeader;
import ual.mds2.ortegaortega.Session;
import vistas.VistaEmpresatransportes;

@PreserveOnRefresh
@Route("empresatransportes")
public class Empresa_transportes extends VistaEmpresatransportes {
    
    iIniciar_sesion bd = new BDPrincipal();
	
	public Empresa_transportes() {
	    MenuBar mb = MenuHeader.getMenuBar();
        this.getLayoutHeader().removeAll();
        this.getLayoutHeader().add(mb);
        this.getLayoutHeader().setHorizontalComponentAlignment(Alignment.CENTER, mb);
        this.getIdEmailTransportes().setText(Session.getUsuario().getEmail());
        this.getLayoutPedidosEnviados().add(new Pedidos_enviados());
        this.getLayoutPedidosEntregados().add(new Pedidos_entregados());
	}
}