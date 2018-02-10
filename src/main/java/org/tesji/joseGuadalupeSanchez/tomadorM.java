package org.tesji.joseGuadalupeSanchez;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author eduardo.castillo
 */
@WebService
public interface tomadorM {
    @WebMethod
    public String Chelas(String Vaso);
}
