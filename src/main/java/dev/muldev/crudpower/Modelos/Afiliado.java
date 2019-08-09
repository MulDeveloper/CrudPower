
package dev.muldev.crudpower.Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="AFILIADOS")
public class Afiliado {
    @Id
    @Column(name="ID_AFILAIDO")
    @GenericGenerator(name="idValor" , strategy="increment")
    @GeneratedValue(generator="idValor")
    private int id;
    @Column(name="NOMBRE_AFILIADO")
    private String nombre;
    @Column(name="APELLIDOS_AFILIADO")
    private String apellidos;
    @Column(name="EDAD_AFILIADO")
    private int edad;
    @Column(name="ID_CLUB")
    private int club;

    public Afiliado() {
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getClub() {
        return club;
    }

    public void setClub(int club) {
        this.club = club;
    }
    
    
    
    
}
