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
import org.orm.criteria.AbstractORMCriteria;
import org.orm.criteria.BooleanExpression;
import org.orm.criteria.IntegerExpression;
import org.orm.criteria.StringExpression;

public class AdministradorCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression email;
	public final StringExpression password;
	public final BooleanExpression activo;
	
	public AdministradorCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		email = new StringExpression("email", this);
		password = new StringExpression("password", this);
		activo = new BooleanExpression("activo", this);
	}
	
	public AdministradorCriteria(PersistentSession session) {
		this(session.createCriteria(Administrador.class));
	}
	
	public AdministradorCriteria() throws PersistentException {
		this(MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession());
	}
	
	public Administrador uniqueAdministrador() {
		return (Administrador) super.uniqueResult();
	}
	
	public Administrador[] listAdministrador() {
		java.util.List list = super.list();
		return (Administrador[]) list.toArray(new Administrador[list.size()]);
	}
}

