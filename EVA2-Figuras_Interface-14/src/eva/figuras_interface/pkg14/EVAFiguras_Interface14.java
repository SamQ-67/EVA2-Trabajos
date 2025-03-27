/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva.figuras_interface.pkg14;

/**
 *
 * @author ririo
 */
public class EVAFiguras_Interface14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("---Circulo---");
        Circulo circ = new Circulo(4);
        circ.mostrarDatos();
        System.out.println("---Rectangulo---");
        Rectangulo rect = new Rectangulo(4, 5);
        rect.mostrarDatos();
    }
    
}
