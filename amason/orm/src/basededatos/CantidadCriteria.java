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

public class CantidadCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression contiene_unId;
	public final AssociationExpression contiene_un;
	public final IntegerExpression contenido_enId;
	public final AssociationExpression contenido_en;
	public final IntegerExpression cantidad;
	
	public CantidadCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		contiene_unId = new IntegerExpression("contiene_un.id", this);
		contiene_un = new AssociationExpression("contiene_un", this);
		contenido_enId = new IntegerExpression("contenido_en.id", this);
		contenido_en = new AssociationExpression("contenido_en", this);
		cantidad = new IntegerExpression("cantidad", this);
	}
	
	public CantidadCriteria(PersistentSession session) {
		this(session.createCriteria(Cantidad.class));
	}
	
	public CantidadCriteria() throws PersistentException {
		this(MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession());
	}
	
	public ProductoCriteria createContiene_unCriteria() {
		return new ProductoCriteria(createCriteria("contiene_un"));
	}
	
	public PedidoCriteria createContenido_enCriteria() {
		return new PedidoCriteria(createCriteria("contenido_en"));
	}
	
	public Cantidad uniqueCantidad() {
		return (Cantidad) super.uniqueResult();
	}
	
	public Cantidad[] listCantidad() {
		java.util.List list = super.list();
		return (Cantidad[]) list.toArray(new Cantidad[list.size()]);
	}
}

