
package org.tesji.ClaudioRodriguez;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author root
 */
@WebService
public interface VentaService {
    
    @WebMethod
    public String ventaproducto(String nombre, String precio);
    
      
}
