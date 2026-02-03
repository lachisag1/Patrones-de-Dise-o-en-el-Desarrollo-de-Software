/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy1;

/**
 *
 * @author labesp
 */
public class PagoTarjeta implements MetodoPago {

    @Override
    public void pagar(double monto) {
        System.out.println("Pago con tarjeta: $" + monto);
    }
    
}
