/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciofactory1;
import java.util.Scanner;

public class EjercicioFactory1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        double monto =0;
        do{
            System.out.println("===TIPOS DE PAGO===");
            System.out.println("1. Descuento cliente frecuente");
            System.out.println("2. Descuento cliente regular");
            System.out.println("3. Descuento cliente ocasional");
            System.out.println("4. Descuento cliente promerizo");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opción");
            opcion = sc.nextInt();
            sc.nextLine();
            
            if(opcion!=5){
            Descuentos descuento = DescuentosFactory.crearDescuento(opcion);
            System.out.println("Ingrese el monto a pagar");
            monto = sc.nextDouble();
            if(descuento != null){
                descuento.procesarDescuento(monto);
            }else{
                System.out.println("No se ha podido realizar el descuento");
            }
            }
        }while(opcion!=5);
    }
}
