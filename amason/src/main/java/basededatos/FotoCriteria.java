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

public class FotoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression pertenece_aId;
	public final AssociationExpression pertenece_a;
	public final StringExpression url;
	
	public FotoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		pertenece_aId = new IntegerExpression("pertenece_a.id", this);
		pertenece_a = new AssociationExpression("pertenece_a", this);
		url = new StringExpression("url", this);
	}
	
	public FotoCriteria(PersistentSession session) {
		this(session.createCriteria(Foto.class));
	}
	
	public FotoCriteria() throws PersistentException {
		this(MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession());
	}
	
	public ProductoCriteria createPertenece_aCriteria() {
		return new ProductoCriteria(createCriteria("pertenece_a"));
	}
	
	public Foto uniqueFoto() {
		return (Foto) super.uniqueResult();
	}
	
	public Foto[] listFoto() {
		java.util.List list = super.list();
		return (Foto[]) list.toArray(new Foto[list.size()]);
	}
}

