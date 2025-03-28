/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2.composicion.pkg16;

/**
 *
 * @author ririo
 */
public class EVA2Composicion16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cli = new Cliente("Samuel", "Quezada", 19, "algun lugar", "Pereira", "31469", "Chihuahua", "Chihuhua");
        System.out.println(cli);
        Direccion direccion = new Direccion("Tampico", "Mexicali", "56469", "Camargo", "Chihuahua");
        cli.setDireccion(direccion);
        cli.setDireccion(direccion);
        System.out.println(cli);
    }
    
}
