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
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_CANTIDAD_CONTENIDO_EN) {
			this.contenido_en = (basededatos.Pedido) owner;
		}
		
		else if (key == ORMConstants.KEY_CANTIDAD_CONTIENE_UN) {
			this.contiene_un = (basededatos.Producto) owner;
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
	@GeneratedValue(generator="BASEDEDATOS_CANTIDAD_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_CANTIDAD_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=basededatos.Producto.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ProductoId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKCantidad314050"))	
	private basededatos.Producto contiene_un;
	
	@ManyToOne(targetEntity=basededatos.Pedido.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="PedidoId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKCantidad556731"))	
	private basededatos.Pedido contenido_en;
	
	@Column(name="Cantidad", nullable=false, length=10)	
	private int cantidad;
	
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
	
	public void setContenido_en(basededatos.Pedido value) {
		if (contenido_en != null) {
			contenido_en.contiene_un.remove(this);
		}
		if (value != null) {
			value.contiene_un.add(this);
		}
	}
	
	public basededatos.Pedido getContenido_en() {
		return contenido_en;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Contenido_en(basededatos.Pedido value) {
		this.contenido_en = value;
	}
	
	private basededatos.Pedido getORM_Contenido_en() {
		return contenido_en;
	}
	
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
