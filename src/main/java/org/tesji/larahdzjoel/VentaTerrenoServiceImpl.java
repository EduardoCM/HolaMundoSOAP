/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tesji.larahdzjoel;
import javax.ejb.Stateless;
import javax.jws.WebService;
/**
 *
 * @author VAIO
 */
@Stateless
@WebService(endpointInterface = "org.tesji.larahdzjoel.VentaTerrenoService")
public class VentaTerrenoServiceImpl implements VentaTerrenoService{

    @Override
    public String calcularVenta(int medLargo, int medAncho, double precioXmetro) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "Precio del terreno es: $" + (medLargo*medAncho*precioXmetro);
    }
    
}
