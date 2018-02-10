package org.tesji.davidosornio;


import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface = "org.tesji.davidosornio.DepositoefectivoService" )
public class DepositoEfectivoServiceImpl implements DepositoefectivoService{

    @Override
    public String Deposito(String cuenta, int cantidad) {
        String deposito = "";
        if (cantidad > 0){
        if (cuenta.equals("12345")){
            deposito += "Deposito a la cuenta " + cuenta + " la cantidad de " + cantidad;
        }else if (cuenta.equals("123456789")){
            deposito += "Deposito a la cuenta " + cuenta + " la cantidad de " + cantidad;
        }else{
            deposito += "No exite el numero de cuenta o no es valido para este banco";
        }
        }
        return deposito;
    }
    
}
