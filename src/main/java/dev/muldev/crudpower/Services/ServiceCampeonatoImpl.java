
package dev.muldev.crudpower.Services;

import dev.muldev.crudpower.Dao.DAOCampeonato;
import dev.muldev.crudpower.Modelos.Campeonato;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceCampeonatoImpl implements ServiceCampeonato{

    @Autowired
    private DAOCampeonato dao;
    
    @Override
    public int altaCampeonato(Campeonato c){
        try{
            dao.save(c);
            return 1;
        }
        catch(Exception e){
            return -1;
        }
    }

    @Override
    public List<Campeonato> listaCampeonatos() {
        return dao.findAll();
    }

    @Override
    public Campeonato mostrarCampeoanto(int id) {
        return dao.getOne(id);
    }
    
    
    
    
}
