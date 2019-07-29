
package dev.muldev.crudpower.Services;

import dev.muldev.crudpower.Dao.DAOCampeonato;
import dev.muldev.crudpower.Modelos.Campeonato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceCampeonatoImpl implements ServiceCampeonato{

    @Autowired
    private DAOCampeonato dao;
    
    @Override
    public void altaCampeonato(Campeonato c) throws Exception {
        try{
            dao.save(c);
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
    
}
