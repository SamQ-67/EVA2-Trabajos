/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2.herencia.apa.pkg4;

/**
 *
 * @author ririo
 */
public class EVA2HerenciaAPA4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("----------------------");
        FichaAPA prov = new FichaAPA();
        Libro lib = new Libro();
        System.out.println("----/Libro/-------");
        prov.setTitulo("La luna");
        prov.setYear(2005);
        lib.setEditorial("La mil lunas");
        System.out.println("Autor: "+ prov.getAutor());
        System.out.println("Titulo  : "+ prov.getTitulo());
        System.out.println("Lanzamiento: "+ prov.getYear());
        System.out.println("Editorial: "+ lib.getEditorial());
        
        Grabacion grabe = new Grabacion();
        System.out.println("------/Grabacion/---------");
        prov.setTitulo("Noche de verano");
        prov.setYear(2020);
        grabe.setInterprete("Stromae");
        System.out.println("Autor: "+ prov.getAutor());
        System.out.println("Titulo  : "+ prov.getTitulo());
        System.out.println("Lanzamiento: "+ prov.getYear());
        System.out.println("Interprete  : "+ grabe.getInterprete());
        
        System.out.println("--------/Enciclopedia/----------");
        Enciclopedia enci = new Enciclopedia();
        enci.setAutor("Guadalupo");
        System.out.println("Autor: "+enci.getAutor());
        System.out.println("Titulo: "+enci.getTitulo());
        System.out.println("Lanzamiento: "+enci.getYear());
        System.out.println("Editorial: "+enci.getEditorial());
    }
    
}
