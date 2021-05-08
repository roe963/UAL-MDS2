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

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Mensaje")
public class Mensaje implements Serializable {
	public Mensaje() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_MENSAJE_CONTIENE_UN) {
			return ORM_contiene_un;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_MENSAJE_ESCRITO_POR) {
			this.escrito_por = (basededatos.Cliente) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_MENSAJE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_MENSAJE_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=basededatos.Cliente.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ClienteUsuarioId", referencedColumnName="UsuarioId", nullable=false) }, foreignKey=@ForeignKey(name="FKMensaje292928"))	
	private basededatos.Cliente escrito_por;
	
	@OneToMany(mappedBy="pertenece_a", targetEntity=basededatos.Respuesta.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contiene_un = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	private void setORM_Contiene_un(java.util.Set value) {
		this.ORM_contiene_un = value;
	}
	
	private java.util.Set getORM_Contiene_un() {
		return ORM_contiene_un;
	}
	
	@Transient	
	public final basededatos.RespuestaSetCollection contiene_un = new basededatos.RespuestaSetCollection(this, _ormAdapter, ORMConstants.KEY_MENSAJE_CONTIENE_UN, ORMConstants.KEY_RESPUESTA_PERTENECE_A, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setEscrito_por(basededatos.Cliente value) {
		if (escrito_por != null) {
			escrito_por.manda_un.remove(this);
		}
		if (value != null) {
			value.manda_un.add(this);
		}
	}
	
	public basededatos.Cliente getEscrito_por() {
		return escrito_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Escrito_por(basededatos.Cliente value) {
		this.escrito_por = value;
	}
	
	private basededatos.Cliente getORM_Escrito_por() {
		return escrito_por;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
