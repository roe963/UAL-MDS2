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
import org.orm.criteria.AbstractORMDetachedCriteria;
import org.orm.criteria.AssociationExpression;
import org.orm.criteria.CollectionExpression;
import org.orm.criteria.IntegerExpression;

public class CantidadDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression contiene_unId;
	public final AssociationExpression contiene_un;
	public final IntegerExpression cantidad;
	public final CollectionExpression contenido_en;
	
	public CantidadDetachedCriteria() {
		super(basededatos.Cantidad.class, basededatos.CantidadCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		contiene_unId = new IntegerExpression("contiene_un.id", this.getDetachedCriteria());
		contiene_un = new AssociationExpression("contiene_un", this.getDetachedCriteria());
		cantidad = new IntegerExpression("cantidad", this.getDetachedCriteria());
		contenido_en = new CollectionExpression("ORM_contenido_en", this.getDetachedCriteria());
	}
	
	public CantidadDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.CantidadCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		contiene_unId = new IntegerExpression("contiene_un.id", this.getDetachedCriteria());
		contiene_un = new AssociationExpression("contiene_un", this.getDetachedCriteria());
		cantidad = new IntegerExpression("cantidad", this.getDetachedCriteria());
		contenido_en = new CollectionExpression("ORM_contenido_en", this.getDetachedCriteria());
	}
	
	public ProductoDetachedCriteria createContiene_unCriteria() {
		return new ProductoDetachedCriteria(createCriteria("contiene_un"));
	}
	
	public PedidoDetachedCriteria createContenido_enCriteria() {
		return new PedidoDetachedCriteria(createCriteria("ORM_contenido_en"));
	}
	
	public Cantidad uniqueCantidad(PersistentSession session) {
		return (Cantidad) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Cantidad[] listCantidad(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cantidad[]) list.toArray(new Cantidad[list.size()]);
	}
}

