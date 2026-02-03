/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategy1;
import java.util.Scanner;
/**
 *
 * @author labesp
 */
public class Strategy1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Compra compra = new Compra();
        
        System.out.println("MENU DE PAGO");
        System.out.println("1.- Pago por Trajeta");
        System.out.println("2.- Pago por PayPal");
        System.out.println("3.- Pago por De Una");
        System.out.println("Selecciona una forma de pago: ");
        int x = sc.nextInt();
        switch(x){
            case 1:
                compra.setMetodoPago(new PagoTarjeta());
                System.out.println("Ingrese el monto a pagar por tarjeta: ");
                double monto = sc.nextDouble();
                compra.realizarPago(monto); break;
            case 2:
                compra.setMetodoPago(new PagoPayPal());
                System.out.println("Ingrese el monto a pagar por PayPal: ");
                monto = sc.nextDouble();
                compra.realizarPago(monto); break;
            case 3:
                compra.setMetodoPago(new PagoDeUna());
                System.out.println("Ingrese el monto a pagar por DeUna: ");
                monto = sc.nextDouble();
                compra.realizarPago(monto); break;
            default:
                System.out.println("Opcion no valida!!!!");
        }
        sc.close();
    }
}
