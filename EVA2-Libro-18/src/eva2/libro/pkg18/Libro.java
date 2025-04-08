/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2.libro.pkg18;

/**
 *
 * @author ririo
 */
public class Libro extends MaterialBibliografico{
    private String genero;
    private String Autor;
    
    public Libro(){
        this.genero = "-Sin dato-";
        this.Autor = "-Sin dato-";
    }
    public Libro(String genero, String autor){
        this.genero = genero;
        this.Autor = autor;
    }
    
    public String getGenero(){
        return this.genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getAutor(){
        return this.Autor;
    }
    public void setAutor(String autor){
        this.Autor = autor;
    }
    
    
}
