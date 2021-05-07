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

public class RespuestaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression pertenece_aId;
	public final AssociationExpression pertenece_a;
	public final IntegerExpression orden;
	public final StringExpression contendio;
	
	public RespuestaDetachedCriteria() {
		super(basededatos.Respuesta.class, basededatos.RespuestaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		pertenece_aId = new IntegerExpression("pertenece_a.id", this.getDetachedCriteria());
		pertenece_a = new AssociationExpression("pertenece_a", this.getDetachedCriteria());
		orden = new IntegerExpression("orden", this.getDetachedCriteria());
		contendio = new StringExpression("contendio", this.getDetachedCriteria());
	}
	
	public RespuestaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.RespuestaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		pertenece_aId = new IntegerExpression("pertenece_a.id", this.getDetachedCriteria());
		pertenece_a = new AssociationExpression("pertenece_a", this.getDetachedCriteria());
		orden = new IntegerExpression("orden", this.getDetachedCriteria());
		contendio = new StringExpression("contendio", this.getDetachedCriteria());
	}
	
	public MensajeDetachedCriteria createPertenece_aCriteria() {
		return new MensajeDetachedCriteria(createCriteria("pertenece_a"));
	}
	
	public Respuesta uniqueRespuesta(PersistentSession session) {
		return (Respuesta) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Respuesta[] listRespuesta(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Respuesta[]) list.toArray(new Respuesta[list.size()]);
	}
}

