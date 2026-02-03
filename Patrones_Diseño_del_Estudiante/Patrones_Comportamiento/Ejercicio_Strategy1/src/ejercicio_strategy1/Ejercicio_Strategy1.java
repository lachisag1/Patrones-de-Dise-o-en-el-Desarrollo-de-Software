
package ejercicio_strategy1;
import java.util.Scanner;

public class Ejercicio_Strategy1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Envio envio = new Envio();
        double monto = 0;
        int op = 0;
        do{
        System.out.println("MENU DE DESCUENTOS");
        System.out.println("1.- Envio Estandar (x1)");
        System.out.println("2.- Envio Express (x2)");
        System.out.println("3.- Envio Internacional (x3)");
        System.out.println("4.- Salir");
            System.out.print("Seleccione una opcion: ");
        op = sc.nextInt();
        
        switch(op){
            case 1:
                System.out.println("Ingrese el costo base del envío: ");
                monto = sc.nextDouble();
                envio.setMetodoPago(new EnvioEstandar());
                System.out.println("Valor a pagar: " + (monto * envio.calcularTotal(monto))); break;
            case 2:
                System.out.println("Ingrese el costo base del envío: ");
                monto = sc.nextDouble();
                envio.setMetodoPago(new EnvioExpress());
                System.out.println("Valor a pagar: " + (monto * envio.calcularTotal(monto))); break;
            case 3:
                System.out.println("Ingrese el costo base del envío: ");
                monto = sc.nextDouble();
                envio.setMetodoPago(new EnvioInternacional());
                System.out.println("Valor a pagar: " + (monto * envio.calcularTotal(monto))); break;
            case 4: break;
            default:
                System.out.println("Opcion no válida!!!");
        }
        }while(op!=4);
        sc.close();
    }
}
