
package dev.muldev.crudpower.Services;

import dev.muldev.crudpower.Modelos.Club;
import java.util.List;


public interface ServiceClub {
    public void altaClub(Club c) throws Exception;
    
    public List<Club> listarClubs() throws Exception;
}
