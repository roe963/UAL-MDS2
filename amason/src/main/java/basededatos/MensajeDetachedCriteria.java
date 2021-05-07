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
import org.orm.criteria.AssociationExpression;
import org.orm.criteria.CollectionExpression;
import org.orm.criteria.IntegerExpression;

public class MensajeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression escrito_porId;
	public final AssociationExpression escrito_por;
	public final CollectionExpression contiene_un;
	
	public MensajeDetachedCriteria() {
		super(basededatos.Mensaje.class, basededatos.MensajeCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		escrito_porId = new IntegerExpression("escrito_por.", this.getDetachedCriteria());
		escrito_por = new AssociationExpression("escrito_por", this.getDetachedCriteria());
		contiene_un = new CollectionExpression("ORM_contiene_un", this.getDetachedCriteria());
	}
	
	public MensajeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.MensajeCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		escrito_porId = new IntegerExpression("escrito_por.", this.getDetachedCriteria());
		escrito_por = new AssociationExpression("escrito_por", this.getDetachedCriteria());
		contiene_un = new CollectionExpression("ORM_contiene_un", this.getDetachedCriteria());
	}
	
	public ClienteDetachedCriteria createEscrito_porCriteria() {
		return new ClienteDetachedCriteria(createCriteria("escrito_por"));
	}
	
	public RespuestaDetachedCriteria createContiene_unCriteria() {
		return new RespuestaDetachedCriteria(createCriteria("ORM_contiene_un"));
	}
	
	public Mensaje uniqueMensaje(PersistentSession session) {
		return (Mensaje) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Mensaje[] listMensaje(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Mensaje[]) list.toArray(new Mensaje[list.size()]);
	}
}

