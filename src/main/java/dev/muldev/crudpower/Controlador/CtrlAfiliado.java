
package dev.muldev.crudpower.Controlador;

import dev.muldev.crudpower.Modelos.Afiliado;
import dev.muldev.crudpower.Services.ServiceAfiliado;
import dev.muldev.crudpower.Services.ServiceClub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CtrlAfiliado {
    
    @Autowired
    private ServiceClub serviceClub;
    @Autowired
    private ServiceAfiliado serviceAfiliado;
    
    private Afiliado aux;
    
    @RequestMapping(value = "/altaAfiliado", method = RequestMethod.GET)
    public String listaClubs(Model m) throws Exception{
        m.addAttribute("clubes", serviceClub.listarClubs());
        m.addAttribute("Afiliado", new Afiliado());
        return "altaAfiliado";

    }
    
    @RequestMapping(value = "/cargarUsuarios", method = RequestMethod.GET)
    public String cargaListaUsuarios(Model m) throws Exception{
        m.addAttribute("afiliados", serviceAfiliado.cargaAfiliados());
        return "cargarUsuarios";

    }
    
    @RequestMapping(value = "/modificarAfiliado/{id}")
    public String modificarAfiliado(@PathVariable Integer id, Model m){
        m.addAttribute("Afiliado",serviceAfiliado.mostrarAfiliado(id));
        return "modificarAfiliado";

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
    
    @RequestMapping(value = "/modiBd", method = RequestMethod.POST)
    public String modificarAfiliadoEnBd(Afiliado a){
        try{
            serviceAfiliado.altaAfiliado(a);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return "succes";
    }
    
    @RequestMapping(value = "/eliminarAfiliado/{id}")
    public String bajaAfiliadoEnBd(@PathVariable Integer id){

        try{
            serviceAfiliado.bajaAfiliado(id);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return "succes";
    }
    
    @RequestMapping("/verAfiliado/{id}")
    public String mostrarAfiliado(@PathVariable Integer id, Model model) {
        model.addAttribute("Afiliado", serviceAfiliado.mostrarAfiliado(id));
        return "datosAfiliado";
    }
}
