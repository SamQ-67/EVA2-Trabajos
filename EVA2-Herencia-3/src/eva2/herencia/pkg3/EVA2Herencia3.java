/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2.herencia.pkg3;

/**
 *
 * @author ririo
 */
public class EVA2Herencia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado = new Empleado();
        empleado.setNombre("juuan");
        System.out.println("Nombre: " + empleado.getNombre());
        empleado.setClaveEmpleado(37465);
        //PROVEEDOR
        System.out.println("----------------------");
        Proveedor prov = new Proveedor();
        prov.setNombre("Pepe");
        prov.setCreditto(false);
        System.out.println("Nombre: "+ prov.getNombre());
        System.out.println("Credito: "+ prov.isCreditto());
        System.out.println("--------------------");
        Cliente cli = new Cliente();
        cli.setNombre("Juna");
        cli.setRazon("Las Palomeras");
        System.out.println("Nombre: "+ cli.getNombre());
        System.out.println("Razon: "+ cli.getRazon());
        
    }
    
}
