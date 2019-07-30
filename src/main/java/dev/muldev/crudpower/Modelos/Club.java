
package dev.muldev.crudpower.Modelos;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CLUBES")
public class Club {
    @Id
    @Column(name="ID_CLUB")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Column(name="NOMBRE_CLUB")
    private String nombre;
    @Column(name="LOCALIDAD_CLUB")
    private String localidad;
    @Column(name="PROVINCIA_CLUB")
    private String provincia;
    @Column(name="COMUNIDAD_CLUB")
    private String comunidad;
    @Column(name="NUMERO_CLUB")
    private int numeroResponsable;
    
    @OneToMany(mappedBy="club", cascade = CascadeType.ALL)
    private List <Afiliado> listaClub;

    public Club() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getComunidad() {
        return comunidad;
    }

    public void setComunidad(String comunidad) {
        this.comunidad = comunidad;
    }

    public int getNumeroResponsable() {
        return numeroResponsable;
    }

    public void setNumeroResponsable(int numeroResponsable) {
        this.numeroResponsable = numeroResponsable;
    }
    
    
    
    
}
