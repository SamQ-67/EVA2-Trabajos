/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2.composicion.pkg16;

/**
 *
 * @author ririo
 */
public class Cliente {
    private String nombre;
    private String apellidos;
    private int edad;
    private Direccion direccion;//CLIENTE HAS A (TIENE UNA) DIRECCION
    
    
    public Cliente(){
        this.nombre = "-Sin dato-";
        this.apellidos = "-Sin dato-";
        this.edad = 0;
        this.direccion = new Direccion();
    }
    public Cliente(String nombre, String apellidos, int edad, String calle, String colonia, String cp, String ciudad, String estado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direccion = new Direccion(calle, colonia, cp, ciudad, estado);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString(){
        return "Datos del cliente: \n" + 
                "Nombre: " + nombre + "\n" + 
                "Apellido: " + apellidos + "\n" +
                "Edad: " + edad + "\n" +
                "Calle: " + direccion.getCalle() + "\n" +
                "Colonia: "+direccion.getColonia()+"\n" +
                "CP: "+direccion.getCp()+"\n"+
                "Ciudad: "+direccion.getCiudad()+"\n"+
                "Estado: "+direccion.getEstado();
    }
    
    
}
