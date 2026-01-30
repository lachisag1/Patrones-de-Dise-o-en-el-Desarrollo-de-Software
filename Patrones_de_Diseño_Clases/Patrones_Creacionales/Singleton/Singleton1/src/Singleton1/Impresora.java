/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton1;

/**
 *
 * @author PC
 */
public class Impresora {
    private int totalimpresiones;
    
    // 1.- Definir una variable estática
    private static Impresora instancia;
    
    //2.- Crear un constructor privado
    private Impresora() {
        System.out.println("Impresora Lista para imprimir");
    }
    
    //3.- Agregar un método público estático
    public static Impresora getInstancia(){
        
        if(instancia == null){
            instancia = new Impresora();
        }
        return instancia;
    }
    
    //Método para imprimir
    public void imprimir(String documento){
        totalimpresiones = totalimpresiones + 1;
        System.out.println("Documento impreso: " + documento);
    }
    
    public int getTotalImpresiones(){
        
        return totalimpresiones;
    }
}
