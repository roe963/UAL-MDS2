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
@Table(name="Pedido_entregado")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="PedidoId", referencedColumnName="Id")
public class Pedido_entregado extends basededatos.Pedido implements Serializable {
	public Pedido_entregado() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PEDIDO_ENTREGADO_ENTREGADO_POR) {
			this.entregado_por = (basededatos.Empresa_transportes) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@ManyToOne(targetEntity=basededatos.Empresa_transportes.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="Empresa_transportesUsuarioId", referencedColumnName="UsuarioId", nullable=false) }, foreignKey=@ForeignKey(name="FKPedido_ent545421"))	
	private basededatos.Empresa_transportes entregado_por;
	
	public void setEntregado_por(basededatos.Empresa_transportes value) {
		if (entregado_por != null) {
			entregado_por.entregado_un.remove(this);
		}
		if (value != null) {
			value.entregado_un.add(this);
		}
	}
	
	public basededatos.Empresa_transportes getEntregado_por() {
		return entregado_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Entregado_por(basededatos.Empresa_transportes value) {
		this.entregado_por = value;
	}
	
	private basededatos.Empresa_transportes getORM_Entregado_por() {
		return entregado_por;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
