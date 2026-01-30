/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorador2;
import java.util.Scanner;
/**
 *
 * @author labesp
 */
public class Decorador2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcion;
        Personaje personaje = new PersonajeBase();
        do{
            System.out.println("JUEGO CRASH");
            System.out.println("1. Personaje Base");
            System.out.println("2. Agregar Espada");
            System.out.println("3. Agregar Escudo");
            System.out.println("4. Agregar Armadura");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opción: ");
            opcion = sc.nextInt(); sc.nextLine();

            switch(opcion){
                case 1:
                    System.out.println(personaje.getDescripcion());
                    System.out.println("Ataque: " + personaje.getAtaque());
                    System.out.println("Defensa: " + personaje.getDefensa()); break;
                case 2:
                    personaje = new Espada(personaje);
                    System.out.println(personaje.getDescripcion());
                    System.out.println("Espada Agregada!!!");
                    System.out.println("Ataque: " + personaje.getAtaque());
                    System.out.println("Defensa: " + personaje.getDefensa()); break;
                case 3:
                    personaje = new Escudo(personaje);
                    System.out.println(personaje.getDescripcion());
                    System.out.println("Escudo Agregado!!!");
                    System.out.println("Ataque: " + personaje.getAtaque());
                    System.out.println("Defensa: " + personaje.getDefensa()); break;
                case 4:
                    personaje = new Armadura(personaje);
                    System.out.println(personaje.getDescripcion());
                    System.out.println("Armadura Agregada!!!");
                    System.out.println("Ataque: " + personaje.getAtaque());
                    System.out.println("Defensa: " + personaje.getDefensa()); break;
                case 5:
                    break;
                default:
                    System.out.println("No existe esa opción...");
            }
        }while(opcion!=5);
        sc.close();
    }
}
