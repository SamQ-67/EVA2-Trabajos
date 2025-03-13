/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2.sobreescritura.pkg7;

/**
 *
 * @author ririo
 */
public class EmpleadoBase extends Empleado{
    private int Num_Empleado;
    private double bono;
    
    public EmpleadoBase(){
        super();
        this.Num_Empleado = 0;
        this.bono = 0.0;
    }
    public EmpleadoBase(String nombre, String apellidos, double salario, int Num_Empleado, double bono){
        super(nombre, apellidos, salario);
        this.Num_Empleado = Num_Empleado;
        this.bono = bono;
    }

    public int getNum_Empleado() {
        return Num_Empleado;
    }

    public void setNum_Empleado(int Num_Empleado) {
        this.Num_Empleado = Num_Empleado;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
    
    @Override
    public double calcularSalario(){
        return super.calcularSalario() * (1 + bono);
    }
    
    @Override
    public String toString(){
        String cade = super.toString();
        cade = cade + "\nNumero de empleado: " + Num_Empleado + "\n" +
                "Bono: " + bono + "\n" +
                "Salario total: " + calcularSalario();
        return cade; 
    }
    
}
