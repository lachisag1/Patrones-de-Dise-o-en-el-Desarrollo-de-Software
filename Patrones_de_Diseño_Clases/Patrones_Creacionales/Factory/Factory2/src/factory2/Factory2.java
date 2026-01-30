/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factory2;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Factory2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        double monto =0;
        do{
            System.out.println("===TIPOS DE PAGO===");
            System.out.println("1. Pago en efectivo");
            System.out.println("2. Pago por transferencia");
            System.out.println("3. Pago por tarjeta");
            System.out.println("4. Pago por bitcoin");
            System.out.println("5. Pago por cheque");
            System.out.println("6. Salir");
            System.out.println("Seleccione una opción");
            opcion = sc.nextInt();
            sc.nextLine();
            
            if(opcion!=6){
            Pagos pago = PagosFactory.crearPago(opcion);
            System.out.println("Ingrese el monto a pagar");
            monto = sc.nextDouble();
            if(pago != null){
                pago.procesarPagos(monto);
            }else{
                System.out.println("No se ha podido realizar el pago");
            }
            }
        }while(opcion!=6);
    }
}
