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
import org.orm.criteria.BooleanExpression;
import org.orm.criteria.IntegerExpression;
import org.orm.criteria.StringExpression;

public class Encargado_comprasDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression email;
	public final StringExpression password;
	public final BooleanExpression activo;
	
	public Encargado_comprasDetachedCriteria() {
		super(basededatos.Encargado_compras.class, basededatos.Encargado_comprasCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		activo = new BooleanExpression("activo", this.getDetachedCriteria());
	}
	
	public Encargado_comprasDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.Encargado_comprasCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		activo = new BooleanExpression("activo", this.getDetachedCriteria());
	}
	
	public Encargado_compras uniqueEncargado_compras(PersistentSession session) {
		return (Encargado_compras) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Encargado_compras[] listEncargado_compras(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Encargado_compras[]) list.toArray(new Encargado_compras[list.size()]);
	}
}

