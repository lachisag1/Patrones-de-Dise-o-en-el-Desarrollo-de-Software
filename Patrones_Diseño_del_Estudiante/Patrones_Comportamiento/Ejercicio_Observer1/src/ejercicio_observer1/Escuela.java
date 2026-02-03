/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_observer1;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author PC
 */
public class Escuela {
    private List<Estudiante> estudiantes = new ArrayList<>();

    public void suscribir(Estudiante e) {
        estudiantes.add(e);
        System.out.println(e.getNombre() + " se ha registrado");
    }

    public void publicarAviso(String aviso) {
        System.out.println("Aviso publicado: " + aviso);
        notificar(aviso);
    }

    public void notificar(String aviso) {
        for (Estudiante e : estudiantes) {
            e.actualizar(aviso);
        }
    }
}
