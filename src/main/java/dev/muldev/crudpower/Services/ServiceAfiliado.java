
package dev.muldev.crudpower.Services;

import dev.muldev.crudpower.Modelos.Afiliado;
import java.util.List;
import java.util.Optional;


public interface ServiceAfiliado {
    public int altaAfiliado(Afiliado a) throws Exception;
    
    public void bajaAfiliado(int id) throws Exception;
    
    public List <Afiliado> cargaAfiliados() throws Exception;
    
    public Afiliado mostrarAfiliado(int id);
}
