/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2.interfaces.pkg13;

/**
 *
 * @author ririo
 */
public class Empleado extends Persona implements MostrarDatos{
    private String clave;
    
    public Empleado(){
        super();
        this.clave = "-Sin clave";
    }
    
    public Empleado(String nombre, String apellidos, String clave) {
        super(nombre, apellidos);
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Calve: " + clave);
    }
    
    
}
