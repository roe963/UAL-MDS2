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

public class OfertaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final LongExpression fecha;
	public final FloatExpression precio;
	public final IntegerExpression contiene_unId;
	public final AssociationExpression contiene_un;
	
	public OfertaDetachedCriteria() {
		super(basededatos.Oferta.class, basededatos.OfertaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		fecha = new LongExpression("fecha", this.getDetachedCriteria());
		precio = new FloatExpression("precio", this.getDetachedCriteria());
		contiene_unId = new IntegerExpression("contiene_un.id", this.getDetachedCriteria());
		contiene_un = new AssociationExpression("contiene_un", this.getDetachedCriteria());
	}
	
	public OfertaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.OfertaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		fecha = new LongExpression("fecha", this.getDetachedCriteria());
		precio = new FloatExpression("precio", this.getDetachedCriteria());
		contiene_unId = new IntegerExpression("contiene_un.id", this.getDetachedCriteria());
		contiene_un = new AssociationExpression("contiene_un", this.getDetachedCriteria());
	}
	
	public ProductoDetachedCriteria createContiene_unCriteria() {
		return new ProductoDetachedCriteria(createCriteria("contiene_un"));
	}
	
	public Oferta uniqueOferta(PersistentSession session) {
		return (Oferta) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Oferta[] listOferta(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Oferta[]) list.toArray(new Oferta[list.size()]);
	}
}

