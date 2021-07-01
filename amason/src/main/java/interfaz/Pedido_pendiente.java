package interfaz;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dialog.Dialog;

import basededatos.Pedido;
import basededatos.Usuario;
import bds.BDPrincipal;
import bds.iEmpresa_transportes;
import bds.iEncargado_compras;
import vistas.VistaPedidopendiente;

public class Pedido_pendiente extends VistaPedidopendiente {
    
    iEncargado_compras bd = new BDPrincipal();

    public Pedido_pendiente(Pedido p) {
        this.getLblPedido().setText("Pedido " + p.getId());
        this.getBtnVerDetallesPedido().addClickListener(event -> {
            Dialog d = new Dialog();
            d.setWidth("30%");
            d.add(new Ver_informacion(p, d));
            d.open();
        });

        this.getSelectEmpresaTransportes().setItems(bd.cargar_empresas_transportes());
        this.getSelectEmpresaTransportes().setItemLabelGenerator(Usuario::getEmail);
        this.getSelectEmpresaTransportes().addValueChangeListener(event -> {
            marcar_como_enviado(p);
        });
    }
    
    public void marcar_como_enviado(Pedido p) {
        bd.marcar_como_enviado(p.getId(), this.getSelectEmpresaTransportes().getValue().getId());
        UI.getCurrent().navigate("");
        UI.getCurrent().navigate("encargadocompras");
    }

}