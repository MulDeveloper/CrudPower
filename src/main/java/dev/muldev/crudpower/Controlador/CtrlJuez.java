
package dev.muldev.crudpower.Controlador;

import dev.muldev.crudpower.Modelos.Juez;
import dev.muldev.crudpower.Services.ServiceJuez;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CtrlJuez {
    
    @Autowired
    private ServiceJuez service;
    
    @GetMapping(value = "/altaJuez")
    public String altaDeJuez(Model m){
        m.addAttribute("Juez", new Juez());
        return "altaJuez";

    }
    
    @RequestMapping("/altaBdJuez")
    public String altaBdJuez(Juez j) throws Exception{
        if(service.altaJuez(j)>0){
            return "succes";
        }
        return "error";
    }
    
    @RequestMapping(value = "/cargarJueces", method = RequestMethod.GET)
    public String cargaListaJueces(Model m) throws Exception{
        m.addAttribute("jueces", service.listarJueces());
        return "cargarJueces";

    }
    
    
    @RequestMapping(value = "/eliminarJuez/{id}")
    public String bajaJuezBd(@PathVariable Integer id){

        try{
            service.bajaJuez(id);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return "succes";
    }
    
    @RequestMapping("/verJuez/{id}")
    public String mostrarJuez(@PathVariable Integer id, Model model) {
        model.addAttribute("Juez", service.mostrarJuez(id));
        return "datosJuez";
    }
}
