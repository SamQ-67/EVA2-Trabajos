/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2.instance_of.pkg22;

/**
 *
 * @author ririo
 */
public class EVA2Instance_Of22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gato gato = new Gato();
        Serpiente serp = new Serpiente();
        imprimir(gato);
        imprimir(serp);
    }
    
    public static void imprimir(Animal animal){
        animal.respiraOxigeno();
        if(animal instanceof Gato){
            System.out.println("Objeto de tipo Gato");
        }else if(animal instanceof Serpiente){
            System.out.println("objeto de tipo Serpiente");
        }
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