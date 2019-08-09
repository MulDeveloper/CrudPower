
package dev.muldev.crudpower.Services;

import dev.muldev.crudpower.Dao.DAOJuez;
import dev.muldev.crudpower.Modelos.Juez;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceJuezImpl implements ServiceJuez{
    
    @Autowired
    private DAOJuez dao;

    @Override
    public int altaJuez(Juez j) {
        try{
            dao.save(j);
            return 1;
        }
        catch(Exception e){
            return -1;
        }
    }

    @Override
    public int bajaJuez(int id) {
        try{
            dao.deleteById(id);
            return 1;
        }
        catch(Exception e){
            return -1;
        }
    }

    @Override
    public List<Juez> listarJueces() {
        return dao.findAll();
    }

    @Override
    public Juez mostrarJuez(int id) {
        return dao.getOne(id);
    }
    
    


    
    
    
}
