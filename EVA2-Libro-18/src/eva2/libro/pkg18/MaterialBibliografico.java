/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2.libro.pkg18;

/**
 *
 * @author ririo
 */
public class MaterialBibliografico {
    private String titulo;
    private int Lanzamiento;
    
    public MaterialBibliografico(){
        super();
        this.titulo = "-Sin dato-";
        this.Lanzamiento = 0;
    }
    public MaterialBibliografico(String titulo, int MAterialBibliografico){
        this.titulo = titulo;
        this.Lanzamiento = Lanzamiento;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public int getLanzamiento(){
        return this.Lanzamiento;
    }
    public void setLanzamiento(int lanzamiento){
        this.Lanzamiento = lanzamiento;
    }
    
    
    
}
