/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory2;

/**
 *
 * @author PC
 */
public class PagoCheque implements Pagos{

    @Override
    public void procesarPagos(double monto) {
        System.out.println("Se paga con cheque la cantidad de $" + monto);
    }
}
