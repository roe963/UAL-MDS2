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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Pedido")
@Inheritance(strategy=InheritanceType.JOINED)
public class Pedido implements Serializable {
	public Pedido() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PEDIDO_CONTIENE_UN) {
			return ORM_contiene_un;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PEDIDO_REALIZADO_POR) {
			this.realizado_por = (basededatos.Cliente) owner;
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
	@GeneratedValue(generator="BASEDEDATOS_PEDIDO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_PEDIDO_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=basededatos.Cliente.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ClienteUsuarioId", referencedColumnName="UsuarioId", nullable=false) }, foreignKey=@ForeignKey(name="FKPedido408520"))	
	private basededatos.Cliente realizado_por;
	
	@Column(name="Fecha", nullable=false, length=20)	
	private long fecha;
	
	@Column(name="Precio", nullable=false)	
	private float precio;
	
	@ManyToMany(mappedBy="ORM_contenido_en", targetEntity=basededatos.Cantidad.class)	
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
	
	public void setFecha(long value) {
		this.fecha = value;
	}
	
	public long getFecha() {
		return fecha;
	}
	
	public void setPrecio(float value) {
		this.precio = value;
	}
	
	public float getPrecio() {
		return precio;
	}
	
	public void setRealizado_por(basededatos.Cliente value) {
		if (realizado_por != null) {
			realizado_por.realiza_un.remove(this);
		}
		if (value != null) {
			value.realiza_un.add(this);
		}
	}
	
	public basededatos.Cliente getRealizado_por() {
		return realizado_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Realizado_por(basededatos.Cliente value) {
		this.realizado_por = value;
	}
	
	private basededatos.Cliente getORM_Realizado_por() {
		return realizado_por;
	}
	
	private void setORM_Contiene_un(java.util.Set value) {
		this.ORM_contiene_un = value;
	}
	
	private java.util.Set getORM_Contiene_un() {
		return ORM_contiene_un;
	}
	
	@Transient	
	public final basededatos.CantidadSetCollection contiene_un = new basededatos.CantidadSetCollection(this, _ormAdapter, ORMConstants.KEY_PEDIDO_CONTIENE_UN, ORMConstants.KEY_CANTIDAD_CONTENIDO_EN, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void comprobar_pedido(int idPedido) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public basededatos.Pedido[] cargar_pedidos() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public basededatos.Pedido detalle_pedido(int idPedido) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
