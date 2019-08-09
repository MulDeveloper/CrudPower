
package dev.muldev.crudpower.Services;

import dev.muldev.crudpower.Dao.DAOClub;
import dev.muldev.crudpower.Modelos.Club;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceClubImpl implements ServiceClub{

    @Autowired
    private DAOClub dao;
    
    @Override
    public int altaClub(Club c){
        try{
            dao.save(c);
            return 1;
        }
        catch(Exception e){
            return -1;
        }
    }

    @Override
    public List<Club> listarClubs() throws Exception {
        return dao.findAll();
    }

    @Override
    public Club mostrarClub(int id) {
        return dao.getOne(id);
              
    }

    @Override
    public void bajaClub(int id) throws Exception {
        dao.deleteById(id);
    }
    
    
    
    
    
    
    
}
