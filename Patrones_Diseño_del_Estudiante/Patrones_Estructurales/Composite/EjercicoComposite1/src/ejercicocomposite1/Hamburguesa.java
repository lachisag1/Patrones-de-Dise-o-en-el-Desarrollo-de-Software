/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicocomposite1;

/**
 *
 * @author PC
 */
public class Hamburguesa implements IPedido{

    @Override
    public String getNombre() {
        return "Hamburguesa";
    }

    @Override
    public double getPrecio() {
        return 2.00;
    }
}
