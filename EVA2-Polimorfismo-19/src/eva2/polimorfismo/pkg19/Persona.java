/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2.polimorfismo.pkg19;

/**
 *
 * @author ririo
 */
public class Persona {
    private String nombre;
    private String Apellido;
    private int edad;

    public Persona(){
        nombre = "Sin dato";
        Apellido = "Sin dato";
        edad = 0;
    }
    public Persona(String nombre, String Apellido, int edad){
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.edad = edad;
    }  
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + Apellido);
        System.out.println("Edad: " + edad);
    }
}
