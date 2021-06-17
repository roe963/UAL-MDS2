package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.templatemodel.TemplateModel;
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
	
	// Layout Top Ventas
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	
	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}
	
	// Layout Ofertas
	@Id("hlofertas")
	private HorizontalLayout vaadinHorizontalLayout1;
	
	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}
	
	@Id("layout-topventas")
	private Element layoutTopventas;
	
	public Element getLayoutTopventas() {
		return layoutTopventas;
	}

	public void setLayoutTopventas(Element layoutTopventas) {
		this.layoutTopventas = layoutTopventas;
	}
	
	@Id("vista-cliente")
	private Element layoutCliente;
	
	public Element getLayoutCliente() {
		return layoutCliente;
	}

	public void setLayoutCliente(Element layoutCliente) {
		this.layoutCliente = layoutCliente;
	}
	
    /*@Id("button-usuario")
	private Button buttonUsuario;
	
	public void setButtonUsuario(Button buttonUsuario) {
		this.buttonUsuario = buttonUsuario;
	}

	public Button getButtonUsuario() {
		return buttonUsuario;
	}*/
	
	@Id("vl_ofertas")
	private VerticalLayout vaadinVerticalLayout;
	
	public VerticalLayout getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(VerticalLayout vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}
	
	@Id("lista-ofertas")
	private VistaOfertas listaOfertas;

	public VistaOfertas getListaOfertas() {
		return listaOfertas;
	}

	public void setListaOfertas(VistaOfertas listaOfertas) {
		this.listaOfertas = listaOfertas;
	}

	@Id("select-categoria")
	private Select selectCategoria;

	public Select getSelectCategoria() {
		return selectCategoria;
	}

	public void setSelectCategoria(Select selectCategoria) {
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
