/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicocomposite1;

/**
 *
 * @author PC
 */
public class Cola implements IPedido{

    @Override
    public String getNombre() {
        return "Cola";
    }

    @Override
    public double getPrecio() {
        return 0.75;
    }
}
