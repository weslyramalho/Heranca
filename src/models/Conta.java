package models;

public abstract class Conta {
    private int numero;
    private int agencia;
    protected double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public Conta(int numero, int agencia, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo(){
        return this.saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", agencia=" + agencia +
                ", saldo=" + saldo +
                '}';
    }
    public boolean sacar(double quantia){
        return false;
    }

    public void depositar(double quantia){
        this.saldo += quantia;
    }
}
