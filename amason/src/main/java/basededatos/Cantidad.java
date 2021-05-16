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
@Table(name="Cantidad")
public class Cantidad implements Serializable {
	public Cantidad() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CANTIDAD_CONTENIDO_EN) {
			return ORM_contenido_en;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_CANTIDAD_CONTIENE_UN) {
			this.contiene_un = (basededatos.Producto) owner;
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
	@GeneratedValue(generator="BASEDEDATOS_CANTIDAD_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_CANTIDAD_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=basededatos.Producto.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ProductoId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKCantidad314050"))	
	private basededatos.Producto contiene_un;
	
	@Column(name="Cantidad", nullable=false, length=10)	
	private int cantidad;
	
	@ManyToMany(targetEntity=basededatos.Pedido.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Pedido_Cantidad", joinColumns={ @JoinColumn(name="CantidadId") }, inverseJoinColumns={ @JoinColumn(name="PedidoId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contenido_en = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setCantidad(int value) {
		this.cantidad = value;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	private void setORM_Contenido_en(java.util.Set value) {
		this.ORM_contenido_en = value;
	}
	
	private java.util.Set getORM_Contenido_en() {
		return ORM_contenido_en;
	}
	
	@Transient	
	public final basededatos.PedidoSetCollection contenido_en = new basededatos.PedidoSetCollection(this, _ormAdapter, ORMConstants.KEY_CANTIDAD_CONTENIDO_EN, ORMConstants.KEY_PEDIDO_CONTIENE_UN, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setContiene_un(basededatos.Producto value) {
		if (contiene_un != null) {
			contiene_un.tiene_una.remove(this);
		}
		if (value != null) {
			value.tiene_una.add(this);
		}
	}
	
	public basededatos.Producto getContiene_un() {
		return contiene_un;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Contiene_un(basededatos.Producto value) {
		this.contiene_un = value;
	}
	
	private basededatos.Producto getORM_Contiene_un() {
		return contiene_un;
	}
	
	public void verificar_compra() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
