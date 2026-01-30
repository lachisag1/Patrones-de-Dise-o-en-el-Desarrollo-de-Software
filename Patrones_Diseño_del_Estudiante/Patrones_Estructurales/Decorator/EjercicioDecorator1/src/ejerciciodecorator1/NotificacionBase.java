/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciodecorator2;

/**
 *
 * @author PC
 */
public class NotificacionBase implements Notificacion {

    @Override
    public String getMensaje() {
        return "Mensaje enviado por SMS";
    }

    @Override
    public double getNumeroNotificaciones() {
        return 1;
    }
    
}
