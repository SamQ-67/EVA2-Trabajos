/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2.clases_abstractas.pkg9;

/**
 *
 * @author ririo
 */
public class Cliente extends Persona{
    private String tipoPersona;

    public Cliente() {
        this.tipoPersona = "-No hay dato-";
    }

    public Cliente(String nombre, String apellido, int edad, String tipoPersona) {
        super(nombre, apellido, edad);
        this.tipoPersona = tipoPersona;
    }
    
    

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("-----------Cliente-----------");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellidos: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Tipo de persona: " + tipoPersona);
    }
    
    
    
    
}
