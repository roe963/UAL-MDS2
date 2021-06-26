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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Pedido_entregadoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression realizado_porId;
	public final AssociationExpression realizado_por;
	public final LongExpression fecha;
	public final FloatExpression precio;
	public final CollectionExpression contiene_un;
	public final IntegerExpression entregado_porId;
	public final AssociationExpression entregado_por;
	
	public Pedido_entregadoDetachedCriteria() {
		super(basededatos.Pedido_entregado.class, basededatos.Pedido_entregadoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		realizado_porId = new IntegerExpression("realizado_por.", this.getDetachedCriteria());
		realizado_por = new AssociationExpression("realizado_por", this.getDetachedCriteria());
		fecha = new LongExpression("fecha", this.getDetachedCriteria());
		precio = new FloatExpression("precio", this.getDetachedCriteria());
		contiene_un = new CollectionExpression("ORM_contiene_un", this.getDetachedCriteria());
		entregado_porId = new IntegerExpression("entregado_por.", this.getDetachedCriteria());
		entregado_por = new AssociationExpression("entregado_por", this.getDetachedCriteria());
	}
	
	public Pedido_entregadoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.Pedido_entregadoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		realizado_porId = new IntegerExpression("realizado_por.", this.getDetachedCriteria());
		realizado_por = new AssociationExpression("realizado_por", this.getDetachedCriteria());
		fecha = new LongExpression("fecha", this.getDetachedCriteria());
		precio = new FloatExpression("precio", this.getDetachedCriteria());
		contiene_un = new CollectionExpression("ORM_contiene_un", this.getDetachedCriteria());
		entregado_porId = new IntegerExpression("entregado_por.", this.getDetachedCriteria());
		entregado_por = new AssociationExpression("entregado_por", this.getDetachedCriteria());
	}
	
	public Empresa_transportesDetachedCriteria createEntregado_porCriteria() {
		return new Empresa_transportesDetachedCriteria(createCriteria("entregado_por"));
	}
	
	public ClienteDetachedCriteria createRealizado_porCriteria() {
		return new ClienteDetachedCriteria(createCriteria("realizado_por"));
	}
	
	public CantidadDetachedCriteria createContiene_unCriteria() {
		return new CantidadDetachedCriteria(createCriteria("ORM_contiene_un"));
	}
	
	public Pedido_entregado uniquePedido_entregado(PersistentSession session) {
		return (Pedido_entregado) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Pedido_entregado[] listPedido_entregado(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Pedido_entregado[]) list.toArray(new Pedido_entregado[list.size()]);
	}
}

