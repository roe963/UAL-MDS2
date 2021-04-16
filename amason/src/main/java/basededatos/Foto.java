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
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Foto")
public class Foto implements Serializable {
	public Foto() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_FOTO_PERTENECE_A) {
			this.pertenece_a = (basededatos.Producto) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_FOTO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_FOTO_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=basededatos.Producto.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ProductoId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKFoto399859"))	
	private basededatos.Producto pertenece_a;
	
	@Column(name="Url", nullable=true, length=255)	
	private String url;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setUrl(String value) {
		this.url = value;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setPertenece_a(basededatos.Producto value) {
		if (pertenece_a != null) {
			pertenece_a.contiene_una.remove(this);
		}
		if (value != null) {
			value.contiene_una.add(this);
		}
	}
	
	public basededatos.Producto getPertenece_a() {
		return pertenece_a;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Pertenece_a(basededatos.Producto value) {
		this.pertenece_a = value;
	}
	
	private basededatos.Producto getORM_Pertenece_a() {
		return pertenece_a;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
