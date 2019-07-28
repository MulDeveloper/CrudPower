
package dev.muldev.crudpower.Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USUARIOS")
public class Usuario {
    @Id
    @Column(name="ID_USUARIO")
    private int id;
    @Column(name="NOMBRE_USUARIO")
    private String nombreUsuario;
    @Column(name="PASS_USUARIO")
    private String pass;

    public Usuario() {
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    
    
}
