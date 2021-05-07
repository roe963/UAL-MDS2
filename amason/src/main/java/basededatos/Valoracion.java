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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Valoracion")
public class Valoracion implements Serializable {
	public Valoracion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_VALORACION_ESCRITO_POR) {
			return ORM_escrito_por;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_VALORACION_VALORA_UN) {
			this.valora_un = (basededatos.Producto) owner;
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
	@GeneratedValue(generator="BASEDEDATOS_VALORACION_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_VALORACION_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=basededatos.Producto.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ProductoId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKValoracion666204"))	
	private basededatos.Producto valora_un;
	
	@Column(name="Puntuacion", nullable=false, length=10)	
	private int puntuacion;
	
	@Column(name="Comentario", nullable=true, length=255)	
	private String comentario;
	
	@ManyToMany(mappedBy="ORM_realiza_una", targetEntity=basededatos.Cliente.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_escrito_por = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setPuntuacion(int value) {
		this.puntuacion = value;
	}
	
	public int getPuntuacion() {
		return puntuacion;
	}
	
	public void setComentario(String value) {
		this.comentario = value;
	}
	
	public String getComentario() {
		return comentario;
	}
	
	public void setValora_un(basededatos.Producto value) {
		if (valora_un != null) {
			valora_un.recibe_una.remove(this);
		}
		if (value != null) {
			value.recibe_una.add(this);
		}
	}
	
	public basededatos.Producto getValora_un() {
		return valora_un;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Valora_un(basededatos.Producto value) {
		this.valora_un = value;
	}
	
	private basededatos.Producto getORM_Valora_un() {
		return valora_un;
	}
	
	private void setORM_Escrito_por(java.util.Set value) {
		this.ORM_escrito_por = value;
	}
	
	private java.util.Set getORM_Escrito_por() {
		return ORM_escrito_por;
	}
	
	@Transient	
	public final basededatos.ClienteSetCollection escrito_por = new basededatos.ClienteSetCollection(this, _ormAdapter, ORMConstants.KEY_VALORACION_ESCRITO_POR, ORMConstants.KEY_CLIENTE_REALIZA_UNA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
