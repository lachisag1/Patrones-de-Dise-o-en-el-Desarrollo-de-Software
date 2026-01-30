/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosingletonclase;
import java.util.*;

public class EjercicioSingletonClase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ModuloDeposito deposito = new ModuloDeposito();
        ModuloRetiro retiro = new ModuloRetiro();
        ModuloSaldo saldo = new ModuloSaldo();
        
        int op;
        double monto, montoretiro, montodeposito;
        
        do{
            System.out.println("CAJERO AUTOMATICO");
            System.out.println("Opción 1: Ingresar Saldo Actual");
            System.out.println("Opción 2: Realizar Retiro");
            System.out.println("Opción 3: Realizar Deposito");
            System.out.println("Opción 4: Ver su saldo actual");
            System.out.println("Opción 5: Salir");
            op = sc.nextInt(); sc.nextLine();
            switch(op){
                case 1: 
                    System.out.println("Ingrese su saldo actual: ");
                    monto = sc.nextDouble(); 
                    saldo.saldo(monto);
                    break;
                case 2: 
                    System.out.println("Ingrese el valor de su retiro: ");
                    montoretiro = sc.nextDouble();
                    retiro.retiro(montoretiro);
                    break;
                case 3:
                    System.out.println("Ingrese el valor de su deposito: ");
                    montodeposito = sc.nextDouble();
                    deposito.depositar(montodeposito);
                    break;
                case 4: 
                    Cajero caja = Cajero.getInstancia();
                    System.out.println("Saldo de su cuenta: " + caja.getSaldoActual());
                    break;
                case 5: break;
                default: System.out.println("Opción no válida");      
            }
        }while(op!=5);
        sc.close();
    }
}
