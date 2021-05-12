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
@Table(name="Producto")
public class Producto implements Serializable {
	public Producto() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PRODUCTO_RECIBE_UNA) {
			return ORM_recibe_una;
		}
		else if (key == ORMConstants.KEY_PRODUCTO_CONTIENE_UNA) {
			return ORM_contiene_una;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PRODUCTO_ASIGNADO_A) {
			this.asignado_a = (basededatos.Categoria) owner;
		}
		
		else if (key == ORMConstants.KEY_PRODUCTO_PERTENECE_A) {
			this.pertenece_a = (basededatos.Oferta) owner;
		}
		
		else if (key == ORMConstants.KEY_PRODUCTO_TIENE_UNA) {
			this.tiene_una = (basededatos.Cantidad) owner;
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
	@GeneratedValue(generator="BASEDEDATOS_PRODUCTO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_PRODUCTO_ID_GENERATOR", strategy="native")	
	private int id;
	
	@OneToOne(targetEntity=basededatos.Oferta.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="OfertaId", referencedColumnName="Id") }, foreignKey=@ForeignKey(name="FKProducto445011"))	
	private basededatos.Oferta pertenece_a;
	
	@ManyToOne(targetEntity=basededatos.Categoria.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="CategoriaId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKProducto904800"))	
	private basededatos.Categoria asignado_a;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Precio", nullable=false)	
	private float precio;
	
	@Column(name="Activo", nullable=false, length=1)	
	private boolean activo;
	
	@Column(name="Descripcion", nullable=true, length=255)	
	private String descripcion;
	
	@OneToMany(mappedBy="valora_un", targetEntity=basededatos.Valoracion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_recibe_una = new java.util.HashSet();
	
	@OneToMany(mappedBy="pertenece_a", targetEntity=basededatos.Foto.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contiene_una = new java.util.HashSet();
	
	@OneToOne(mappedBy="contiene_un", targetEntity=basededatos.Cantidad.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private basededatos.Cantidad tiene_una;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setPrecio(float value) {
		this.precio = value;
	}
	
	public float getPrecio() {
		return precio;
	}
	
	public void setActivo(boolean value) {
		this.activo = value;
	}
	
	public boolean getActivo() {
		return activo;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setAsignado_a(basededatos.Categoria value) {
		if (asignado_a != null) {
			asignado_a.contiene_un.remove(this);
		}
		if (value != null) {
			value.contiene_un.add(this);
		}
	}
	
	public basededatos.Categoria getAsignado_a() {
		return asignado_a;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Asignado_a(basededatos.Categoria value) {
		this.asignado_a = value;
	}
	
	private basededatos.Categoria getORM_Asignado_a() {
		return asignado_a;
	}
	
	public void setPertenece_a(basededatos.Oferta value) {
		if (this.pertenece_a != value) {
			basededatos.Oferta lpertenece_a = this.pertenece_a;
			this.pertenece_a = value;
			if (value != null) {
				pertenece_a.setContiene_un(this);
			}
			if (lpertenece_a != null && lpertenece_a.getContiene_un() == this) {
				lpertenece_a.setContiene_un(null);
			}
		}
	}
	
	public basededatos.Oferta getPertenece_a() {
		return pertenece_a;
	}
	
	private void setORM_Recibe_una(java.util.Set value) {
		this.ORM_recibe_una = value;
	}
	
	private java.util.Set getORM_Recibe_una() {
		return ORM_recibe_una;
	}
	
	@Transient	
	public final basededatos.ValoracionSetCollection recibe_una = new basededatos.ValoracionSetCollection(this, _ormAdapter, ORMConstants.KEY_PRODUCTO_RECIBE_UNA, ORMConstants.KEY_VALORACION_VALORA_UN, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Contiene_una(java.util.Set value) {
		this.ORM_contiene_una = value;
	}
	
	private java.util.Set getORM_Contiene_una() {
		return ORM_contiene_una;
	}
	
	@Transient	
	public final basededatos.FotoSetCollection contiene_una = new basededatos.FotoSetCollection(this, _ormAdapter, ORMConstants.KEY_PRODUCTO_CONTIENE_UNA, ORMConstants.KEY_FOTO_PERTENECE_A, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setTiene_una(basededatos.Cantidad value) {
		if (this.tiene_una != value) {
			basededatos.Cantidad ltiene_una = this.tiene_una;
			this.tiene_una = value;
			if (value != null) {
				tiene_una.setContiene_un(this);
			}
			if (ltiene_una != null && ltiene_una.getContiene_un() == this) {
				ltiene_una.setContiene_un(null);
			}
		}
	}
	
	public basededatos.Cantidad getTiene_una() {
		return tiene_una;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
