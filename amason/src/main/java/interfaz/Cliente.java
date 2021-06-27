package interfaz;

import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import basededatos.Categoria;
import bds.BDPrincipal;
import bds.iCliente;
import vistas.VistaCliente;

import ual.mds2.ortegaortega.MenuHeader;

@PreserveOnRefresh
@Route("cliente")
public class Cliente extends VistaCliente {
	
    iCliente bd = new BDPrincipal();
    
	public Cliente() {
	    MenuBar mb = MenuHeader.getMenuBar();
	    this.getLayoutMenu().removeAll();
	    this.getLayoutMenu().add(mb);
	    this.getLayoutMenu().setHorizontalComponentAlignment(Alignment.CENTER, mb);
	    
		//Crear la interfaz ofertas
		this.getOfertas().removeAll();
		this.getOfertas().add(new Ofertas());	
		
		//crear la interfaz top ventas
		basededatos.Categoria[] categorias = bd.cargar_categorias();
		this.getSelectCategoria().setItems(categorias);
		this.getSelectCategoria().setItemLabelGenerator(Categoria::getNombre);
		this.getSelectCategoria().addValueChangeListener(event -> {
	        this.getTopVentas().removeAll();
		    this.getTopVentas().add(new Productos(this.getSelectCategoria().getValue()));
		});
        this.getSelectCategoria().setValue(categorias[0]);
	}
	
}