/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2.herencia.apa.pkg4;

/**
 *
 * @author ririo
 */
public class Grabacion extends FichaAPA{
    private String interprete;

    public Grabacion(){
        super();//Llamando al constructor de la superclase
        this.interprete = "Sin interprete";
    }
    public Grabacion(String autor, String titulo, int year, String interprete){
        super(autor, titulo, year);
        this.interprete = interprete;
    }
    
    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }
    
    
}
