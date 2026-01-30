/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composite1;

/**
 *
 * @author PC
 */
public class Composite1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Archivo a1 = new Archivo("Titi me pregunto.mp3" , 4000);
        Archivo a2 = new Archivo("Amor prohibido.mp3" , 5000);
        Archivo a3 = new Archivo("Mi Foto.jpg", 1000);
        
        //Carpeta principal
        Carpeta raiz = new Carpeta("Mi Play List");
        
        //Sub carpeta 
        Carpeta imagenes = new Carpeta("Imagenes");
        
        //Construccion del Árbol de Archivos
        
        raiz.agregar(a1);
        raiz.agregar(imagenes);
        raiz.agregar(a2);
        raiz.agregar(a3);
        
        raiz.mostrar();
        System.out.println("\nTamaño Total: " + raiz.getTamanio() + "Kb");
    }
    
}
