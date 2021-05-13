package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.tabs.Tab;

/**
 * A Designer generated component for the vista-veproducto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-veproducto")
@JsModule("./src/vista-veproducto.js")
public class VistaVeproducto extends PolymerTemplate<VistaVeproducto.VistaVeproductoModel> {

    @Id("img1-producto")
	private Image img1Producto;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("label-nombre")
	private Label nombreProducto;
	@Id("label-categoria")
	private Label nombreCategoria;
	@Id("label-precio")
	private Label nombrePrecio;
	@Id("label-precioanterior")
	private Label precioAnterior;
	@Id("label-fechaoferta")
	private Label fechaOferta;
	@Id("label-nopiniones")
	private Label nOpiniones;
	@Id("h41")
	private H4 tituloAnteriorh41;
	@Id("h4")
	private H4 tituloOfertah4;
	@Id("hlValoracion")
	private HorizontalLayout hlValoracion;
	@Id("vistaVerproductoclientes")
	private Element claseBotonProductoCliente;
	
	@Id("vaadinTabs")
	private Tabs vaadinTabs;
	
	@Id("btnDescripcion")
	private Tab btnDescripcion;
	
	@Id("btnValoracion")
	private Tab btnValoracion;
	
	
	@Id("vlDescripcion")
	private VerticalLayout vlDescripcion;
	
	@Id("vlValoracion")
	private VerticalLayout vlValoracion;
	
	@Id("label-descripcion")
	private Label labelDescripcion;
	
	@Id("vistaValoraciones")
	private Element vistaValoraciones;
	
	@Id("vldescripcionAndValoracion")
	private VerticalLayout vldescripcionAndValoracion;

	
	
	
	public VerticalLayout getVldescripcionAndValoracion() {
		return vldescripcionAndValoracion;
	}

	public void setVldescripcionAndValoracion(VerticalLayout vldescripcionAndValoracion) {
		this.vldescripcionAndValoracion = vldescripcionAndValoracion;
	}

	public Tabs getVaadinTabs() {
		return vaadinTabs;
	}

	public void setVaadinTabs(Tabs vaadinTabs) {
		this.vaadinTabs = vaadinTabs;
	}

	public Tab getBtnDescripcion() {
		return btnDescripcion;
	}

	public void setBtnDescripcion(Tab btnDescripcion) {
		this.btnDescripcion = btnDescripcion;
	}

	public Tab getBtnValoracion() {
		return btnValoracion;
	}

	public void setBtnValoracion(Tab btnValoracion) {
		this.btnValoracion = btnValoracion;
	}

	public VerticalLayout getVlDescripcion() {
		return vlDescripcion;
	}

	public void setVlDescripcion(VerticalLayout vlDescripcion) {
		this.vlDescripcion = vlDescripcion;
	}

	public VerticalLayout getVlValoracion() {
		return vlValoracion;
	}

	public void setVlValoracion(VerticalLayout vlValoracion) {
		this.vlValoracion = vlValoracion;
	}

	public Label getLabelDescripcion() {
		return labelDescripcion;
	}

	public void setLabelDescripcion(Label labelDescripcion) {
		this.labelDescripcion = labelDescripcion;
	}

	public Element getVistaValoraciones() {
		return vistaValoraciones;
	}

	public void setVistaValoraciones(Element vistaValoraciones) {
		this.vistaValoraciones = vistaValoraciones;
	}

	public Element getClaseBotonProductoCliente() {
		return claseBotonProductoCliente;
	}

	public void setClaseBotonProductoCliente(Element claseBotonProductoCliente) {
		this.claseBotonProductoCliente = claseBotonProductoCliente;
	}

	public HorizontalLayout getHlValoracion() {
		return hlValoracion;
	}

	public void setHlValoracion(HorizontalLayout hlValoracion) {
		this.hlValoracion = hlValoracion;
	}

	public Image getImg1Producto() {
		return img1Producto;
	}

	public void setImg1Producto(Image img1Producto) {
		this.img1Producto = img1Producto;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Label getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(Label nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Label getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(Label nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	public Label getNombrePrecio() {
		return nombrePrecio;
	}

	public void setNombrePrecio(Label nombrePrecio) {
		this.nombrePrecio = nombrePrecio;
	}

	public Label getPrecioAnterior() {
		return precioAnterior;
	}

	public void setPrecioAnterior(Label precioAnterior) {
		this.precioAnterior = precioAnterior;
	}

	public Label getFechaOferta() {
		return fechaOferta;
	}

	public void setFechaOferta(Label fechaOferta) {
		this.fechaOferta = fechaOferta;
	}

	public Label getnOpiniones() {
		return nOpiniones;
	}

	public void setnOpiniones(Label nOpiniones) {
		this.nOpiniones = nOpiniones;
	}

	public H4 getTituloAnteriorh41() {
		return tituloAnteriorh41;
	}

	public void setTituloAnteriorh41(H4 tituloAnteriorh41) {
		this.tituloAnteriorh41 = tituloAnteriorh41;
	}

	public H4 getTituloOfertah4() {
		return tituloOfertah4;
	}

	public void setTituloOfertah4(H4 tituloOfertah4) {
		this.tituloOfertah4 = tituloOfertah4;
	}

	/**
     * Creates a new VistaVeproducto.
     */
    public VistaVeproducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVeproducto and vista-veproducto
     */
    public interface VistaVeproductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
