/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2.clases_abstractas.pkg9;

/**
 *
 * @author ririo
 */
public class Empleado extends Persona{
    private double salario;

    public Empleado() {
        this.salario = 0.0;
    }

    public Empleado(String nombre, String apellido, int edad, double salario) {
        super(nombre, apellido, edad);
        this.salario = salario;
    }
    
    

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("----------Empleado--------------");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Salario: " + salario);
    }
    
    
    
}
