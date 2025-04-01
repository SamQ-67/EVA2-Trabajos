/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2.polimorfismo.pkg19;

/**
 *
 * @author ririo
 */
public class Cliente extends Persona{
    //Razon social
    private String rfc;

    public Cliente(){
        super();
        this.rfc = "-Sin dato-";
    }

    public Cliente(String nombre, String Apellido, int edad, String rfc) {
        super(nombre, Apellido, edad);
        this.rfc = rfc;
    }
    
    public String getRFC() {
        return rfc;
    }

    public void setRFC(String rfc) {
        this.rfc = rfc;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("RFC: "+rfc);
    }
}
