/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ipn.escom.resta;

/**
 *
 * @author Garferch
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface = "org.ipn.escom.resta.Resta")

public class RestaImpl implements Resta{

    @Override
    public String restar(int num1, int num2) {
         return "la resta de  " +num1 +" menos " + num2 + " es igual "+ (num1-num2);

    }
    
}
