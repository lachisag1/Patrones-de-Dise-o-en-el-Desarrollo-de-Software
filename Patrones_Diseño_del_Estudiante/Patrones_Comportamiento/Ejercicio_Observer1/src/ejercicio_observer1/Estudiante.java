/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_observer1;

/**
 *
 * @author PC
 */
public class Estudiante implements Observer{
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    @Override
    public void actualizar(String aviso) {
        System.out.println("ATENCION " + nombre + " recibió el aviso: " + aviso);
    }
}
