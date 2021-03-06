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

public class Encargado_comprasCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression email;
	public final StringExpression password;
	public final BooleanExpression activo;
	public final CollectionExpression escribe_una;
	
	public Encargado_comprasCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		email = new StringExpression("email", this);
		password = new StringExpression("password", this);
		activo = new BooleanExpression("activo", this);
		escribe_una = new CollectionExpression("ORM_escribe_una", this);
	}
	
	public Encargado_comprasCriteria(PersistentSession session) {
		this(session.createCriteria(Encargado_compras.class));
	}
	
	public Encargado_comprasCriteria() throws PersistentException {
		this(MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession());
	}
	
	public RespuestaCriteria createEscribe_unaCriteria() {
		return new RespuestaCriteria(createCriteria("ORM_escribe_una"));
	}
	
	public Encargado_compras uniqueEncargado_compras() {
		return (Encargado_compras) super.uniqueResult();
	}
	
	public Encargado_compras[] listEncargado_compras() {
		java.util.List list = super.list();
		return (Encargado_compras[]) list.toArray(new Encargado_compras[list.size()]);
	}
}

