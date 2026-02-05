/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observer2;
import java.util.Scanner;
/**
 *
 * @author labesp
 */
public class observer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        Producto producto = null;
        do{
            System.out.println("===NOTIFICACIONES LENIN FASHION===");
            System.out.println("1.- Agregar producto");
            System.out.println("2.- Agregar cliente");
            System.out.println("3.- Ver clientes notificados");
            System.out.println("4.- Salir");
            System.out.println("Ingrese un opcion: ");
            opcion = sc.nextInt(); sc.nextLine();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el nombre del producto: ");
                    String nproducto = sc.nextLine();
                    producto = new Producto(nproducto);break;
                case 2:
                    System.out.println("Ingrese el nombre del Cliente: ");
                    String ncliente = sc.nextLine();
                    producto.agregarCliente(new Tienda(ncliente)); break;
                case 3:
                    producto.mostrarClientesNotificados();
                case 4: break;
                default:
                    System.out.println("Opcion no valida!!!");
            }
        }while(opcion!=4);
    }
}
