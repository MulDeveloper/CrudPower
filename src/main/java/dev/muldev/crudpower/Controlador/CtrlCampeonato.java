
package dev.muldev.crudpower.Controlador;

import dev.muldev.crudpower.Modelos.Campeonato;
import dev.muldev.crudpower.Services.ServiceCampeonato;
import dev.muldev.crudpower.Services.ServiceClub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CtrlCampeonato {
    
    @Autowired
    private ServiceClub serviceClub;
    @Autowired
    private ServiceCampeonato serviceCampeonato;
   
    
    @GetMapping("/campeonato")
    public String campeonatoIndice(){
        return "campeonato";
    }
    
    @RequestMapping(value = "/altaCampeonato", method = RequestMethod.GET)
    public String paginaCampeoantos(Model m) throws Exception{
        m.addAttribute("clubes", serviceClub.listarClubs());
        m.addAttribute("Campeonato", new Campeonato());
        return "altaCampeonato";

    }
    
    @RequestMapping(value = "/cargarCampeonatos", method = RequestMethod.GET)
    public String cargaCampeonatos(Model m) throws Exception{
        m.addAttribute("campeonatos", serviceCampeonato.listaCampeonatos());
        return "cargarCampeonatos";

    }
    
    @RequestMapping(value = "/modificarCampeonato/{id}")
    public String modificarCampeonato(@PathVariable Integer id, Model m){
        m.addAttribute("Campeonato",serviceCampeonato.mostrarCampeoanto(id));
        return "modificarCampeonato";

    }
    
    
    @RequestMapping(value = "/altaBdCampeonato", method = RequestMethod.POST)
    public String altaCampeonatoEnBd(Campeonato c){
        try{
            serviceCampeonato.altaCampeonato(c);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return "succes";
    }
    
    @RequestMapping(value = "/modiCampeonatoBd", method = RequestMethod.POST)
    public String modificarCampeonatoEnBd(Campeonato c){
        try{
            serviceCampeonato.altaCampeonato(c);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return "succes";
    }
    
    
    @RequestMapping("/verCampeonato/{id}")
    public String mostrarCampeonato(@PathVariable Integer id, Model model) {
        model.addAttribute("Campeonato", serviceCampeonato.mostrarCampeoanto(id));
        return "datosCampeonato";
    }
}
