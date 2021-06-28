package interfaz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.orm.PersistentException;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.OptionalParameter;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import basededatos.Cantidad;
import basededatos.Pedido;
import bds.BDPrincipal;
import bds.iCliente_registrado;
import ual.mds2.ortegaortega.MenuHeader;
import ual.mds2.ortegaortega.Session;
import vistas.VistaVerpedido;

@PreserveOnRefresh
@Route("pedido")
public class Ver_pedido extends VistaVerpedido implements HasUrlParameter<String> {
	/*private event _cancelar_compra;
	private button _cancelarCompra;
	public Pedido_cliente_registrado _pedido_cliente_registrado;
	public Productos_del_pedido _productos_del_pedido;*/
    
    @Override
    public void setParameter(BeforeEvent event, @OptionalParameter String parameter) {
        System.out.println(parameter);
        
        try {
            Pedido p = basededatos.PedidoDAO.getPedidoByORMID(Integer.parseInt(parameter));
            cargar_pedido(p);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (PersistentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    iCliente_registrado bd = new BDPrincipal();
    private Cantidad[] cantidades;
    
    private void cargar_pedido(Pedido p) {
        MenuBar mb = MenuHeader.getMenuBar();
        this.getLayoutMenu().add(mb);
        this.getLayoutMenu().setHorizontalComponentAlignment(Alignment.CENTER, mb);
        
        this.getIdPdido().setText("Pedido "+p.getId());
        this.getFechaPedido().setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date(p.getFecha())));
        this.getPrecioPedido().setText(String.valueOf(p.getPrecio())+"€");
        
        boolean estaPendiente = false;
        
        for (Pedido aux :  bd.cargar_pedidos_pendientes_cliente_registrado(Session.getUsuario().getId())) {
            if (aux.getId() == p.getId()) {
                estaPendiente = true;
                break;
            }
        }
        
        this.getCancelarCompra().setVisible(estaPendiente);
        this.getCancelarCompra().addClickListener(event -> {
            this.bd.cancelar_compra(p.getId());
            UI.getCurrent().navigate("pedidos");
        });
        
        cantidades = bd.cargar_cantidades_pedido(p.getId());
        System.out.println("cantidades: "+cantidades.length);
        this.getProductosDelPedido().removeAll();
        this.getProductosDelPedido().add(new Productos_del_pedido(cantidades));
    }
    

	public void cancelar_compra() {
		throw new UnsupportedOperationException();
	}

	public void comprobar_enviado() {
		throw new UnsupportedOperationException();
	}

	public void cargar_pedido_cliente_registrado() {
		throw new UnsupportedOperationException();
	}

	public void valorar_producto() {
		throw new UnsupportedOperationException();
	}
}