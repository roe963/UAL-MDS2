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

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.flow.component.UI;

import ual.mds2.ortegaortega.MenuHeader;
import ual.mds2.ortegaortega.Session;
import ual.mds2.ortegaortega.TIPOUSUARIO;

@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Usuario")
@Inheritance(strategy=InheritanceType.JOINED)
public class Usuario implements Serializable {
	public Usuario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_USUARIO_ESCRIBE_UNA) {
			return ORM_escribe_una;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_USUARIO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_USUARIO_ID_GENERATOR", strategy="native")	
	private int id;
	
	@Column(name="Email", nullable=true, length=255)	
	private String email;
	
	@Column(name="Password", nullable=true, length=255)	
	private String password;
	
	@Column(name="Activo", nullable=false, length=1)	
	private boolean activo;
	
	@OneToMany(mappedBy="escrita_por", targetEntity=basededatos.Respuesta.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_escribe_una = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setActivo(boolean value) {
		this.activo = value;
	}
	
	public boolean getActivo() {
		return activo;
	}
	
	private void setORM_Escribe_una(java.util.Set value) {
		this.ORM_escribe_una = value;
	}
	
	private java.util.Set getORM_Escribe_una() {
		return ORM_escribe_una;
	}
	
	@Transient	
	public final basededatos.RespuestaSetCollection escribe_una = new basededatos.RespuestaSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_ESCRIBE_UNA, ORMConstants.KEY_RESPUESTA_ESCRITA_POR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public basededatos.Usuario iniciar_sesion(String mailUsuario, String passwordUsuario) {
		
        Usuario[] usuarios = null;
        PersistentTransaction t;
        try {
            t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
            try {
                usuarios = UsuarioDAO
                        .listUsuarioByQuery("Password='" + passwordUsuario + "' and Email='" + mailUsuario + "' and Activo=1", null);
                t.commit();
            } catch (Exception e) {
                t.rollback();
            }
        } catch (PersistentException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        if (usuarios.length > 0) {
            Session.setUsuario(usuarios[0]);
            Usuario aux = new basededatos.Clientes().iniciar_sesion_cliente(usuarios[0].id);
            if (aux != null) {
//                ViewChanger.usuario = ViewChanger.TIPOUSUARIO.REGISTRADO;
                Session.setTipo(TIPOUSUARIO.REGISTRADO);
//                ViewChanger.SaveSession(aux.getId());
//                ViewChanger.CambiarVista(new Cliente());
                MenuHeader.generarMenuBar();
                UI.getCurrent().navigate("cliente");
                return aux;
            } else {
                aux = new basededatos.Administradores().iniciar_sesion_administrador(usuarios[0].id);
                if (aux != null) {
//                    ViewChanger.usuario = ViewChanger.TIPOUSUARIO.ADMIN;
                    Session.setTipo(TIPOUSUARIO.ADMIN);
//                    ViewChanger.SaveSession(aux.getId());
//                    ViewChanger.CambiarVista(new Administrador());
                    MenuHeader.generarMenuBar();
                    UI.getCurrent().navigate("administrador");
                    return aux;
                } else {
                    aux = new basededatos.Encargados_compras().iniciar_sesion_encargado_compras(usuarios[0].id);
                    if (aux != null) {
//                        ViewChanger.usuario = ViewChanger.TIPOUSUARIO.ENCARGADO;
                        Session.setTipo(TIPOUSUARIO.ENCARGADO);
//                        ViewChanger.SaveSession(aux.getId());
//                        ViewChanger.CambiarVista(new Encargado_compras());
                        MenuHeader.generarMenuBar();
                        UI.getCurrent().navigate("encargadocompras");
                        return aux;
                    } else {
                        aux = new basededatos.Empresas_transportes().iniciar_sesion_empresa_transportes(usuarios[0].id);
                        if (aux != null) {
//                            ViewChanger.usuario = ViewChanger.TIPOUSUARIO.TRANSPORTES;
                            Session.setTipo(TIPOUSUARIO.TRANSPORTES);
//                            ViewChanger.SaveSession(aux.getId());
//                            ViewChanger.CambiarVista(new Empresa_transportes());
                            MenuHeader.generarMenuBar();
                            UI.getCurrent().navigate("empresatransportes");
                            return aux;
                        } else {
                            return usuarios[0];
                        }
                    }
                }
            }
        } else {
            return null;
        }
	}
	
	public boolean recuperar_contrasena(String mailUsuario) {
        Usuario[] usuarios = null;
	    PersistentTransaction t;
        try {
            t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
            try {
                usuarios = UsuarioDAO
                        .listUsuarioByQuery("Email='" + mailUsuario + "'", null);
                if (usuarios.length > 0) return true;
                t.commit();
            } catch (Exception e) {
                t.rollback();
            }
        } catch (PersistentException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        return false;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
