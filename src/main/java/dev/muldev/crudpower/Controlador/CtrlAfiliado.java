
package dev.muldev.crudpower.Controlador;

import dev.muldev.crudpower.Modelos.Afiliado;
import dev.muldev.crudpower.Services.ServiceAfiliadoImpl;
import dev.muldev.crudpower.Services.ServiceClubImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CtrlAfiliado {
    
    @Autowired
    private ServiceClubImpl serviceClub;
    @Autowired
    private ServiceAfiliadoImpl serviceAfiliado;
    
    @RequestMapping(value = "/altaAfiliado", method = RequestMethod.GET)
    public String listaClubs(Model m) throws Exception{
        m.addAttribute("clubes", serviceClub.listarClubs());
        m.addAttribute("Afiliado", new Afiliado());
        return "altaAfiliado";

    }
    
    @RequestMapping(value = "/altaBd", method = RequestMethod.POST)
    public String altaAfiliadoEnBd(Afiliado a){

        try{
            serviceAfiliado.altaAfiliado(a);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return "succes";

    }
}
