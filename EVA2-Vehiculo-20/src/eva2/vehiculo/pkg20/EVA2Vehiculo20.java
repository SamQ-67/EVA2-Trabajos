/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2.vehiculo.pkg20;

/**
 *
 * @author ririo
 */
public class EVA2Vehiculo20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo veh = new Vehiculo();
        veh.setMarca("Ford");
        veh.setModelo("Lincon Navigator");
        veh.setYear("2005");
        //tipo de motor 
        MotorElectrico miMotor = new MotorElectrico();
        MotorDiesel Diesel = new MotorDiesel();
        MotorGasolina Gas = new MotorGasolina();
        veh.setMotor(Gas);
        System.out.println(veh);
    }
    
}
