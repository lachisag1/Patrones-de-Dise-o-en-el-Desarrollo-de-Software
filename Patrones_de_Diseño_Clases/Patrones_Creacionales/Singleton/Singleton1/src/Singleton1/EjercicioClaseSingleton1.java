/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Singleton1;

/**
 *
 * @author PC
 */
public class EjercicioClaseSingleton1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Impresora usuario1 = Impresora.getInstancia();
        Impresora usuario2 = Impresora.getInstancia();
        Impresora usuario3 = Impresora.getInstancia();
        
        usuario1.imprimir("Deber de POO");
        usuario1.imprimir("Deber de física");
        usuario2.imprimir("Ejercicios de fisica");
        usuario3.imprimir("Reporte de Ceros");
        
        System.out.println("Total de impresiones: " + usuario1.getTotalImpresiones());
        System.out.println("Total de impresiones: " + usuario2.getTotalImpresiones());
        
        //Comprobar instancia
        System.out.println(usuario1==usuario2);
    }
    
}
