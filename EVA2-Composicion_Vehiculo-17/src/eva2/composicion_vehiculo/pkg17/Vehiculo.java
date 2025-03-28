/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2.composicion_vehiculo.pkg17;

/**
 *
 * @author ririo
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int year;
    private Motor motor;
    
    public Vehiculo(){
        this.marca = "-Sin dato-";
        this.modelo = "-Sin dato-";
        this.year = 0;
        this.motor = new Motor();
    }
    public Vehiculo(String marca, String modelo, int year) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    
    // \n --> equivale al salto de linea (Enter)
    @Override
    public String toString(){
        return "Datos del vehiculo: \n" +
                "Marca: "+marca+"\n"+
                "Modelo: "+modelo+"\n"+
                "Año: "+year+"\n"+
                "Tipo de motor: "+ motor.getPotencia()+"\n"+
                "Potencia: "+motor.getPotencia();
    }
    
}
