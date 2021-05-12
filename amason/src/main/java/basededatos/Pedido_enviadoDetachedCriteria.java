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

public class Pedido_enviadoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression realizado_porId;
	public final AssociationExpression realizado_por;
	public final LongExpression fecha;
	public final FloatExpression precio;
	public final CollectionExpression contiene_un;
	public final IntegerExpression asignado_aId;
	public final AssociationExpression asignado_a;
	
	public Pedido_enviadoDetachedCriteria() {
		super(basededatos.Pedido_enviado.class, basededatos.Pedido_enviadoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		realizado_porId = new IntegerExpression("realizado_por.", this.getDetachedCriteria());
		realizado_por = new AssociationExpression("realizado_por", this.getDetachedCriteria());
		fecha = new LongExpression("fecha", this.getDetachedCriteria());
		precio = new FloatExpression("precio", this.getDetachedCriteria());
		contiene_un = new CollectionExpression("ORM_contiene_un", this.getDetachedCriteria());
		asignado_aId = new IntegerExpression("asignado_a.", this.getDetachedCriteria());
		asignado_a = new AssociationExpression("asignado_a", this.getDetachedCriteria());
	}
	
	public Pedido_enviadoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.Pedido_enviadoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		realizado_porId = new IntegerExpression("realizado_por.", this.getDetachedCriteria());
		realizado_por = new AssociationExpression("realizado_por", this.getDetachedCriteria());
		fecha = new LongExpression("fecha", this.getDetachedCriteria());
		precio = new FloatExpression("precio", this.getDetachedCriteria());
		contiene_un = new CollectionExpression("ORM_contiene_un", this.getDetachedCriteria());
		asignado_aId = new IntegerExpression("asignado_a.", this.getDetachedCriteria());
		asignado_a = new AssociationExpression("asignado_a", this.getDetachedCriteria());
	}
	
	public Empresa_transportesDetachedCriteria createAsignado_aCriteria() {
		return new Empresa_transportesDetachedCriteria(createCriteria("asignado_a"));
	}
	
	public ClienteDetachedCriteria createRealizado_porCriteria() {
		return new ClienteDetachedCriteria(createCriteria("realizado_por"));
	}
	
	public CantidadDetachedCriteria createContiene_unCriteria() {
		return new CantidadDetachedCriteria(createCriteria("ORM_contiene_un"));
	}
	
	public Pedido_enviado uniquePedido_enviado(PersistentSession session) {
		return (Pedido_enviado) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Pedido_enviado[] listPedido_enviado(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Pedido_enviado[]) list.toArray(new Pedido_enviado[list.size()]);
	}
}

