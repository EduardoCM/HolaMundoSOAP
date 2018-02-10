/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tesji.larahdzjoel;
import javax.jws.WebMethod;
import javax.jws.WebService;
/**
 *
 * @author VAIO
 */
@WebService
public interface VentaTerrenoService {
    @WebMethod
    public String calcularVenta(int medLargo, int medAncho, double precioXmetro);
}
