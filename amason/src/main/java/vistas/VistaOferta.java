package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-oferta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-oferta")
@JsModule("./src/vista-oferta.js")
public class VistaOferta extends PolymerTemplate<VistaOferta.VistaOfertaModel> {

	@Id("h-fecha-oferta")
    private H5 fechaOferta;
    @Id("img-producto")
    private Image imgProducto;
    @Id("h-nombre-producto")
    private H4 nombreProducto;
    @Id("lbl-precio-normal")
    private Label precioNormal;
    @Id("h-precio-oferta")
    private H5 precioOferta;

    public H5 getFechaOferta() {
        return fechaOferta;
    }

    public void setFechaOferta(H5 fechaOferta) {
        this.fechaOferta = fechaOferta;
    }

    public Image getImgProducto() {
        return imgProducto;
    }

    public void setImgProducto(Image imgProducto) {
        this.imgProducto = imgProducto;
    }

    public H4 getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(H4 nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Label getPrecioNormal() {
        return precioNormal;
    }

    public void setPrecioNormal(Label precioNormal) {
        this.precioNormal = precioNormal;
    }

    public H5 getPrecioOferta() {
        return precioOferta;
    }

    public void setPrecioOferta(H5 precioOferta) {
        this.precioOferta = precioOferta;
    }

    /**
     * Creates a new VistaOferta.
     */
    public VistaOferta() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaOferta and vista-oferta
     */
    public interface VistaOfertaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
