/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2.pkgfinal.pkg12;

/**
 *
 * @author ririo
 */
public class EVA2Final12 {
    final static int VALOR = 100;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Valor: " + VALOR);
        //VALOR = 200; NO SE PUEDE MODIFICAR
        Docente docente = new Docente();
        
    }
    
}

class Persona{}
class Empleado extends Persona{}
final class Docente extends Empleado{}//HASTA AQUÏ LLEGA LA HERENCIA
//class DocenteKinder extends Docente{} //NO SE PUEDE HEREDAR