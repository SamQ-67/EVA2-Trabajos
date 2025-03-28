/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2.composicion_vehiculo.pkg17;

/**
 *
 * @author ririo
 */
public class Motor {
    private int tipoMotor;
    private int potencia;
    
    public Motor(){
        this.tipoMotor = 0;//Es la gasolina
        this.potencia = 0;
    }
    public Motor(int tipoMotor, int potencia) {
        this.tipoMotor = tipoMotor;
        this.potencia = potencia;
    }

    public int getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(int tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    
}
