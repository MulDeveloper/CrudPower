
package dev.muldev.crudpower.Controlador;

import dev.muldev.crudpower.Modelos.Club;
import dev.muldev.crudpower.Services.ServiceClub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CtrlClub {
    
    @Autowired
    private ServiceClub service;
    
    @GetMapping(value = "/altaClub")
    public String altaDeClub(Model m){
        m.addAttribute("Club", new Club());
        return "altaClub";

    }
    
    @RequestMapping("/altaBdClub")
    public String altaBd(Club c) throws Exception{
        if(service.altaClub(c)>0){
            return "succes";
        }
        return "error";
    }
    
    @RequestMapping(value = "/cargarClubs", method = RequestMethod.GET)
    public String cargaListaClubs(Model m) throws Exception{
        m.addAttribute("clubs", service.listarClubs());
        return "cargarClubs";

    }
    
    
    @RequestMapping(value = "/modiClubBd", method = RequestMethod.POST)
    public String modificarAfiliadoEnBd(Club c){
        try{
            service.altaClub(c);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return "succes";
    }
    
    @RequestMapping(value = "/eliminarClub/{id}")
    public String bajaAfiliadoEnBd(@PathVariable Integer id){

        try{
            service.bajaClub(id);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return "succes";
    }
    
    @RequestMapping("/verClub/{id}")
    public String mostrarAfiliado(@PathVariable Integer id, Model model) {
        model.addAttribute("Club", service.mostrarClub(id));
        return "datosClub";
    }
            
}
