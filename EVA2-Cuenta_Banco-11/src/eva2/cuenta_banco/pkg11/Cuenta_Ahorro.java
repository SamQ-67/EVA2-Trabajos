/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2.cuenta_banco.pkg11;

/**
 *
 * @author ririo
 */
public class Cuenta_Ahorro extends Cuenta_General{
    private double ahorro;

    public Cuenta_Ahorro(double ahorro, double saldo) {
        super(saldo);
        this.ahorro = ahorro;
    }

    public double getAhorro() {
        return ahorro;
    }

    public void setAhorro(double ahorro) {
        this.ahorro = ahorro;
    }
    
    
    @Override
    public void agregarSaldo(double cantidad) {
        double saldoActual = getSaldo();
        setSaldo(saldoActual + cantidad);
    }
    
    @Override
    public void mostrarSaldo(){
        System.out.println("Saldo de cuenta: " + getSaldo());
    }

    @Override
    public double quitarSaldo(double cantidad) {
        double saldoActual = getSaldo();
        if (cantidad <= saldoActual) {
            setSaldo(saldoActual - cantidad);
        } else {
            System.out.println("Saldo insuficiente");
        }
        return getSaldo();
    }  
    
}
