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

public class MensajeCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression escrito_porId;
	public final AssociationExpression escrito_por;
	public final CollectionExpression contiene_un;
	
	public MensajeCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		escrito_porId = new IntegerExpression("escrito_por.", this);
		escrito_por = new AssociationExpression("escrito_por", this);
		contiene_un = new CollectionExpression("ORM_contiene_un", this);
	}
	
	public MensajeCriteria(PersistentSession session) {
		this(session.createCriteria(Mensaje.class));
	}
	
	public MensajeCriteria() throws PersistentException {
		this(MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession());
	}
	
	public ClienteCriteria createEscrito_porCriteria() {
		return new ClienteCriteria(createCriteria("escrito_por"));
	}
	
	public RespuestaCriteria createContiene_unCriteria() {
		return new RespuestaCriteria(createCriteria("ORM_contiene_un"));
	}
	
	public Mensaje uniqueMensaje() {
		return (Mensaje) super.uniqueResult();
	}
	
	public Mensaje[] listMensaje() {
		java.util.List list = super.list();
		return (Mensaje[]) list.toArray(new Mensaje[list.size()]);
	}
}

