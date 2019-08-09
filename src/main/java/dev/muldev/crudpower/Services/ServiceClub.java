
package dev.muldev.crudpower.Services;

import dev.muldev.crudpower.Modelos.Club;
import java.util.List;


public interface ServiceClub {
    public int altaClub(Club c);
    
    public void bajaClub(int id) throws Exception;
    
    public List<Club> listarClubs() throws Exception;
    
    public Club mostrarClub(int id);
}
