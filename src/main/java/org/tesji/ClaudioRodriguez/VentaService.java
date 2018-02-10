/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    public String ventaproducto( String precio);
    
      
}
