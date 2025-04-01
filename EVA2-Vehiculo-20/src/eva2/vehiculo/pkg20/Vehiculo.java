/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2.vehiculo.pkg20;

/**
 *
 * @author ririo
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private String year;
    private Motor motor;
    
    public Vehiculo() {
        this.marca = "-Sin dato-";
        this.modelo = "-Sin dato-";
        this.year = "-Sin dato-";
        this.motor = null;//TODAVIA NO LO TENEMOS
    }
    public Vehiculo(String marca, String modelo, String year, Motor motor) {
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    public String toString(){
        String cade = "Marca: "+marca+ "\n" + 
                "Modelo: "+modelo+"\n"+
                "Año: "+year+"\n"+
                "Motor: "+motor.tipoMotor();
        return cade;
    }
    
}
