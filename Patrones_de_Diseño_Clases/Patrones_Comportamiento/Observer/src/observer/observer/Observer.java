/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observer;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        String titulo = "";
        Canal canal = new Canal();
        do{
            System.out.println("===CANAL YOUTUBE===");
            System.out.println("1.- Suscribete");
            System.out.println("2.- Subir video");
            System.out.println("3.- Ver notificaciones");
            System.out.println("4.- Salir");
            System.out.println("Ingrese un opcion: ");
            opcion = sc.nextInt(); sc.nextLine();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el nombre del usuario: ");
                    String nombre = sc.nextLine();
                    canal.suscribir(new Usuario(nombre));break;
                case 2:
                    System.out.println("Ingrese el nombre del video: ");
                    titulo = sc.nextLine();
                    canal.subir(titulo); break;
                case 3:
                    canal.notificar(titulo); break;
                default:
                    System.out.println("No existe esa opcion!!!");
            }
        }while(opcion!=4);
        sc.close();
    }
}
