package org.tesji.ClaudioRodriguez;

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface = "org.tesji.ClaudioRodriguez.soap.VentaService")

public class VentaServicelmpl implements VentaService{
    
}
