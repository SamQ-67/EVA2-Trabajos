/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2.override.pkg8;

/**
 *
 * @author ririo
 */
public class EVA2Override8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro lib = new Libro("Guadalupe", "El libro de sofia", 2005, "La luz de plata");
        System.out.println(lib);
        System.out.println("----------Grabacion----------");
        Grabacion grab = new Grabacion("Fantasma", "Le' Monseiur", 2005, "Stromae");
        System.out.println(grab);
                
    }
    
}
