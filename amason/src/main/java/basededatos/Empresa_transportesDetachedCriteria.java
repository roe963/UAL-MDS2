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
import org.orm.criteria.CollectionExpression;
import org.orm.criteria.IntegerExpression;
import org.orm.criteria.StringExpression;

public class Empresa_transportesDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression email;
	public final StringExpression password;
	public final BooleanExpression activo;
	public final CollectionExpression tiene_asignado_un;
	
	public Empresa_transportesDetachedCriteria() {
		super(basededatos.Empresa_transportes.class, basededatos.Empresa_transportesCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		activo = new BooleanExpression("activo", this.getDetachedCriteria());
		tiene_asignado_un = new CollectionExpression("ORM_tiene_asignado_un", this.getDetachedCriteria());
	}
	
	public Empresa_transportesDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.Empresa_transportesCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		activo = new BooleanExpression("activo", this.getDetachedCriteria());
		tiene_asignado_un = new CollectionExpression("ORM_tiene_asignado_un", this.getDetachedCriteria());
	}
	
	public Pedido_enviadoDetachedCriteria createTiene_asignado_unCriteria() {
		return new Pedido_enviadoDetachedCriteria(createCriteria("ORM_tiene_asignado_un"));
	}
	
	public Empresa_transportes uniqueEmpresa_transportes(PersistentSession session) {
		return (Empresa_transportes) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Empresa_transportes[] listEmpresa_transportes(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Empresa_transportes[]) list.toArray(new Empresa_transportes[list.size()]);
	}
}

