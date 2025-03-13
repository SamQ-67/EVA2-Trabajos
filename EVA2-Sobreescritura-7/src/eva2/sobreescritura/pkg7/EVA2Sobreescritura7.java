/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2.sobreescritura.pkg7;

/**
 *
 * @author ririo
 */
public class EVA2Sobreescritura7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("---------Empleado Base------------");
        EmpleadoBase empBase = new EmpleadoBase("Samuel", "Quezada", 1000, 1, 0.1);
        System.out.println(empBase);
        System.out.println("----------Empleado Tmporal----------");
        EmpleadoTemporal empTempo = new EmpleadoTemporal("Sebastian", "Perez", 500, "hggLGh122", 8.5);
        System.out.println(empTempo);
    }
    
}
