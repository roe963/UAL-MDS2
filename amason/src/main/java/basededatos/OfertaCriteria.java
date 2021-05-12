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

public class OfertaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final LongExpression fecha;
	public final FloatExpression precio;
	public final IntegerExpression contiene_unId;
	public final AssociationExpression contiene_un;
	
	public OfertaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		fecha = new LongExpression("fecha", this);
		precio = new FloatExpression("precio", this);
		contiene_unId = new IntegerExpression("contiene_un.id", this);
		contiene_un = new AssociationExpression("contiene_un", this);
	}
	
	public OfertaCriteria(PersistentSession session) {
		this(session.createCriteria(Oferta.class));
	}
	
	public OfertaCriteria() throws PersistentException {
		this(MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession());
	}
	
	public ProductoCriteria createContiene_unCriteria() {
		return new ProductoCriteria(createCriteria("contiene_un"));
	}
	
	public Oferta uniqueOferta() {
		return (Oferta) super.uniqueResult();
	}
	
	public Oferta[] listOferta() {
		java.util.List list = super.list();
		return (Oferta[]) list.toArray(new Oferta[list.size()]);
	}
}

