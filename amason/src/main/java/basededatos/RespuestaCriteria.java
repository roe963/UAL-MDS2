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
import org.orm.criteria.AssociationExpression;
import org.orm.criteria.IntegerExpression;
import org.orm.criteria.StringExpression;

public class RespuestaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression pertenece_aId;
	public final AssociationExpression pertenece_a;
	public final IntegerExpression orden;
	public final StringExpression contendio;
	
	public RespuestaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		pertenece_aId = new IntegerExpression("pertenece_a.id", this);
		pertenece_a = new AssociationExpression("pertenece_a", this);
		orden = new IntegerExpression("orden", this);
		contendio = new StringExpression("contendio", this);
	}
	
	public RespuestaCriteria(PersistentSession session) {
		this(session.createCriteria(Respuesta.class));
	}
	
	public RespuestaCriteria() throws PersistentException {
		this(MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession());
	}
	
	public MensajeCriteria createPertenece_aCriteria() {
		return new MensajeCriteria(createCriteria("pertenece_a"));
	}
	
	public Respuesta uniqueRespuesta() {
		return (Respuesta) super.uniqueResult();
	}
	
	public Respuesta[] listRespuesta() {
		java.util.List list = super.list();
		return (Respuesta[]) list.toArray(new Respuesta[list.size()]);
	}
}
