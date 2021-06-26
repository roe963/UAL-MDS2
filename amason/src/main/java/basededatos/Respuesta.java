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
@Table(name="Respuesta")
public class Respuesta implements Serializable {
	public Respuesta() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_RESPUESTA_PERTENECE_A) {
			this.pertenece_a = (basededatos.Mensaje) owner;
		}
		
		else if (key == ORMConstants.KEY_RESPUESTA_ESCRITA_POR) {
			this.escrita_por = (basededatos.Usuario) owner;
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
	@GeneratedValue(generator="BASEDEDATOS_RESPUESTA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_RESPUESTA_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=basededatos.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKRespuesta179661"))	
	private basededatos.Usuario escrita_por;
	
	@ManyToOne(targetEntity=basededatos.Mensaje.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="MensajeId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKRespuesta357541"))	
	private basededatos.Mensaje pertenece_a;
	
	@Column(name="Orden", nullable=false, length=10)	
	private int orden;
	
	@Column(name="Contendio", nullable=true, length=255)	
	private String contendio;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setOrden(int value) {
		this.orden = value;
	}
	
	public int getOrden() {
		return orden;
	}
	
	public void setContendio(String value) {
		this.contendio = value;
	}
	
	public String getContendio() {
		return contendio;
	}
	
	public void setPertenece_a(basededatos.Mensaje value) {
		if (pertenece_a != null) {
			pertenece_a.contiene_un.remove(this);
		}
		if (value != null) {
			value.contiene_un.add(this);
		}
	}
	
	public basededatos.Mensaje getPertenece_a() {
		return pertenece_a;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Pertenece_a(basededatos.Mensaje value) {
		this.pertenece_a = value;
	}
	
	private basededatos.Mensaje getORM_Pertenece_a() {
		return pertenece_a;
	}
	
	public void setEscrita_por(basededatos.Usuario value) {
		if (escrita_por != null) {
			escrita_por.escribe_una.remove(this);
		}
		if (value != null) {
			value.escribe_una.add(this);
		}
	}
	
	public basededatos.Usuario getEscrita_por() {
		return escrita_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Escrita_por(basededatos.Usuario value) {
		this.escrita_por = value;
	}
	
	private basededatos.Usuario getORM_Escrita_por() {
		return escrita_por;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
