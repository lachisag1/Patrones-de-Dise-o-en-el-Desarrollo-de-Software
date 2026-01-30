/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicocomposite1;

/**
 *
 * @author PC
 */
public class Papas implements IPedido{

    @Override
    public String getNombre() {
        return "Papas";
    }

    @Override
    public double getPrecio() {
        return 1.00;
    }
}
