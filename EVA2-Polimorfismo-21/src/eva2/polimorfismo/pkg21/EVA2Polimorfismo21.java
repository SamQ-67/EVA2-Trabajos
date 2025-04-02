/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2.polimorfismo.pkg21;

/**
 *
 * @author ririo
 */
public class EVA2Polimorfismo21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Serpiente serp = new Serpiente();
        serp.respiraOxigeno();
        serp.tenerSangreFria();
        serp.seArrastra();
        System.out.println("---GATO---");
        Gato gato = new Gato();
        gato.respiraOxigeno();
        gato.tenerPelo();
        gato.tenerSangreCaliente();
        gato.tenerGarrasRetractiles();
        //POLIMORFISMO
        System.out.println("POLIMORFISMO:");
        Reptil reptil = new Serpiente();
        reptil.respiraOxigeno();
        reptil.tenerSangreFria();
        //COMO RECUPERAR EL OBJETO ORIGINAL
        Serpiente objSerp = (Serpiente)reptil;//CASTING
        objSerp.respiraOxigeno();
        objSerp.tenerSangreFria();
        objSerp.seArrastra();
        
        
        Animal animal2 = new Serpiente();
        System.out.println("POLIMORFISMO FALLIDO");
        //Serpiente serpiente2 = new Animal(); //Animal ES UNA serpiente
        Object object = new Serpiente();
        
    }
    
}

class Animal{
    public Animal(){
        System.out.println("Animal");
    }
    public void respiraOxigeno(){
        System.out.println("Respira oxigeno");
    }
}
class Mamifero extends Animal{
    public Mamifero(){
        System.out.println("Mamifero");
    }
    public void tenerPelo(){
        System.out.println("Tener pelo");
    }
    public void tenerSangreCaliente(){
        System.out.println("Tener sangre caliente");
    }
}
class Reptil extends Animal{
    public Reptil(){
        System.out.println("Reptil");
    }
    public void tenerSangreFria(){
        System.out.println("Tener sangre fria");
    }
}
class Gato extends Mamifero{
    public Gato(){
        System.out.println("Gato");
    }
    public void tenerGarrasRetractiles(){
        System.out.println("Tener garras retractiles");
    }
}
class Serpiente extends Reptil{
    public Serpiente(){
        System.out.println("Serpiente");
    }
    public void seArrastra(){
        System.out.println("Se arrastra");
    }
}