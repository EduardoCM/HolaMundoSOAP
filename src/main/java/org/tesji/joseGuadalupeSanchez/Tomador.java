/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tesji.joseGuadalupeSanchez;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author CLOUD_STRIFE
 */
@WebService(endpointInterface = "org.tesji.joseGuadalupeSanchez")
public class Tomador implements tomadorM {

    @Override
    public String Chelas(String Vaso) {
       String categoria = "el nivel en el que te encuentras es ";
      int Vasos=Integer.parseInt(Vaso);
        if (Vasos<=5) {
            categoria += "amateur";  
        }
        if(Vasos>5){
        categoria+="master";
    }
            
       return categoria; 
    }

   
   
}
