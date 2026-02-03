/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategy2;
import java.util.Scanner;
/**
 *
 * @author labesp
 */
public class strategy2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Venta venta = new Venta();
        
        System.out.println("MENU DE DESCUENTOS");
        System.out.println("1.- Descuento Normal");
        System.out.println("2.- Descuento VIP");
        System.out.println("3.- Descuento Estudiantil");
        int op = sc.nextInt();
        
        switch(op){
            case 1:
                System.out.println("Ingrese monto de la venta: ");
                double monto = sc.nextDouble();
                venta.setDescuento(new DescuentoNormal());
                System.out.println("Valor a pagar: " + (monto - venta.calcularTotal(monto))); break;
            case 2:
                System.out.println("Ingrese monto de la venta: ");
                monto = sc.nextDouble();
                venta.setDescuento(new DescuentoVIP());
                System.out.println("Valor a pagar: " + (monto - venta.calcularTotal(monto))); break;
            case 3:
                System.out.println("Ingrese monto de la venta: ");
                monto = sc.nextDouble();
                venta.setDescuento(new DescuentoEstudiantil());
                System.out.println("Valor a pagar: " + (monto - venta.calcularTotal(monto))); break;
        }
        sc.close();
    }
}
