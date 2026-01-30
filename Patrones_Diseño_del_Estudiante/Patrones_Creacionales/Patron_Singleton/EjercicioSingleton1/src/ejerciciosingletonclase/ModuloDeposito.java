/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosingletonclase;

/**
 *
 * @author PC
 */
public class ModuloDeposito {
    public void depositar(double monto){
        Cajero caja = Cajero.getInstancia();
        caja.registrarDeposito(monto);
    }
}
