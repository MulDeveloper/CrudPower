
package dev.muldev.crudpower.Modelos;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="CAMPEONATOS")
public class Campeonato {
    @Id
    @Column(name="ID_CAMPEONATO")
    @GenericGenerator(name="idValor" , strategy="increment")
    @GeneratedValue(generator="idValor")
    private int id;
    @Column(name="TIPO_CAMPEONATO")
    private String tipo;
    @Column(name="ID_CLUB")
    private String clubOrganizador;
    @Column(name="LOCALIDAD_CAMPEONATO")
    private String localidad;

    public Campeonato() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClubOrganizador() {
        return clubOrganizador;
    }

    public void setClubOrganizador(String clubOrganizador) {
        this.clubOrganizador = clubOrganizador;
    }

    

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
     
    
    
    
}
