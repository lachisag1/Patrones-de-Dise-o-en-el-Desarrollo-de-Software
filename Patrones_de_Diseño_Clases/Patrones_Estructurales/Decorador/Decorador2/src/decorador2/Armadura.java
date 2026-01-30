/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador2;

/**
 *
 * @author labesp
 */
public class Armadura extends PersonajeDecorador{

    public Armadura(Personaje personaje) {
        super(personaje);
    }

    @Override
    public String getDescripcion() {
        return personaje.getDescripcion() + " + Armadura";
    }

    @Override
    public int getDefensa() {
        return personaje.getDefensa() + 5;
    }

    @Override
    public int getAtaque() {
        return personaje.getAtaque() + 5;
    }
    
}
