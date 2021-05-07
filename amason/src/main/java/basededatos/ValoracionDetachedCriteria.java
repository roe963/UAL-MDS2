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
import org.orm.criteria.StringExpression;

public class ValoracionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression valora_unId;
	public final AssociationExpression valora_un;
	public final IntegerExpression puntuacion;
	public final StringExpression comentario;
	public final CollectionExpression escrito_por;
	
	public ValoracionDetachedCriteria() {
		super(basededatos.Valoracion.class, basededatos.ValoracionCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		valora_unId = new IntegerExpression("valora_un.id", this.getDetachedCriteria());
		valora_un = new AssociationExpression("valora_un", this.getDetachedCriteria());
		puntuacion = new IntegerExpression("puntuacion", this.getDetachedCriteria());
		comentario = new StringExpression("comentario", this.getDetachedCriteria());
		escrito_por = new CollectionExpression("ORM_escrito_por", this.getDetachedCriteria());
	}
	
	public ValoracionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.ValoracionCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		valora_unId = new IntegerExpression("valora_un.id", this.getDetachedCriteria());
		valora_un = new AssociationExpression("valora_un", this.getDetachedCriteria());
		puntuacion = new IntegerExpression("puntuacion", this.getDetachedCriteria());
		comentario = new StringExpression("comentario", this.getDetachedCriteria());
		escrito_por = new CollectionExpression("ORM_escrito_por", this.getDetachedCriteria());
	}
	
	public ProductoDetachedCriteria createValora_unCriteria() {
		return new ProductoDetachedCriteria(createCriteria("valora_un"));
	}
	
	public ClienteDetachedCriteria createEscrito_porCriteria() {
		return new ClienteDetachedCriteria(createCriteria("ORM_escrito_por"));
	}
	
	public Valoracion uniqueValoracion(PersistentSession session) {
		return (Valoracion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Valoracion[] listValoracion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Valoracion[]) list.toArray(new Valoracion[list.size()]);
	}
}

