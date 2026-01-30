/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory2;

/**
 *
 * @author PC
 */
public class PagosFactory {
        public static Pagos crearPago(int tipo){
        switch(tipo){
            case 1: return new PagoEfectivo();
            case 2: return new PagoTransferencia();
            case 3: return new PagoTarjeta();
            case 4: return new PagoBitcoin();
            case 5: return new PagoCheque();
            default: System.out.println("Pago no disponible");
            return null;
        }
    }
}
