/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *
 * @author labesp
 */
public class Azucar extends BebidaDecorador{

    public Azucar(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripción() {
        return bebida.getDescripción() + " + azucar";
    }

    @Override
    public double getCosto() {
        return bebida.getCosto();
    }
}
