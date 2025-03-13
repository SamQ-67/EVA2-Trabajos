/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2.sobreescritura.pkg7;

/**
 *
 * @author ririo
 */
public class EmpleadoTemporal extends Empleado{
    private String Num_Contrato;
    private double horas;
    
    public EmpleadoTemporal(){
        super();
        this.Num_Contrato = "-------";
        this.horas = 0.0;
    }
    public EmpleadoTemporal(String nombre, String apellidos, double salario, String Num_Contrato, double horas){
        super(nombre, apellidos, salario);
        this.Num_Contrato = Num_Contrato;
        this.horas = horas;
    }

    public String getNum_Contrato() {
        return Num_Contrato;
    }

    public void setNum_Contrato(String Num_Contrato) {
        this.Num_Contrato = Num_Contrato;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
    
    @Override
    public double calcularSalario(){
        return super.getSalario() * horas;
    }
    
    @Override
    public String toString(){
        String cade = super.toString() + "\n";
        cade = cade + "Contrato: " + Num_Contrato + "\n" +
                "Horas: " + horas + "\n" +
                "Salario real: " + calcularSalario();
        return cade; 
    }

}
