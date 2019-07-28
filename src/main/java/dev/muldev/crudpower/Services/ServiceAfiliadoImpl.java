
package dev.muldev.crudpower.Services;

import dev.muldev.crudpower.Dao.DAOAfiliado;
import dev.muldev.crudpower.Modelos.Afiliado;
import dev.muldev.crudpower.Modelos.Usuario;
import org.springframework.beans.factory.annotation.Autowired;


public class ServiceAfiliadoImpl implements ServiceAfiliado{
    
    @Autowired
    private DAOAfiliado daoAfiliado;

    @Override
    public int altaAfiliado(Afiliado a) throws Exception {
        try{
            daoAfiliado.save(a);
            return 1;
        }
        catch(Exception e){
            return -1;
        }
    }
    
}
