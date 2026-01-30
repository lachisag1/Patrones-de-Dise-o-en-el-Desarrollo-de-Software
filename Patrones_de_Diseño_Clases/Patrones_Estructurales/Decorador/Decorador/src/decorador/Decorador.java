/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorador;
import java.util.*;
/**
 *
 * @author labesp
 */
public class Decorador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcion;
        Bebida cafe = new CafeSimple();
        
        do{
            System.out.println("CAFETERÍA ESPE");
            System.out.println("1. Café Simple");
            System.out.println("2. Agregar Leche");
            System.out.println("3. Agregar Azucar");
            System.out.println("4. Agregar Cremade Canela");
            System.out.println("5. Agregar Hielo");
            System.out.println("6. Salir");
            System.out.println("Ingrese una opción: ");
            opcion = sc.nextInt(); sc.nextLine();

            switch(opcion){
                case 1:
                    cafe = new CafeSimple();
                    System.out.println(cafe.getDescripción() + " = $" + cafe.getCosto()); break;
                case 2:
                    cafe = new Azucar(cafe);
                    System.out.println(cafe.getDescripción() + " = $" + cafe.getCosto()); break;
                case 3:
                    cafe = new Leche(cafe);
                    System.out.println(cafe.getDescripción() + " = $" + cafe.getCosto()); break;
                case 4:
                    cafe = new Crema(cafe);
                    System.out.println(cafe.getDescripción() + " = $" + cafe.getCosto()); break;
                case 5:
                    cafe = new Hielo(cafe);
                    System.out.println(cafe.getDescripción() + " = $" + cafe.getCosto()); break;
                case 6:
                    break;
                case 7:
                    System.out.println("No existe esa opción...");
            }
        }while(opcion!=6);
        sc.close();
    }
}
