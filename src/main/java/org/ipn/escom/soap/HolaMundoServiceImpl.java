package org.ipn.escom.soap;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 *
 * @author eduardo.castillo
 */
@Stateless
@WebService(endpointInterface = "org.ipn.escom.soap.HolaMundoService")
public class HolaMundoServiceImpl implements HolaMundoService {

    @Override
    public String saludar(String nombre) {

        return "Hola desde JAX-WS : " + nombre + " son las: " + LocalDateTime.now();

    }

}
