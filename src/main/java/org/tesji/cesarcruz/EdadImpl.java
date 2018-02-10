/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tesji.cesarcruz;

import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 *
 * @author UNDER
 */
@Stateless
@WebService(endpointInterface = "org.tesji.cesarcruz.Edad")
public class EdadImpl implements Edad {
    
    @Override
    public String miedad(String miedad) {
        int anio=Integer.parseInt(miedad);
        return "Tu edad en el 2018 sera de : " + (2018-anio) + " años";

    }
    
}
