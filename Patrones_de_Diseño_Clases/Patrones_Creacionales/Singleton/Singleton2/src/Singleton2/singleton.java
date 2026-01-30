/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Singleton2;
import java.util.*;
/**
 *
 * @author labesp
 */
public class singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ModuloVentas ventas = new ModuloVentas();
        ModuloFacturacion facturacion = new ModuloFacturacion();
        
        int op;
        double monto, montof;
        
        do{
            System.out.println("SISTEMA CAJA REGISTRADORA");
            System.out.println("Opción 1: Registrar Venta");
            System.out.println("Opción 2: Registrar Factura");
            System.out.println("Opción 3: Ver total ventas");
            System.out.println("Opción 4: Ver total facturas");
            System.out.println("Opción 5: Monto Total");
            System.out.println("Opción 6: Salir");
            op = sc.nextInt(); sc.nextLine();
            switch(op){
                case 1: 
                    System.out.println("Ingrese el monto de la venta: ");
                    monto = sc.nextDouble(); 
                    ventas.vender(monto);
                    facturacion.facturar(monto);
                    break;
                case 2: 
                    System.out.println("Total de venta con facturación: ");
                    montof = sc.nextDouble();
                    facturacion.facturar(montof);
                    //ventas.vender(monto);
                    break;
                case 3:
                    CajaRegistradora caja = CajaRegistradora.getInstancia();
                    System.out.println("Total acumulado en la caja: " + caja.getTotalVentas());
                    break;
                case 4: 
                    CajaRegistradora cajaf = CajaRegistradora.getInstancia();
                    System.out.println("Total facturado: " + cajaf.getTotalFacturas());
                    break;
                case 5: 
                    CajaRegistradora cajat = CajaRegistradora.getInstancia();
                    System.out.println("Total de la caja registradora: " + cajat.getTotal());
                    break;
                case 6: break;
                default: System.out.println("Opción no válida");      
            }
        }while(op!=6);
        sc.close();
    }
}
