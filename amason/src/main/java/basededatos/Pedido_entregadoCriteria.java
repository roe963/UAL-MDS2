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

public class Pedido_entregadoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression realizado_porId;
	public final AssociationExpression realizado_por;
	public final LongExpression fecha;
	public final FloatExpression precio;
	public final CollectionExpression contiene_un;
	public final IntegerExpression entregado_porId;
	public final AssociationExpression entregado_por;
	
	public Pedido_entregadoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		realizado_porId = new IntegerExpression("realizado_por.", this);
		realizado_por = new AssociationExpression("realizado_por", this);
		fecha = new LongExpression("fecha", this);
		precio = new FloatExpression("precio", this);
		contiene_un = new CollectionExpression("ORM_contiene_un", this);
		entregado_porId = new IntegerExpression("entregado_por.", this);
		entregado_por = new AssociationExpression("entregado_por", this);
	}
	
	public Pedido_entregadoCriteria(PersistentSession session) {
		this(session.createCriteria(Pedido_entregado.class));
	}
	
	public Pedido_entregadoCriteria() throws PersistentException {
		this(MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession());
	}
	
	public Empresa_transportesCriteria createEntregado_porCriteria() {
		return new Empresa_transportesCriteria(createCriteria("entregado_por"));
	}
	
	public ClienteCriteria createRealizado_porCriteria() {
		return new ClienteCriteria(createCriteria("realizado_por"));
	}
	
	public CantidadCriteria createContiene_unCriteria() {
		return new CantidadCriteria(createCriteria("ORM_contiene_un"));
	}
	
	public Pedido_entregado uniquePedido_entregado() {
		return (Pedido_entregado) super.uniqueResult();
	}
	
	public Pedido_entregado[] listPedido_entregado() {
		java.util.List list = super.list();
		return (Pedido_entregado[]) list.toArray(new Pedido_entregado[list.size()]);
	}
}

