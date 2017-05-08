/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

/**
 *
 * @author artur
 */
public class Botonera {
    
    boolean alarmActive;
    boolean setHr;
    boolean setAlarma;
    /**
     * Método que marca la alarma como encendida o apagada
     * This method that changes the alarm as on
     */
    public void alarmON(){
        alarmActive = true;
    }
    /**
     * Método que marca la alarma como apagada
     * This method that changes the alarm as off
     */
    public void alarmOFF(){
     alarmActive = false;   
    }
    /**
     * Método que se usa para configurar la hora
     * This method uses to set the alarm
     */
    public void configHr(){
        
    }
    /**
     * Método que se usa para configurar la alarma
     * This method that uses to set the hour
     */
    public void configAlarm(){
        
    }
    /**
     * Método que se usa para parar la alarma
     * This method was uses to stop the alarm
     */
    public void stopAlarm(){
        
    }
    /**
     * Método para subir hora
     * This method that uses to up the hour
     */
    public void plusHr(){
        
    }
    /**
     * Método que se usa para subir los minutos
     * This method that uses to up the minutes
     */
    public void plusMin() {
        
    }
}
