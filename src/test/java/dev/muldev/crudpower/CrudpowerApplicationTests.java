package dev.muldev.crudpower;


import dev.muldev.crudpower.Modelos.Afiliado;
import dev.muldev.crudpower.Modelos.Club;
import dev.muldev.crudpower.Services.ServiceAfiliadoImpl;
import dev.muldev.crudpower.Services.ServiceClubImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CrudpowerApplicationTests {
    
        @Autowired
        private ServiceClubImpl club;

	@Test
	public void contextLoads(){
            
            try{
                club.listarClubs();
            }
            catch(Exception e){
                System.out.println("No se puede listar");
            }
            
	}

}
