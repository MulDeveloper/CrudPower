
package dev.muldev.crudpower.Services;

import dev.muldev.crudpower.Modelos.Campeonato;
import java.util.List;


public interface ServiceCampeonato {
    public int altaCampeonato(Campeonato c);
    
    public List <Campeonato> listaCampeonatos();
    
    public Campeonato mostrarCampeoanto(int id);
}
