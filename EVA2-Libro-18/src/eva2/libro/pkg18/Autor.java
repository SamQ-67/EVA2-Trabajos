/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2.libro.pkg18;

/**
 *
 * @author ririo
 */
public class Autor {
    private String nombre;
    private String nacionalidad;
    
    public Autor(){
        this.nombre = "-Sin dato-";
        this.nacionalidad = "-Sin dato-";
    }
    public Autor(String nombre, String nacionalidad){
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNacionalidad(){
        return this.nacionalidad;
    }
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }
    
    
}
