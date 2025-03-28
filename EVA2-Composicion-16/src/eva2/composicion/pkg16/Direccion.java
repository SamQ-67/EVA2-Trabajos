/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2.composicion.pkg16;

/**
 *
 * @author ririo
 */
public class Direccion {
    private String calle;
    private String colonia;
    private String cp;
    private String ciudad;
    private String estado;
    
    
    public Direccion(){
        this.calle = "-Sin dato-";
        this.colonia = "-Sin dato-";
        this.cp = "-Sin dato-";
        this.ciudad = "-Sin dato-";
        this.estado = "-Sin dato-";
    }
    public Direccion(String calle, String colonia, String cp, String ciudad, String estado) {
        this.calle = calle;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
