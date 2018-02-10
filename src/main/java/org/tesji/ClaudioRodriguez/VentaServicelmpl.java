package org.tesji.ClaudioRodriguez;

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface = "org.tesji.ClaudioRodriguez.VentaService")

public class VentaServicelmpl implements VentaService{
    
    
    @Override
    public String ventaproducto(String precio) {
        String prod="el precio del producto es: $";
        switch(precio){
            case "pantalon":
                prod+="120";
                break;
            case "playera":
                prod+="50";
                break;
                
        }
        return prod;
    }
    
}
