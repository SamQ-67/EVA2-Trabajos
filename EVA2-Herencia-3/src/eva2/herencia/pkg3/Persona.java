/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2.herencia.pkg3;

/**
 *
 * @author ririo
 */
public class Persona {
    private String nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private int edad;
    private String rfc;

    public Persona(){
        nombre = "Sin dato";
        ApellidoPaterno = "Sin dato";
        ApellidoMaterno = "Sin dato";
        edad = 0;
        rfc = "Sin dato";
    }
    public Persona(String nombre, String ApellidoPaterno, String ApellidoMaterno, int edad, String rfc){
        this.nombre = nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.edad = edad;
        this.rfc = rfc;
    }  
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    
}
