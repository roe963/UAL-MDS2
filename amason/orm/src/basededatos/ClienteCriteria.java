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

public class ClienteCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression email;
	public final StringExpression password;
	public final StringExpression nombre;
	public final StringExpression metodoPago;
	public final StringExpression direccionEnvio;
	public final StringExpression fotoURL;
	public final BooleanExpression operativo;
	public final CollectionExpression realiza_un;
	public final CollectionExpression manda_un;
	public final CollectionExpression realiza_una;
	
	public ClienteCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		email = new StringExpression("email", this);
		password = new StringExpression("password", this);
		nombre = new StringExpression("nombre", this);
		metodoPago = new StringExpression("metodoPago", this);
		direccionEnvio = new StringExpression("direccionEnvio", this);
		fotoURL = new StringExpression("fotoURL", this);
		operativo = new BooleanExpression("operativo", this);
		realiza_un = new CollectionExpression("ORM_realiza_un", this);
		manda_un = new CollectionExpression("ORM_manda_un", this);
		realiza_una = new CollectionExpression("ORM_realiza_una", this);
	}
	
	public ClienteCriteria(PersistentSession session) {
		this(session.createCriteria(Cliente.class));
	}
	
	public ClienteCriteria() throws PersistentException {
		this(MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession());
	}
	
	public PedidoCriteria createRealiza_unCriteria() {
		return new PedidoCriteria(createCriteria("ORM_realiza_un"));
	}
	
	public MensajeCriteria createManda_unCriteria() {
		return new MensajeCriteria(createCriteria("ORM_manda_un"));
	}
	
	public ValoracionCriteria createRealiza_unaCriteria() {
		return new ValoracionCriteria(createCriteria("ORM_realiza_una"));
	}
	
	public Cliente uniqueCliente() {
		return (Cliente) super.uniqueResult();
	}
	
	public Cliente[] listCliente() {
		java.util.List list = super.list();
		return (Cliente[]) list.toArray(new Cliente[list.size()]);
	}
}

