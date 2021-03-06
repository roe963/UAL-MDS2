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

public class Encargado_comprasDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression email;
	public final StringExpression password;
	public final BooleanExpression activo;
	public final CollectionExpression escribe_una;
	
	public Encargado_comprasDetachedCriteria() {
		super(basededatos.Encargado_compras.class, basededatos.Encargado_comprasCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		activo = new BooleanExpression("activo", this.getDetachedCriteria());
		escribe_una = new CollectionExpression("ORM_escribe_una", this.getDetachedCriteria());
	}
	
	public Encargado_comprasDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.Encargado_comprasCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		activo = new BooleanExpression("activo", this.getDetachedCriteria());
		escribe_una = new CollectionExpression("ORM_escribe_una", this.getDetachedCriteria());
	}
	
	public RespuestaDetachedCriteria createEscribe_unaCriteria() {
		return new RespuestaDetachedCriteria(createCriteria("ORM_escribe_una"));
	}
	
	public Encargado_compras uniqueEncargado_compras(PersistentSession session) {
		return (Encargado_compras) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Encargado_compras[] listEncargado_compras(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Encargado_compras[]) list.toArray(new Encargado_compras[list.size()]);
	}
}

