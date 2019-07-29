
package dev.muldev.crudpower.Services;

import dev.muldev.crudpower.Dao.DAOJuez;
import dev.muldev.crudpower.Modelos.Juez;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceJuezImpl implements ServiceJuez{
    
    @Autowired
    private DAOJuez dao;


    @Override
    public void altaJuez(Juez j) throws Exception {
        try{
            dao.save(j);
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
    
    
}
