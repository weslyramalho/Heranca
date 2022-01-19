package models;
import models.Conta;

public class ContaSalario extends Conta implements Tributavel{
    private int quantidadeSaques;

    @Override
    public double Imposto(double tax) {
        tax = 0.02 * getSaldo();
        return tax;
    }

    public ContaSalario(int numero, double saldo, Cliente cliente, int quantidadeSaques) {
        super(numero, saldo, cliente);
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
