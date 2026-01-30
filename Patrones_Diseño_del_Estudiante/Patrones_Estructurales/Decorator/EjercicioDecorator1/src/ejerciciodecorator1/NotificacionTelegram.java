/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciodecorator2;

/**
 *
 * @author PC
 */
public class NotificacionTelegram extends NotificacionDecorator{

    public NotificacionTelegram(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public String getMensaje() {
        return notificacion.getMensaje() + " + enviado por Telegram";
    }

    @Override
    public double getNumeroNotificaciones() {
        return notificacion.getNumeroNotificaciones() + 1;
    }
}
