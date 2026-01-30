
package EjercicioAdapter1;
import java.util.Scanner;

public class EjercicioAdapter1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el monto que desea pagar: ");
        double monto = sc.nextDouble();
        System.out.println("MONEDAS A PAGAR");
        System.out.println("1.- Pagar Euro");
        System.out.println("2.- Pagar Pesos Mexicanos");
        System.out.println("3.- Pagar Yén Japonés");
        System.out.println("4.- Pagar Real Brasileño");
        System.out.println("5.- Pagar Libra Esterlina");
        System.out.print("Ingrese una opcion: ");
        int opcion = sc.nextInt();
        switch(opcion){
            case 1:
                Pago euro = new PagoAdapter(new PagoEuro());
                euro.pagar(monto, 1);break;
            case 2:
                Pago peso = new PagoAdapter(new PagoPesos());
                peso.pagar(monto, 2);break;
            case 3:
                Pago yen = new PagoAdapter(new PagoYen());
                yen.pagar(monto, 3);break;
            case 4:
                Pago real = new PagoAdapter(new PagoReal());
                real.pagar(monto, 4);break;
            case 5:
                Pago libra = new PagoAdapter(new PagoLibra());
                libra.pagar(monto, 5);break;
            default :
                System.out.println("Opción no valida");
        }
    }
}
