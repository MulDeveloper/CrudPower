
package dev.muldev.crudpower.Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="AFILIADOS")
public class Afiliado {
    @Id
    @Column(name="ID_AFILAIDO")
    private int id;
    @Column(name="NOMBRE_AFILIADO")
    private String nombre;
    @Column(name="APELLIDOS_AFILIADO")
    private String apellidos;
    @Column(name="EDAD_AFILIADO")
    private int edad;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_CLUB")
    private Club club;
    
    
}
