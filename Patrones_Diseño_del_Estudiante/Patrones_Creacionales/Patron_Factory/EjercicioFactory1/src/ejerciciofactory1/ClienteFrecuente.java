/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciofactory1;

/**
 *
 * @author PC
 */
public class ClienteFrecuente implements Descuentos{

    @Override
    public void procesarDescuento(double pago) {
        double totalPagar = pago - pago*0.20;
        System.out.println("Tatal a pagar con descuento del 20%: " + totalPagar);
    }
    
}
