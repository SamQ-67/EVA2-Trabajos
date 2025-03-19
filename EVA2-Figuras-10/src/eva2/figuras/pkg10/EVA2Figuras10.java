/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2.figuras.pkg10;

/**
 *
 * @author ririo
 */
public class EVA2Figuras10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo cir = new Circulo(100);
        System.out.println("-----Circulo-----");
        System.out.println("Area: " + cir.calcularArea());
        System.out.println("Perimetro: " + cir.calcularPerimetro());
        System.out.println("-----------------------------");
        System.out.println("-----Rectangulo-----");
        Rectangulo rect = new Rectangulo(100, 200);
        System.out.println("Area: " + rect.calcularArea());
        System.out.println("Perimetro: " + rect.calcularPerimetro());
    }
    
}
