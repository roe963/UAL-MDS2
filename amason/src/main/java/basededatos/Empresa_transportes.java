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

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Empresa_transportes")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="UsuarioId", referencedColumnName="Id")
public class Empresa_transportes extends basededatos.Usuario implements Serializable {
	public Empresa_transportes() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_EMPRESA_TRANSPORTES_TIENE_ASIGNADO_UN) {
			return ORM_tiene_asignado_un;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@OneToMany(mappedBy="asignado_a", targetEntity=basededatos.Pedido_enviado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tiene_asignado_un = new java.util.HashSet();
	
	private void setORM_Tiene_asignado_un(java.util.Set value) {
		this.ORM_tiene_asignado_un = value;
	}
	
	private java.util.Set getORM_Tiene_asignado_un() {
		return ORM_tiene_asignado_un;
	}
	
	@Transient	
	public final basededatos.Pedido_enviadoSetCollection tiene_asignado_un = new basededatos.Pedido_enviadoSetCollection(this, _ormAdapter, ORMConstants.KEY_EMPRESA_TRANSPORTES_TIENE_ASIGNADO_UN, ORMConstants.KEY_PEDIDO_ENVIADO_ASIGNADO_A, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
