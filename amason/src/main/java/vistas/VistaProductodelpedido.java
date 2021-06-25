package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

import basededatos.Cantidad;

import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-productodelpedido template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productodelpedido")
@JsModule("./src/vista-productodelpedido.js")
public class VistaProductodelpedido extends PolymerTemplate<VistaProductodelpedido.VistaProductodelpedidoModel> {
    
    @Id("img-producto-pedido")
    private Image imageProducto;
    
    @Id("h-nombre-producto-pedido")
    private H4 nombreProducto;
    
    @Id("lbl-categoria-producto-pedido")
    private Label categoriaProducto;
    
    @Id("lbl-cantidad-producto-pedido")
    private Label cantidadProducto;
    
    @Id("lbl-precio-producto-pedido")
    private Label precioPoducto;
    
    @Id("h-preciototal-producto-pedido")
    private H4 precioTotalPoducto;
    
    @Id("button-valorar-producto-pedido")
    private Button valorarProducto;

    
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

    public Label getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(Label cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
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

    public Button getValorarProducto() {
        return valorarProducto;
    }

    public void setValorarProducto(Button valorarProducto) {
        this.valorarProducto = valorarProducto;
    }

    /**
     * Creates a new VistaProductodelpedido.
     */
    public VistaProductodelpedido(Cantidad c) {
        // You can initialise any data required for the connected UI components here.        
    }

    /**
     * This model binds properties between VistaProductodelpedido and vista-productodelpedido
     */
    public interface VistaProductodelpedidoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
