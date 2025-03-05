/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2.herencia.pkg2;

/**
 *
 * @author ririo
 */
public class Empleado {
    private String nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private int edad;
    private String rfc;
    private int claveEmpleado;
    
    public Empleado(){
        nombre = "Sin dato";
        ApellidoPaterno = "Sin dato";
        ApellidoMaterno = "Sin dato";
        edad = 0;
        rfc = "Sin dato";
        claveEmpleado = 0;
    }
    
    public Empleado(String nombre, String ApellidoPaterno, String ApellidoMaterno, int edad, String rfc, int claveEmpleado){
        this.nombre = nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.edad = edad;
        this.rfc = rfc;
        this.claveEmpleado = claveEmpleado;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellidoPaterno(){
        return this.ApellidoPaterno;
    }
    public void setApellidoPaterno(String ApellidoPaterno){
        this.ApellidoPaterno = ApellidoPaterno;
    }
    public String getApellidoMaterno(){
        return this.ApellidoMaterno;
    }
    public void setApellidoMaterno(String ApellidoMaterno){
        this.ApellidoMaterno = ApellidoMaterno;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getRFC(){
        return this.rfc;
    }
    public void setRFC(String rfc){
        this.rfc = rfc;
    }
    public int getClaveEmpleado(){
        return this.claveEmpleado;
    }
    public void setClaveEmpleado(int claveEmpleado){
        this.claveEmpleado = claveEmpleado;
    }
    
}
