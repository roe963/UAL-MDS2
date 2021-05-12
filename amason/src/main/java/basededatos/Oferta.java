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
@Table(name="Oferta")
public class Oferta implements Serializable {
	public Oferta() {
	}
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_OFERTA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_OFERTA_ID_GENERATOR", strategy="native")	
	private int id;
	
	@Column(name="Fecha", nullable=false, length=20)	
	private long fecha;
	
	@Column(name="Precio", nullable=false)	
	private float precio;
	
	@OneToOne(mappedBy="pertenece_a", targetEntity=basededatos.Producto.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private basededatos.Producto contiene_un;
	
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
	
	public void setContiene_un(basededatos.Producto value) {
		if (this.contiene_un != value) {
			basededatos.Producto lcontiene_un = this.contiene_un;
			this.contiene_un = value;
			if (value != null) {
				contiene_un.setPertenece_a(this);
			}
			if (lcontiene_un != null && lcontiene_un.getPertenece_a() == this) {
				lcontiene_un.setPertenece_a(null);
			}
		}
	}
	
	public basededatos.Producto getContiene_un() {
		return contiene_un;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
