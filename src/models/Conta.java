package models;

public abstract class Conta {
    private int numero;
    protected double saldo;

    private Cliente cliente;

    public Conta(int numero, double saldo, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
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
