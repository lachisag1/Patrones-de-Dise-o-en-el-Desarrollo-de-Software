/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_strategy1;

/**
 *
 * @author PC
 */
public class Envio {
    private MetodoEnvio metodo;
    
    public void setMetodoPago(MetodoEnvio metodo){
        this.metodo = metodo;
    }
    
    public double calcularTotal(double monto){
        return metodo.costoEnvio(monto);
    }
}
