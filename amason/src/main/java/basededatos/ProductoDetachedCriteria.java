/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Juandi(University of Almeria)
 * License Type: Academic
 */
package basededatos;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ProductoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression pertenece_aId;
	public final AssociationExpression pertenece_a;
	public final IntegerExpression asignado_aId;
	public final AssociationExpression asignado_a;
	public final StringExpression nombre;
	public final FloatExpression precio;
	public final BooleanExpression activo;
	public final StringExpression descripcion;
	public final CollectionExpression recibe_una;
	public final CollectionExpression contiene_una;
	public final IntegerExpression tiene_unaId;
	public final AssociationExpression tiene_una;
	
	public ProductoDetachedCriteria() {
		super(basededatos.Producto.class, basededatos.ProductoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		pertenece_aId = new IntegerExpression("pertenece_a.id", this.getDetachedCriteria());
		pertenece_a = new AssociationExpression("pertenece_a", this.getDetachedCriteria());
		asignado_aId = new IntegerExpression("asignado_a.id", this.getDetachedCriteria());
		asignado_a = new AssociationExpression("asignado_a", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		precio = new FloatExpression("precio", this.getDetachedCriteria());
		activo = new BooleanExpression("activo", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		recibe_una = new CollectionExpression("ORM_recibe_una", this.getDetachedCriteria());
		contiene_una = new CollectionExpression("ORM_contiene_una", this.getDetachedCriteria());
		tiene_unaId = new IntegerExpression("tiene_una.id", this.getDetachedCriteria());
		tiene_una = new AssociationExpression("tiene_una", this.getDetachedCriteria());
	}
	
	public ProductoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.ProductoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		pertenece_aId = new IntegerExpression("pertenece_a.id", this.getDetachedCriteria());
		pertenece_a = new AssociationExpression("pertenece_a", this.getDetachedCriteria());
		asignado_aId = new IntegerExpression("asignado_a.id", this.getDetachedCriteria());
		asignado_a = new AssociationExpression("asignado_a", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		precio = new FloatExpression("precio", this.getDetachedCriteria());
		activo = new BooleanExpression("activo", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		recibe_una = new CollectionExpression("ORM_recibe_una", this.getDetachedCriteria());
		contiene_una = new CollectionExpression("ORM_contiene_una", this.getDetachedCriteria());
		tiene_unaId = new IntegerExpression("tiene_una.id", this.getDetachedCriteria());
		tiene_una = new AssociationExpression("tiene_una", this.getDetachedCriteria());
	}
	
	public OfertaDetachedCriteria createPertenece_aCriteria() {
		return new OfertaDetachedCriteria(createCriteria("pertenece_a"));
	}
	
	public CategoriaDetachedCriteria createAsignado_aCriteria() {
		return new CategoriaDetachedCriteria(createCriteria("asignado_a"));
	}
	
	public ValoracionDetachedCriteria createRecibe_unaCriteria() {
		return new ValoracionDetachedCriteria(createCriteria("ORM_recibe_una"));
	}
	
	public FotoDetachedCriteria createContiene_unaCriteria() {
		return new FotoDetachedCriteria(createCriteria("ORM_contiene_una"));
	}
	
	public CantidadDetachedCriteria createTiene_unaCriteria() {
		return new CantidadDetachedCriteria(createCriteria("tiene_una"));
	}
	
	public Producto uniqueProducto(PersistentSession session) {
		return (Producto) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Producto[] listProducto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Producto[]) list.toArray(new Producto[list.size()]);
	}
}

