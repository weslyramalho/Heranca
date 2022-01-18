package models;

public class ContaPoupanca extends Conta{
    private int diaAniversario;
    private double taxaJuros;

    public ContaPoupanca(int id, int numero, double saldo, int diaAniversario, double taxaJuros) {
        super(id, numero, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaJuros = taxaJuros;
    }
    public double getSaldo(int dia) {
        if (dia >= this.diaAniversario) {
            this.saldo = this.saldo + this.saldo*this.taxaJuros;
            return this.saldo;
        } else {
            return this.saldo;
        }
    }
    @Override
    public boolean sacar(double quantia){
        this.saldo -= quantia;
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "ContaPoupanca{" +
                "diaAniversario=" + diaAniversario +
                ", taxaJuros=" + taxaJuros +
                '}';
    }
}
