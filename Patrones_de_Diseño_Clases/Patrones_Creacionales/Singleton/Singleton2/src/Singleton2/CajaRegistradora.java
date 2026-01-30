/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton2;

/**
 *
 * @author labesp
 */
public class CajaRegistradora {
    private double totalVentas;
    private double totalFacturas;
    
    // 1.- Definir una variable estática
    private static CajaRegistradora instancia;
    
    //2.- Crear un constructor privado
    private CajaRegistradora() {
    totalVentas = 0.0;
        System.out.println("Caja registradora lista");
    }
    
    //3.- Agregar un método público estático
    public static CajaRegistradora getInstancia(){
        if(instancia == null){
            instancia = new CajaRegistradora();
        }
        return instancia;
    }
    
    public void registrarVenta(double monto){
        totalVentas = totalVentas + monto;
        System.out.println("Venta Registrada! " + monto);
    }
    
    public void registrarFactura(double monto){
        totalFacturas = totalFacturas + monto;
        System.out.println("Venta Registrada! " + monto);
    }
    
    public double getTotalVentas(){
        return totalVentas;
    }
    
    public double getTotalFacturas(){
        return totalFacturas;
    }
    
    public double getTotal(){
        return totalFacturas + totalVentas;
    }
}
