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
@Table(name="Valoracion")
public class Valoracion implements Serializable {
	public Valoracion() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_VALORACION_VALORA_UN) {
			this.valora_un = (basededatos.Producto) owner;
		}
		
		else if (key == ORMConstants.KEY_VALORACION_ESCRITO_POR) {
			this.escrito_por = (basededatos.Cliente) owner;
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
	@GeneratedValue(generator="BASEDEDATOS_VALORACION_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_VALORACION_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=basededatos.Cliente.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ClienteUsuarioId", referencedColumnName="UsuarioId", nullable=false) }, foreignKey=@ForeignKey(name="FKValoracion994559"))	
	private basededatos.Cliente escrito_por;
	
	@ManyToOne(targetEntity=basededatos.Producto.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ProductoId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKValoracion666204"))	
	private basededatos.Producto valora_un;
	
	@Column(name="Puntuacion", nullable=false, length=10)	
	private int puntuacion;
	
	@Column(name="Comentario", nullable=true, length=255)	
	private String comentario;
	
	@Column(name="Fecha", nullable=true, length=20)	
	private long fecha;
	
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
	
	public void setFecha(long value) {
		this.fecha = value;
	}
	
	public long getFecha() {
		return fecha;
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
	
	public void setEscrito_por(basededatos.Cliente value) {
		if (escrito_por != null) {
			escrito_por.realiza_una.remove(this);
		}
		if (value != null) {
			value.realiza_una.add(this);
		}
	}
	
	public basededatos.Cliente getEscrito_por() {
		return escrito_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Escrito_por(basededatos.Cliente value) {
		this.escrito_por = value;
	}
	
	private basededatos.Cliente getORM_Escrito_por() {
		return escrito_por;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
