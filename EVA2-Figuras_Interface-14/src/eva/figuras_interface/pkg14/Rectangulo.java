/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva.figuras_interface.pkg14;

/**
 *
 * @author ririo
 */
public class Rectangulo implements Figura, MostrarDatos{
    private double base;
    private double altura;
    
    public Rectangulo(){
        this.base = 0.0;
        this.altura = 0.0;
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    
    @Override
    public double calcularArea(){
        return base * altura;
    }
    
    @Override
    public double calcularPerimetro(){
        return (2 * (base + altura));
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Rectangulo:");
        System.out.println("Base: " + base);
        System.out.println("Altura:" + altura);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }
    
}
