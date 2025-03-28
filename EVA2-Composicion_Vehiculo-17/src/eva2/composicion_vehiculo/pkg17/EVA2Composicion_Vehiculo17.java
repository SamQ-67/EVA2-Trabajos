/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2.composicion_vehiculo.pkg17;

/**
 *
 * @author ririo
 */
public class EVA2Composicion_Vehiculo17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo veh = new Vehiculo();
        System.out.println(veh);
        veh.setMarca("Chevrolet");
        veh.setModelo("Mustang");
        veh.setYear(2006);
        Motor motor = new Motor(0, 500);
        veh.setMotor(motor);
        System.out.println(veh);
    }
    
}
