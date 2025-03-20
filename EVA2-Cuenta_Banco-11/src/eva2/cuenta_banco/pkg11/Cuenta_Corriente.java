/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2.cuenta_banco.pkg11;

/**
 *
 * @author ririo
 */
public class Cuenta_Corriente extends Cuenta_General{
    private double Saldo_d;

    public Cuenta_Corriente(double saldo, double Saldo_d) {
        super(saldo);
        this.Saldo_d = Saldo_d;
    }

    public double getSaldo_d() {
        return Saldo_d;
    }

    public void setSaldo_d(double Saldo_d) {
        this.Saldo_d = Saldo_d;
    }
    
    @Override
    public void agregarSaldo(double cantidad) {
        Saldo_d += cantidad;
    }
    
    
    
    @Override
    public void mostrarSaldo(){
        System.out.println("Saldo de cuenta: " + Saldo_d);
    }

    @Override
    public double quitarSaldo(double cantidad) {
        if (cantidad <= Saldo_d) {
            Saldo_d -= cantidad;
        } else {
            System.out.println("-Dinero insuficiente-");
        }
        return Saldo_d;
    }
    
}
