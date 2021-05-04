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
@Table(name="Pedido_enviado")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="PedidoId", referencedColumnName="Id")
public class Pedido_enviado extends basededatos.Pedido implements Serializable {
	public Pedido_enviado() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PEDIDO_ENVIADO_ASIGNADO_A) {
			this.asignado_a = (basededatos.Empresa_transportes) owner;
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
	@JoinColumns(value={ @JoinColumn(name="Empresa_transportesUsuarioId", referencedColumnName="UsuarioId", nullable=false) }, foreignKey=@ForeignKey(name="FKPedido_env653876"))	
	private basededatos.Empresa_transportes asignado_a;
	
	public void setAsignado_a(basededatos.Empresa_transportes value) {
		if (asignado_a != null) {
			asignado_a.tiene_asignado_un.remove(this);
		}
		if (value != null) {
			value.tiene_asignado_un.add(this);
		}
	}
	
	public basededatos.Empresa_transportes getAsignado_a() {
		return asignado_a;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Asignado_a(basededatos.Empresa_transportes value) {
		this.asignado_a = value;
	}
	
	private basededatos.Empresa_transportes getORM_Asignado_a() {
		return asignado_a;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
