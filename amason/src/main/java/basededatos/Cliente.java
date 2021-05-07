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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Cliente")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="UsuarioId", referencedColumnName="Id")
public class Cliente extends basededatos.Usuario implements Serializable {
	public Cliente() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CLIENTE_REALIZA_UN) {
			return ORM_realiza_un;
		}
		else if (key == ORMConstants.KEY_CLIENTE_MANDA_UN) {
			return ORM_manda_un;
		}
		else if (key == ORMConstants.KEY_CLIENTE_REALIZA_UNA) {
			return ORM_realiza_una;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="MetodoPago", nullable=true, length=255)	
	private String metodoPago;
	
	@Column(name="DireccionEnvio", nullable=true, length=255)	
	private String direccionEnvio;
	
	@Column(name="FotoURL", nullable=true, length=255)	
	private String fotoURL;
	
	@OneToMany(mappedBy="realizado_por", targetEntity=basededatos.Pedido.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_realiza_un = new java.util.HashSet();
	
	@OneToMany(mappedBy="escrito_por", targetEntity=basededatos.Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_manda_un = new java.util.HashSet();
	
	@ManyToMany(targetEntity=basededatos.Valoracion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Valoracion_Cliente", joinColumns={ @JoinColumn(name="ClienteUsuarioId") }, inverseJoinColumns={ @JoinColumn(name="ValoracionId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_realiza_una = new java.util.HashSet();
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setMetodoPago(String value) {
		this.metodoPago = value;
	}
	
	public String getMetodoPago() {
		return metodoPago;
	}
	
	public void setDireccionEnvio(String value) {
		this.direccionEnvio = value;
	}
	
	public String getDireccionEnvio() {
		return direccionEnvio;
	}
	
	public void setFotoURL(String value) {
		this.fotoURL = value;
	}
	
	public String getFotoURL() {
		return fotoURL;
	}
	
	private void setORM_Realiza_un(java.util.Set value) {
		this.ORM_realiza_un = value;
	}
	
	private java.util.Set getORM_Realiza_un() {
		return ORM_realiza_un;
	}
	
	@Transient	
	public final basededatos.PedidoSetCollection realiza_un = new basededatos.PedidoSetCollection(this, _ormAdapter, ORMConstants.KEY_CLIENTE_REALIZA_UN, ORMConstants.KEY_PEDIDO_REALIZADO_POR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Manda_un(java.util.Set value) {
		this.ORM_manda_un = value;
	}
	
	private java.util.Set getORM_Manda_un() {
		return ORM_manda_un;
	}
	
	@Transient	
	public final basededatos.MensajeSetCollection manda_un = new basededatos.MensajeSetCollection(this, _ormAdapter, ORMConstants.KEY_CLIENTE_MANDA_UN, ORMConstants.KEY_MENSAJE_ESCRITO_POR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Realiza_una(java.util.Set value) {
		this.ORM_realiza_una = value;
	}
	
	private java.util.Set getORM_Realiza_una() {
		return ORM_realiza_una;
	}
	
	@Transient	
	public final basededatos.ValoracionSetCollection realiza_una = new basededatos.ValoracionSetCollection(this, _ormAdapter, ORMConstants.KEY_CLIENTE_REALIZA_UNA, ORMConstants.KEY_VALORACION_ESCRITO_POR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
