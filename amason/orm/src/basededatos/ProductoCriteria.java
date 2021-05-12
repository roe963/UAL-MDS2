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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ProductoCriteria extends AbstractORMCriteria {
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
	
	public ProductoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		pertenece_aId = new IntegerExpression("pertenece_a.id", this);
		pertenece_a = new AssociationExpression("pertenece_a", this);
		asignado_aId = new IntegerExpression("asignado_a.id", this);
		asignado_a = new AssociationExpression("asignado_a", this);
		nombre = new StringExpression("nombre", this);
		precio = new FloatExpression("precio", this);
		activo = new BooleanExpression("activo", this);
		descripcion = new StringExpression("descripcion", this);
		recibe_una = new CollectionExpression("ORM_recibe_una", this);
		contiene_una = new CollectionExpression("ORM_contiene_una", this);
		tiene_unaId = new IntegerExpression("tiene_una.id", this);
		tiene_una = new AssociationExpression("tiene_una", this);
	}
	
	public ProductoCriteria(PersistentSession session) {
		this(session.createCriteria(Producto.class));
	}
	
	public ProductoCriteria() throws PersistentException {
		this(MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession());
	}
	
	public OfertaCriteria createPertenece_aCriteria() {
		return new OfertaCriteria(createCriteria("pertenece_a"));
	}
	
	public CategoriaCriteria createAsignado_aCriteria() {
		return new CategoriaCriteria(createCriteria("asignado_a"));
	}
	
	public ValoracionCriteria createRecibe_unaCriteria() {
		return new ValoracionCriteria(createCriteria("ORM_recibe_una"));
	}
	
	public FotoCriteria createContiene_unaCriteria() {
		return new FotoCriteria(createCriteria("ORM_contiene_una"));
	}
	
	public CantidadCriteria createTiene_unaCriteria() {
		return new CantidadCriteria(createCriteria("tiene_una"));
	}
	
	public Producto uniqueProducto() {
		return (Producto) super.uniqueResult();
	}
	
	public Producto[] listProducto() {
		java.util.List list = super.list();
		return (Producto[]) list.toArray(new Producto[list.size()]);
	}
}

