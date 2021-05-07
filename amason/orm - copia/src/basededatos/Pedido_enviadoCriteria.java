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

public class Pedido_enviadoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression realizado_porId;
	public final AssociationExpression realizado_por;
	public final LongExpression fecha;
	public final FloatExpression precio;
	public final CollectionExpression contiene_un;
	public final IntegerExpression asignado_aId;
	public final AssociationExpression asignado_a;
	
	public Pedido_enviadoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		realizado_porId = new IntegerExpression("realizado_por.", this);
		realizado_por = new AssociationExpression("realizado_por", this);
		fecha = new LongExpression("fecha", this);
		precio = new FloatExpression("precio", this);
		contiene_un = new CollectionExpression("ORM_contiene_un", this);
		asignado_aId = new IntegerExpression("asignado_a.", this);
		asignado_a = new AssociationExpression("asignado_a", this);
	}
	
	public Pedido_enviadoCriteria(PersistentSession session) {
		this(session.createCriteria(Pedido_enviado.class));
	}
	
	public Pedido_enviadoCriteria() throws PersistentException {
		this(MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession());
	}
	
	public Empresa_transportesCriteria createAsignado_aCriteria() {
		return new Empresa_transportesCriteria(createCriteria("asignado_a"));
	}
	
	public ClienteCriteria createRealizado_porCriteria() {
		return new ClienteCriteria(createCriteria("realizado_por"));
	}
	
	public CantidadCriteria createContiene_unCriteria() {
		return new CantidadCriteria(createCriteria("ORM_contiene_un"));
	}
	
	public Pedido_enviado uniquePedido_enviado() {
		return (Pedido_enviado) super.uniqueResult();
	}
	
	public Pedido_enviado[] listPedido_enviado() {
		java.util.List list = super.list();
		return (Pedido_enviado[]) list.toArray(new Pedido_enviado[list.size()]);
	}
}

