/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2.clases_abstractas.pkg9;

/**
 *
 * @author ririo
 */
public class EVA2Clases_Abstractas9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cli = new Cliente("Sebas", "Perez", 45, "Social");
        cli.imprimirDatos();
        Empleado emp = new Empleado("Sam", "Perez", 45, 500);
        emp.imprimirDatos();
    }
    
}
