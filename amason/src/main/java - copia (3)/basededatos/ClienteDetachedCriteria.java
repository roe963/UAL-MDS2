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
import org.orm.criteria.AbstractORMDetachedCriteria;
import org.orm.criteria.BooleanExpression;
import org.orm.criteria.CollectionExpression;
import org.orm.criteria.IntegerExpression;
import org.orm.criteria.StringExpression;

public class ClienteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression email;
	public final StringExpression password;
	public final BooleanExpression activo;
	public final StringExpression nombre;
	public final StringExpression metodoPago;
	public final StringExpression direccionEnvio;
	public final StringExpression fotoURL;
	public final CollectionExpression realiza_un;
	public final CollectionExpression manda_un;
	public final CollectionExpression realiza_una;
	
	public ClienteDetachedCriteria() {
		super(basededatos.Cliente.class, basededatos.ClienteCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		activo = new BooleanExpression("activo", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		metodoPago = new StringExpression("metodoPago", this.getDetachedCriteria());
		direccionEnvio = new StringExpression("direccionEnvio", this.getDetachedCriteria());
		fotoURL = new StringExpression("fotoURL", this.getDetachedCriteria());
		realiza_un = new CollectionExpression("ORM_realiza_un", this.getDetachedCriteria());
		manda_un = new CollectionExpression("ORM_manda_un", this.getDetachedCriteria());
		realiza_una = new CollectionExpression("ORM_realiza_una", this.getDetachedCriteria());
	}
	
	public ClienteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.ClienteCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		activo = new BooleanExpression("activo", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		metodoPago = new StringExpression("metodoPago", this.getDetachedCriteria());
		direccionEnvio = new StringExpression("direccionEnvio", this.getDetachedCriteria());
		fotoURL = new StringExpression("fotoURL", this.getDetachedCriteria());
		realiza_un = new CollectionExpression("ORM_realiza_un", this.getDetachedCriteria());
		manda_un = new CollectionExpression("ORM_manda_un", this.getDetachedCriteria());
		realiza_una = new CollectionExpression("ORM_realiza_una", this.getDetachedCriteria());
	}
	
	public PedidoDetachedCriteria createRealiza_unCriteria() {
		return new PedidoDetachedCriteria(createCriteria("ORM_realiza_un"));
	}
	
	public MensajeDetachedCriteria createManda_unCriteria() {
		return new MensajeDetachedCriteria(createCriteria("ORM_manda_un"));
	}
	
	public ValoracionDetachedCriteria createRealiza_unaCriteria() {
		return new ValoracionDetachedCriteria(createCriteria("ORM_realiza_una"));
	}
	
	public Cliente uniqueCliente(PersistentSession session) {
		return (Cliente) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Cliente[] listCliente(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cliente[]) list.toArray(new Cliente[list.size()]);
	}
}

