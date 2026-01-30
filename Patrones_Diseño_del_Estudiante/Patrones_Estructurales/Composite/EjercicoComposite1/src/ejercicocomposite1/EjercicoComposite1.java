
package ejercicocomposite1;
import java.util.Scanner;

public class EjercicoComposite1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pedido pedido = new Pedido();
        
        int opcion;
        
        do{
            System.out.println("\n=== MENÚ COMIDA RÁPIDA ===");
            System.out.println("1. Papas ($1.00)");
            System.out.println("2. Cola ($0.75)");
            System.out.println("3. Hamburguesa ($2.00)");
            System.out.println("4. Ver total");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    pedido.agregarPedido(new Papas());
                    System.out.println("Papas añadidas. Total actual: $" + pedido.getPrecio());
                    break;
                case 2:
                    pedido.agregarPedido(new Cola());
                    System.out.println("Cola añadida. Total actual: $" + pedido.getPrecio());
                    break;
                case 3:
                    pedido.agregarPedido(new Hamburguesa());
                    System.out.println("Hamburguesa añadida. Total actual: $" + pedido.getPrecio());
                    break;
                case 4:
                    pedido.mostrarDetalle();
                    break;
                case 5:
                    System.out.println("Gracias por su compra 🙌");
                    pedido.mostrarDetalle();
                    break;
                default: 
                    System.out.println("Opción no válida");
            }
        } while (opcion != 5);
        sc.close();
    }
}
