/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2.cuenta_banco.pkg11;

/**
 *
 * @author ririo
 */
public abstract class Cuenta_General {
    private double saldo;

    public Cuenta_General(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void agregarSaldo(double cantidad) {
        saldo += cantidad;
    }

    public abstract double quitarSaldo(double cantidad);
    
    public void mostrarSaldo(){
        System.out.println("Saldo de cuenta: " + saldo);
    }

}
