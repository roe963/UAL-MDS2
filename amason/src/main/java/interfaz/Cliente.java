package interfaz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;

import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.internal.Pair;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import basededatos.BDPrincipal;
import basededatos.Cantidad;
import basededatos.Categoria;
import basededatos.Producto;
import basededatos.iCliente;
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
		    basededatos.Producto[] productos = bd.cargar_productos_categoria(this.getSelectCategoria().getValue().getId());
		    
		    ArrayList<Pair<basededatos.Producto, Integer>> top = new ArrayList<Pair<basededatos.Producto, Integer>>();
		    
		    for (basededatos.Producto p : productos) {
                OptionalInt cantotal = Arrays.stream(p.tiene_una.toArray()).mapToInt(Cantidad::getCantidad).reduce((c1, c2) -> c1 + c2);            
                top.add(new Pair<>(p, cantotal.isPresent() ? cantotal.getAsInt() : 0));
            }

		    top.sort(new Comparator<Pair<basededatos.Producto, Integer>>() {
		        public int compare(Pair<basededatos.Producto, Integer> p1, Pair<basededatos.Producto, Integer> p2)
	            {
	                return p1.getSecond() - p2.getSecond();
	            }
            });
		    
		    ArrayList<basededatos.Producto> topventas = new ArrayList<basededatos.Producto>();
		    
		    top.subList(0, top.size() == 0 ? 0 : 1).forEach(p -> topventas.add(p.getFirst()));
		    
	        this.getTopVentas().removeAll();
		    this.getTopVentas().add(new Productos(topventas.stream().toArray(basededatos.Producto[]::new)));
		});
        this.getSelectCategoria().setValue(categorias[0]);
	}
	
}