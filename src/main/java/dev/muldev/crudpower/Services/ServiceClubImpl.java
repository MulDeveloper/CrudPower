
package dev.muldev.crudpower.Services;

import dev.muldev.crudpower.Dao.DAOClub;
import dev.muldev.crudpower.Modelos.Club;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceClubImpl implements ServiceClub{

    @Autowired
    private DAOClub dao;
    
    @Override
    public void altaClub(Club c) throws Exception {
        try{
            dao.save(c);
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
    
}
