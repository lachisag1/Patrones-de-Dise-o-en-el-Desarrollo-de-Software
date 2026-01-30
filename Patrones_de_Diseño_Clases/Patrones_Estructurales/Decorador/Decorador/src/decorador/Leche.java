/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *
 * @author labesp
 */
public class Leche extends BebidaDecorador {

    public Leche(Bebida bebida) {
        super(bebida);
    }
    

    @Override
    public String getDescripción() {
        return bebida.getDescripción() + " + Leche ";
    }

    @Override
    public double getCosto() {
        return bebida.getCosto() + 0.50;
    }
}
