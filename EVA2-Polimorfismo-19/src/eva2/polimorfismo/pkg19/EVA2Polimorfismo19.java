/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2.polimorfismo.pkg19;

/**
 *
 * @author ririo
 */
public class EVA2Polimorfismo19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado[] emps = new Empleado[5];
        emps[0] = new Empleado("Samuel", "Perez", 19, 1);
        emps[1] = new Empleado("Fernando", "XXXX", 69, 4);
        emps[2] = new Empleado("Raul", "XXXX", 39, 3);
        emps[3] = new Empleado("Emiliano", "XXXX", 59, 2);
        emps[4] = new Empleado("Gael", "XXXX", 69, 0);
        
        Cliente[] cli = new Cliente[5];
        cli[0] = new Cliente("Samuel", "XXXX", 69, "dfdfss");
        cli[1] = new Cliente("Emilio", "XXXX", 69, "dfdfss");
        cli[2] = new Cliente("Sarahi", "XXXX", 69, "dfdfss");
        cli[3] = new Cliente("Pocket", "XXXX", 69, "dfdfss");
        cli[4] = new Cliente("GUS", "XXXX", 69, "dfdfss");
        
        System.out.println("REPORTE DE EMPLEADOS-------------------");
        generarReportes(emps);
        //for (int i = 0; i<5; i++){
            //emps[i].imprimirDatos();
        //}
        System.out.println("REPORTE DE CLIENTES-------------------");
        generarReportes(cli);
        //for (int i = 0; i<5; i++){
            //cli[i].imprimirDatos();
        //}
    }
    
    public static void generarReportes(Persona[] personas){
        for (int i = 0; i<5; i++){
            personas[i].imprimirDatos();
        }
    }
    
}
