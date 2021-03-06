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

public class ValoracionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression escrito_porId;
	public final AssociationExpression escrito_por;
	public final IntegerExpression valora_unId;
	public final AssociationExpression valora_un;
	public final IntegerExpression puntuacion;
	public final StringExpression comentario;
	public final LongExpression fecha;
	
	public ValoracionDetachedCriteria() {
		super(basededatos.Valoracion.class, basededatos.ValoracionCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		escrito_porId = new IntegerExpression("escrito_por.", this.getDetachedCriteria());
		escrito_por = new AssociationExpression("escrito_por", this.getDetachedCriteria());
		valora_unId = new IntegerExpression("valora_un.id", this.getDetachedCriteria());
		valora_un = new AssociationExpression("valora_un", this.getDetachedCriteria());
		puntuacion = new IntegerExpression("puntuacion", this.getDetachedCriteria());
		comentario = new StringExpression("comentario", this.getDetachedCriteria());
		fecha = new LongExpression("fecha", this.getDetachedCriteria());
	}
	
	public ValoracionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.ValoracionCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		escrito_porId = new IntegerExpression("escrito_por.", this.getDetachedCriteria());
		escrito_por = new AssociationExpression("escrito_por", this.getDetachedCriteria());
		valora_unId = new IntegerExpression("valora_un.id", this.getDetachedCriteria());
		valora_un = new AssociationExpression("valora_un", this.getDetachedCriteria());
		puntuacion = new IntegerExpression("puntuacion", this.getDetachedCriteria());
		comentario = new StringExpression("comentario", this.getDetachedCriteria());
		fecha = new LongExpression("fecha", this.getDetachedCriteria());
	}
	
	public ClienteDetachedCriteria createEscrito_porCriteria() {
		return new ClienteDetachedCriteria(createCriteria("escrito_por"));
	}
	
	public ProductoDetachedCriteria createValora_unCriteria() {
		return new ProductoDetachedCriteria(createCriteria("valora_un"));
	}
	
	public Valoracion uniqueValoracion(PersistentSession session) {
		return (Valoracion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Valoracion[] listValoracion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Valoracion[]) list.toArray(new Valoracion[list.size()]);
	}
}

