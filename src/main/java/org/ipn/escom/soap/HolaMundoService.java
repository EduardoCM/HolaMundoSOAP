package org.ipn.escom.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author eduardo.castillo
 */
@WebService
public interface HolaMundoService {
    
    @WebMethod
    public String saludar(String nombre);
}
