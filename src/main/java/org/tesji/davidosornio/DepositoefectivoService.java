package org.tesji.davidosornio;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public interface DepositoefectivoService {
    
    @WebMethod
    public String Deposito(String cuenta, int cantidad);
    
    
}
