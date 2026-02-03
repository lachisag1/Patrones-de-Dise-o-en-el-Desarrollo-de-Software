/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_strategy1;

/**
 *
 * @author PC
 */
public class EnvioEstandar implements MetodoEnvio {

    @Override
    public double costoEnvio(double monto) {
        return 1;
    }
}
