

package org.ipn.escom.resta;
import javax.jws.WebMethod;
import javax.jws.WebService;


/**
 *
 * @author Garferch
 */
@WebService
public interface Resta {
      @WebMethod
    public String restar(int num1, int num2);
    
}
