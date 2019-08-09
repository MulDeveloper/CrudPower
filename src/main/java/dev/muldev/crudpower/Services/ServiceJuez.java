
package dev.muldev.crudpower.Services;

import dev.muldev.crudpower.Modelos.Juez;
import java.util.List;


public interface ServiceJuez {
    public int altaJuez(Juez j);
    
    public int bajaJuez(int id);
    
    public List <Juez> listarJueces();
    
    public Juez mostrarJuez(int id);
    
}
