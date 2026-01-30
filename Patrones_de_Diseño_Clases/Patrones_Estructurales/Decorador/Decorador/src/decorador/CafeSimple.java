/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *
 * @author labesp
 */
public class CafeSimple implements Bebida {

    @Override
    public String getDescripción() {
        return "Cafe Simple";
    }

    @Override
    public double getCosto() {
        return 1;
    }
    
}
