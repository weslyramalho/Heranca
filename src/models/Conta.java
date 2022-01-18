package models;

public abstract class Conta {
    private int id;
    private int numero;
    protected double saldo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public Conta(int id, int numero, double saldo) {
        this.id = id;
        this.numero = numero;
        this.saldo = saldo;
    }


    public double getSaldo(){
        return this.saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", id=" + id +
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
