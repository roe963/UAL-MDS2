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
import org.orm.criteria.CollectionExpression;
import org.orm.criteria.IntegerExpression;
import org.orm.criteria.StringExpression;

public class ValoracionCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression valora_unId;
	public final AssociationExpression valora_un;
	public final IntegerExpression puntuacion;
	public final StringExpression comentario;
	public final CollectionExpression escrito_por;
	
	public ValoracionCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		valora_unId = new IntegerExpression("valora_un.id", this);
		valora_un = new AssociationExpression("valora_un", this);
		puntuacion = new IntegerExpression("puntuacion", this);
		comentario = new StringExpression("comentario", this);
		escrito_por = new CollectionExpression("ORM_escrito_por", this);
	}
	
	public ValoracionCriteria(PersistentSession session) {
		this(session.createCriteria(Valoracion.class));
	}
	
	public ValoracionCriteria() throws PersistentException {
		this(MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession());
	}
	
	public ProductoCriteria createValora_unCriteria() {
		return new ProductoCriteria(createCriteria("valora_un"));
	}
	
	public ClienteCriteria createEscrito_porCriteria() {
		return new ClienteCriteria(createCriteria("ORM_escrito_por"));
	}
	
	public Valoracion uniqueValoracion() {
		return (Valoracion) super.uniqueResult();
	}
	
	public Valoracion[] listValoracion() {
		java.util.List list = super.list();
		return (Valoracion[]) list.toArray(new Valoracion[list.size()]);
	}
}

