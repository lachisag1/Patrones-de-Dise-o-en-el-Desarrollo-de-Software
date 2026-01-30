/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciofactory1;

/**
 *
 * @author PC
 */
public class DescuentosFactory {
    public static Descuentos crearDescuento(int tipo){
        switch(tipo){
            case 1: return new ClienteFrecuente();
            case 2: return new ClienteRegular();
            case 3: return new ClienteOcasional();
            case 4: return new ClientePrimerizo();
            default: System.out.println("Descuento no disponible");
            return null;
        }
    }
}
