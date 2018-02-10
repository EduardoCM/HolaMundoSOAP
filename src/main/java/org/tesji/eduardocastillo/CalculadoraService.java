/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tesji.eduardocastillo;

import javax.jws.WebService;


@WebService
public interface CalculadoraService {
    
    public int sumar(int numUno, int numDos);
}
