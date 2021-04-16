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
@Table(name="Encargado_compras")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="UsuarioId", referencedColumnName="Id")
public class Encargado_compras extends basededatos.Usuario implements Serializable {
	public Encargado_compras() {
	}
	
	public void agregar_usuario(String nombreUsuarioEncargadoCompras, String passwordUsuarioEncargadoCompras) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public interfaz.Encargado_compras cargar_empleados_encargado_compras() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void modificar_usuario_encargado_compras(String nombreUsuarioEncargadoCompras, String passwordUsuarioEncargadoCompras) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return super.toString();
	}
	
}
