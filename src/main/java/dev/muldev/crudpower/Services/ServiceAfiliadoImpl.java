
package dev.muldev.crudpower.Services;

import dev.muldev.crudpower.Dao.DAOAfiliado;
import dev.muldev.crudpower.Modelos.Afiliado;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceAfiliadoImpl implements ServiceAfiliado{
    
    @Autowired
    private DAOAfiliado daoAfiliado;

    @Override
    public int altaAfiliado(Afiliado a){
        try{
            daoAfiliado.save(a);
            return 1;
        }
        catch(Exception e){
            return -1;
        }
    }
    

    @Override
    public void bajaAfiliado(int id) throws Exception {
        daoAfiliado.deleteById(id);
    }

    @Override
    public List<Afiliado> cargaAfiliados() throws Exception {
        return daoAfiliado.findAll();
    }

    @Override
    public Afiliado mostrarAfiliado(int id) {
        return daoAfiliado.getOne(id);
    }

   
    
    
    
    
}
