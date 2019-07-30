
package dev.muldev.crudpower.Controlador;

import dev.muldev.crudpower.Services.ServiceClubImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CtrlAfiliado {
    
    @Autowired
    private ServiceClubImpl service;
    
    @RequestMapping(value = "/afiliados", method = RequestMethod.GET)
    public String listaClubs(Model m) throws Exception{
        m.addAttribute("clubes", service.listarClubs());
        return "afiliados";

    }
}
