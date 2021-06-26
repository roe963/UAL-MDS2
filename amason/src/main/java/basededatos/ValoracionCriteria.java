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

public class ValoracionCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression escrito_porId;
	public final AssociationExpression escrito_por;
	public final IntegerExpression valora_unId;
	public final AssociationExpression valora_un;
	public final IntegerExpression puntuacion;
	public final StringExpression comentario;
	public final LongExpression fecha;
	
	public ValoracionCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		escrito_porId = new IntegerExpression("escrito_por.", this);
		escrito_por = new AssociationExpression("escrito_por", this);
		valora_unId = new IntegerExpression("valora_un.id", this);
		valora_un = new AssociationExpression("valora_un", this);
		puntuacion = new IntegerExpression("puntuacion", this);
		comentario = new StringExpression("comentario", this);
		fecha = new LongExpression("fecha", this);
	}
	
	public ValoracionCriteria(PersistentSession session) {
		this(session.createCriteria(Valoracion.class));
	}
	
	public ValoracionCriteria() throws PersistentException {
		this(MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession());
	}
	
	public ClienteCriteria createEscrito_porCriteria() {
		return new ClienteCriteria(createCriteria("escrito_por"));
	}
	
	public ProductoCriteria createValora_unCriteria() {
		return new ProductoCriteria(createCriteria("valora_un"));
	}
	
	public Valoracion uniqueValoracion() {
		return (Valoracion) super.uniqueResult();
	}
	
	public Valoracion[] listValoracion() {
		java.util.List list = super.list();
		return (Valoracion[]) list.toArray(new Valoracion[list.size()]);
	}
}

