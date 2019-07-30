
package dev.muldev.crudpower.Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="JUECES")
public class Juez {
    @Id
    @Column(name="ID_JUEZ")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Column(name="NOMBRE_JUEZ")
    private String nombreApellidos;
    @Column(name="COMUNIDAD_JUEZ")
    private String comunidad;

    public Juez() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }    

    public String getComunidad() {
        return comunidad;
    }

    public void setComunidad(String comunidad) {
        this.comunidad = comunidad;
    }
    
    
    
}
