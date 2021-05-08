package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Label;
import vistas.VistaVerproductoclientes;

/**
 * A Designer generated component for the vista-verproducto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-verproducto")
@JsModule("./src/vista-verproducto.js")
public class VistaVerproducto extends PolymerTemplate<VistaVerproducto.VistaVerproductoModel> {

    @Id("img1-producto")
	private Image img1Producto;
	@Id("label-nombre")
	private Label labelNombre;
	@Id("label-categoria")
	private Label labelCategoria;
	@Id("label-precio")
	private Label labelPrecio;
	@Id("label-precioanterior")
	private Label labelPrecioanterior;
	@Id("label-fechaoferta")
	private Label labelFechaoferta;
	@Id("label-nopiniones")
	private Label labelNopiniones;
	@Id("vistaVerproductoclientes")
	private VistaVerproductoclientes vistaVerproductoclientes;

	/**
     * Creates a new VistaVerproducto.
     */
    public VistaVerproducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVerproducto and vista-verproducto
     */
    public interface VistaVerproductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
