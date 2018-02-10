package org.tesji.cesarcruz;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author eduardo.castillo
 */
@WebService
public interface Edad {
    
    @WebMethod
    public String miedad(String edad);
}
