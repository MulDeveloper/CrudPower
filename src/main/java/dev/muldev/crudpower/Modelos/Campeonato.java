
package dev.muldev.crudpower.Modelos;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CAMPEONATOS")
public class Campeonato {
    @Id
    @Column(name="ID_CAMPEONATO")
    private int id;
    @Column(name="TIPO_CAMPEONATO")
    private String tipo;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="ID_CLUB")
    private Club clubOrganizador;
    @Column(name="LOCALIDAD_CAMPEONATO")
    private String localidad;
            
    
}
