package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.templatemodel.TemplateModel;

import basededatos.Categoria;
import vistas.VistaOfertas;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

/**
 * A Designer generated component for the vista-cliente template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cliente")
@JsModule("./src/vista-cliente.js")
public class VistaCliente extends PolymerTemplate<VistaCliente.VistaClienteModel> {
	
	//////Barra Navegacion /////
	@Id("layout-menu")
    private VerticalLayout layoutMenu;
    
    public VerticalLayout getLayoutMenu() {
        return layoutMenu;
    }

    public void setLayoutMenu(VerticalLayout layoutMenu) {
        this.layoutMenu = layoutMenu;
    }
    //////Barra Navegacion /////
	
    
	@Id("layout-topventas-categoria")
	private HorizontalLayout topVentas;
	
	public HorizontalLayout getTopVentas() {
		return topVentas;
	}

	public void setTopVentas(HorizontalLayout vaadinHorizontalLayout) {
		this.topVentas = vaadinHorizontalLayout;
	}
	
	
	@Id("layout-ofertas")
	private HorizontalLayout ofertas;
	
	public HorizontalLayout getOfertas() {
		return ofertas;
	}

	public void setOfertas(HorizontalLayout vaadinHorizontalLayout1) {
		this.ofertas = vaadinHorizontalLayout1;
	}

	
    @Id("select-categoria")
    private Select<Categoria> selectCategoria;

	public Select<Categoria> getSelectCategoria() {
		return selectCategoria;
	}

	public void setSelectCategoria(Select<Categoria> selectCategoria) {
		this.selectCategoria = selectCategoria;
	}
	
	/**
     * Creates a new VistaCliente.
     */
    public VistaCliente() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCliente and vista-cliente
     */
    public interface VistaClienteModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

}
