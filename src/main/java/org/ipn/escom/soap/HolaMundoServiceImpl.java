package org.ipn.escom.soap;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 *
 * @author eduardo.castillo
 */
@Stateless
@WebService(endpointInterface = "org.ipn.escom.soap.HolaMundoService")
public class HolaMundoServiceImpl implements HolaMundoService {

    private static  Logger LOG = Logger.getLogger(HolaMundoServiceImpl.class.getName());
    
    @Override
    public String saludar(String nombre) {

        return "Hola desde JAX-WS : " + nombre + " son las: " + LocalDateTime.now();

    }

    @Override
    public String despedir(String nombre, String horario) {
    
        String despedida = "Adios que tengas nonit@";
        switch(horario){
            case "mañana":
                despedida += " Mañana";
            break;
            case "tarde":
             despedida += " Tarde";
            break;
            
            case "noche":
                despedida += " Noche";
                break;
                
            case "madrugada":
                despedida += " La seguimos en mi depa";
                break;
                
        }
        return despedida;
   
}
    
}
