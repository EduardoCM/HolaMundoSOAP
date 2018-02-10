/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tesji.eduardocastillo;

import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 *
 * @author edcastillo
 */
@Stateless
@WebService(endpointInterface = "org.tesji.eduardocastillo.CalculadoraService")

public class CalculadoraServiceImpl implements CalculadoraService{

    @Override
    public int sumar(int numUno, int numDos) {
       return numUno + numDos;    
    }
    
    
}
