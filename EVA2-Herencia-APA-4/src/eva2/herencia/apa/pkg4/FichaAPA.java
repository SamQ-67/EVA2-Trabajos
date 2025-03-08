/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2.herencia.apa.pkg4;

/**
 *
 * @author ririo
 */
public class FichaAPA {
    private String autor;
    private String titulo;
    private int year;
    
    public FichaAPA(){
        this.autor = "Sin datos (APA)";
        this.titulo = "Sin dato (APA)";
        this.year = 0000;
    }
    public FichaAPA(String autor, String titulo, int year){
        this.autor = autor;
        this.titulo = titulo;
        this.year = year;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
}
