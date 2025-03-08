/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2.herencia.apa.pkg4;

/**
 *
 * @author ririo
 */
public class Libro extends FichaAPA{
    private String editorial;
    
    public Libro(){
        super();
        this.editorial = "Sin editorial";
    }
    public Libro(String autor, String titulo, int year, String editorial){
        super(autor, titulo, year);
        this.editorial = editorial;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    
}
