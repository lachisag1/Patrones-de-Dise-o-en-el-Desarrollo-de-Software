
package ejercicio_observer1;
import java.util.Scanner;

public class Ejercicio_Observer1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        String aviso = "";
        Escuela escuela = new Escuela();

        do {
            System.out.println("=== SISTEMA DE AVISOS ESCOLARES ===");
            System.out.println("1.- Registrar estudiante");
            System.out.println("2.- Publicar aviso");
            System.out.println("3.- Enviar notificaciones");
            System.out.println("4.- Salir");
            System.out.print("Ingrese una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombre = sc.nextLine();
                    escuela.suscribir(new Estudiante(nombre));break;
                case 2:
                    System.out.print("Ingrese el aviso: ");
                    aviso = sc.nextLine();break;
                case 3:
                    escuela.notificar(aviso);break;
                case 4:
                    System.out.println("Saliendo del sistema...");break;
                default:
                    System.out.println("Opción no válida!!!");
            }
        } while (opcion != 4);
        sc.close();
    }
}
