package models;
import models.Conta;

public class ContaSalario extends Conta {
    private int quantidadeSaques;

    public ContaSalario(int numero, int agencia, double saldo, int quantidadeSaques) {
        super(numero, agencia, saldo);
        this.quantidadeSaques = quantidadeSaques;
    }
    @Override
    public String toString(){
        return super.toString() + " ContaSalario{" +
                "quantidadeSaques=" + quantidadeSaques +
                '}';
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public boolean sacar(double quantia){
        if (quantia>saldo){
            return false;
        }
        else{
            if (this.quantidadeSaques > 0){
                this.quantidadeSaques --;
                this.saldo -= quantia;
                return true;
            }
            else {
                System.out.println("Limite de saques excedido");
                return false;
            }
        }
    }


}
