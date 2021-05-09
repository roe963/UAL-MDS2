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
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

@Entity
@org.hibernate.annotations.Proxy(lazy = false)
@Table(name = "Usuario")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario implements Serializable {
    public Usuario() {
    }

    @Column(name = "Id", nullable = false, length = 10)
    @Id
    @GeneratedValue(generator = "BASEDEDATOS_USUARIO_ID_GENERATOR")
    @org.hibernate.annotations.GenericGenerator(name = "BASEDEDATOS_USUARIO_ID_GENERATOR", strategy = "native")
    private int id;

    @Column(name = "Email", nullable = true, length = 255)
    private String email;

    @Column(name = "Password", nullable = true, length = 255)
    private String password;

    @Column(name = "Activo", nullable = false, length = 1)
    private boolean activo;

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

    public basededatos.Usuario iniciar_sesion(String mailUsuario, String passwordUsuario) {
        Usuario[] Usuarios = null;
        PersistentTransaction t;
        try {
            t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
            try {
                Usuarios = UsuarioDAO.listUsuarioByQuery("Password='" + passwordUsuario + "' and Email='" + mailUsuario + "'",
                        null);
                t.commit();
            } catch (Exception e) {
                t.rollback();
            }
        } catch (PersistentException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        return Usuarios[0];
    }

    public boolean recuperar_contrasena(String mailUsuario) {
        // TODO: Implement Method
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return String.valueOf(getId());
    }

}
