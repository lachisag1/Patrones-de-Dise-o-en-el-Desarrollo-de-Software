/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciodecorator2;
import java.util.Scanner;

public class EjercicioDecorator2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcion;
        Notificacion notificacion = new NotificacionBase();
        do{
            System.out.println("NOTIFICACIONES");
            System.out.println("1. Notificacion de SMS");
            System.out.println("2. Notificacion de WhatsApp");
            System.out.println("3. Notificacion de Massenger");
            System.out.println("4. Notificacion de Telegram");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opción: ");
            opcion = sc.nextInt(); sc.nextLine();

            switch(opcion){
                case 1:
                    System.out.println(notificacion.getMensaje());
                    System.out.println("Numero de notificaciones: " + notificacion.getNumeroNotificaciones());break;
                case 2:
                    notificacion = new NotificacionWhatsApp(notificacion);
                    System.out.println(notificacion.getMensaje());
                    System.out.println("Numero de notificaciones: " + notificacion.getNumeroNotificaciones());break;
                case 3:
                    notificacion = new NotificacionMassenger(notificacion);
                    System.out.println(notificacion.getMensaje());
                    System.out.println("Numero de notificaciones: " + notificacion.getNumeroNotificaciones());break;
                case 4:
                    notificacion = new NotificacionTelegram(notificacion);
                    System.out.println(notificacion.getMensaje());
                    System.out.println("Numero de notificaciones: " + notificacion.getNumeroNotificaciones());break;
                case 5:
                    break;
                default:
                    System.out.println("No existe esa opción...");
            }
        }while(opcion!=5);
        sc.close(); 
    }
}
