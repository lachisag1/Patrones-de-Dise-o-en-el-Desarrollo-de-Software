/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author labesp
 */
public class JugueteFactory {
    public static Juguete crearJuguete(int tipo){
        switch(tipo){
            case 1: return new Peluche();
            case 2: return new Carrito();
            case 3: return new Barbie();
            default: System.out.println("Juguete no disponible");
            return null;
        }
    }
}
