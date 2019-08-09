
package dev.muldev.crudpower.Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="JUECES")
public class Juez {
    @Id
    @Column(name="ID_JUEZ")
    @GenericGenerator(name="idValor" , strategy="increment")
    @GeneratedValue(generator="idValor")
    private int id;
    @Column(name="NOMBRE_JUEZ")
    private String nombreApellidos;
    @Column(name="COMUNIDAD_JUEZ")
    private String comunidad;
    @Column(name="TEL_JUEZ")
    private int telefonoJuez;

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

    public int getTelefonoJuez() {
        return telefonoJuez;
    }

    public void setTelefonoJuez(int telefonoJuez) {
        this.telefonoJuez = telefonoJuez;
    }
    
    
    
    
    
}
