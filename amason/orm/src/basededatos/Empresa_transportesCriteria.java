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

public class Empresa_transportesCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression email;
	public final StringExpression password;
	public final BooleanExpression activo;
	public final CollectionExpression escribe_una;
	public final CollectionExpression entregado_un;
	public final CollectionExpression tiene_asignado_un;
	
	public Empresa_transportesCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		email = new StringExpression("email", this);
		password = new StringExpression("password", this);
		activo = new BooleanExpression("activo", this);
		escribe_una = new CollectionExpression("ORM_escribe_una", this);
		entregado_un = new CollectionExpression("ORM_entregado_un", this);
		tiene_asignado_un = new CollectionExpression("ORM_tiene_asignado_un", this);
	}
	
	public Empresa_transportesCriteria(PersistentSession session) {
		this(session.createCriteria(Empresa_transportes.class));
	}
	
	public Empresa_transportesCriteria() throws PersistentException {
		this(MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession());
	}
	
	public Pedido_entregadoCriteria createEntregado_unCriteria() {
		return new Pedido_entregadoCriteria(createCriteria("ORM_entregado_un"));
	}
	
	public Pedido_enviadoCriteria createTiene_asignado_unCriteria() {
		return new Pedido_enviadoCriteria(createCriteria("ORM_tiene_asignado_un"));
	}
	
	public RespuestaCriteria createEscribe_unaCriteria() {
		return new RespuestaCriteria(createCriteria("ORM_escribe_una"));
	}
	
	public Empresa_transportes uniqueEmpresa_transportes() {
		return (Empresa_transportes) super.uniqueResult();
	}
	
	public Empresa_transportes[] listEmpresa_transportes() {
		java.util.List list = super.list();
		return (Empresa_transportes[]) list.toArray(new Empresa_transportes[list.size()]);
	}
}

