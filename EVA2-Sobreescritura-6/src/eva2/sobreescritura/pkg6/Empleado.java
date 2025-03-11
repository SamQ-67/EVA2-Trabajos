/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2.sobreescritura.pkg6;

/**
 *
 * @author ririo
 */
public class Empleado extends Persona{
    private int clave; 
    
public Empleado(){
    super();
    this.clave = 0;
}
public Empleado(String nombre, String apellidos, int edad, int clave){
    super(nombre, apellidos, edad);
    this.clave = clave;
}

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }
    
    @Override
    public void imprimirDatos(){
        System.out.println("Clave: " + clave);
        super.imprimirDatos();
    }

}


