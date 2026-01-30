/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adapter1;

/**
 *
 * @author labesp
 */
public class Adapter1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Reproductor reproduce = new ReproductorAdapter(new ReproductorMP4());
        reproduce.reproducir("Video Ecuador");
    }
}
