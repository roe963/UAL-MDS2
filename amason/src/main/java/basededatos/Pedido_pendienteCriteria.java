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

public class Pedido_pendienteCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression realizado_porId;
	public final AssociationExpression realizado_por;
	public final LongExpression fecha;
	public final FloatExpression precio;
	public final CollectionExpression contiene_un;
	
	public Pedido_pendienteCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		realizado_porId = new IntegerExpression("realizado_por.", this);
		realizado_por = new AssociationExpression("realizado_por", this);
		fecha = new LongExpression("fecha", this);
		precio = new FloatExpression("precio", this);
		contiene_un = new CollectionExpression("ORM_contiene_un", this);
	}
	
	public Pedido_pendienteCriteria(PersistentSession session) {
		this(session.createCriteria(Pedido_pendiente.class));
	}
	
	public Pedido_pendienteCriteria() throws PersistentException {
		this(MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession());
	}
	
	public ClienteCriteria createRealizado_porCriteria() {
		return new ClienteCriteria(createCriteria("realizado_por"));
	}
	
	public CantidadCriteria createContiene_unCriteria() {
		return new CantidadCriteria(createCriteria("ORM_contiene_un"));
	}
	
	public Pedido_pendiente uniquePedido_pendiente() {
		return (Pedido_pendiente) super.uniqueResult();
	}
	
	public Pedido_pendiente[] listPedido_pendiente() {
		java.util.List list = super.list();
		return (Pedido_pendiente[]) list.toArray(new Pedido_pendiente[list.size()]);
	}
}

