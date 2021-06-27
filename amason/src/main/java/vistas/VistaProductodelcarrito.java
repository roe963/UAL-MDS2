package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

import basededatos.Cantidad;

import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

/**
 * A Designer generated component for the vista-productodelcarrito template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productodelcarrito")
@JsModule("./src/vista-productodelcarrito.js")
public class VistaProductodelcarrito extends PolymerTemplate<VistaProductodelcarrito.VistaProductodelcarritoModel> {

	@Id("img-producto-carrito")
	private Image imageProducto;
	
	@Id("h-nombre-producto-carrito")
    private H4 nombreProducto;
	
	@Id("lbl-categoria-producto-carrito")
    private Label categoriaProducto;
	
	@Id("lbl-precio-producto-carrito")
    private Label precioPoducto;
	
	@Id("h-preciototal-producto-carrito")
	private H4 precioTotalPoducto;

    @Id("button-eliminar-producto-carrito")
    private Button eliminarProducto;

    @Id("layout-selec-cantidad")
    private VerticalLayout layoutSelecCantidad;
	

	public Image getImageProducto() {
        return imageProducto;
    }

    public void setImageProducto(Image imageProducto) {
        this.imageProducto = imageProducto;
    }

    public H4 getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(H4 nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Label getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(Label categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public Label getPrecioPoducto() {
        return precioPoducto;
    }

    public void setPrecioPoducto(Label precioPoducto) {
        this.precioPoducto = precioPoducto;
    }

    public H4 getPrecioTotalPoducto() {
        return precioTotalPoducto;
    }

    public void setPrecioTotalPoducto(H4 precioTotalPoducto) {
        this.precioTotalPoducto = precioTotalPoducto;
    }

    public Button getEliminarProducto() {
        return eliminarProducto;
    }

    public void setEliminarProducto(Button eliminarProducto) {
        this.eliminarProducto = eliminarProducto;
    }

    public VerticalLayout getLayoutSelecCantidad() {
        return layoutSelecCantidad;
    }

    public void setLayoutSelecCantidad(VerticalLayout layoutSelecCantidad) {
        this.layoutSelecCantidad = layoutSelecCantidad;
    }

    /**
     * Creates a new VistaProductodelcarrito.
	 * @param c 
     */
    public VistaProductodelcarrito(Cantidad c) {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductodelcarrito and vista-productodelcarrito
     */
    public interface VistaProductodelcarritoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
