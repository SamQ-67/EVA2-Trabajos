/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2.figuras.pkg10;

/**
 *
 * @author ririo
 */
public class Circulo extends Figura{
    private double radio;
    //CONSTRUCTORES
    //GET Y SET
    
    public Circulo(){
        this.radio = 0.0;
    }
    
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(radio, radio);
    }
    
    
    @Override
    public double calcularPerimetro(){
        return Math.PI * radio * 2;
    }
    
}
