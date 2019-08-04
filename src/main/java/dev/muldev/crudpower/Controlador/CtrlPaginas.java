
package dev.muldev.crudpower.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CtrlPaginas {
    
    @GetMapping("/")
    public String indexRedirect(){
        return "administracion";
    }
    
    
    @GetMapping("/admin")
    public String pagAdm(){
        return "administracion";
    }
    
    /*@GetMapping("/afiliados")
    public String pagAfiliados(){
        return "afiliados";
    }*/
    
    @GetMapping("/clubs")
    public String pagClubs(){
        return "pagClubs";
    }
    
    @GetMapping("/jueces")
    public String pagJuez(){
        return "juez";
    }
    @GetMapping("/campeonatos")
    public String pagCampe(){
        return "campeonato";
    }
    
    @GetMapping(value = "/afiliados")
    public String principalAfiliados(){
        return "afiliados";

    }

}
