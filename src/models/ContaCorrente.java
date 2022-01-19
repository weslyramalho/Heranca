package models;

public class ContaCorrente extends Conta implements Tributavel{
    private double chequeEspecial;

    @Override
    public double Imposto(double tax) {
        tax = 0.03 * saldo;
        return tax;
    }

    @Override
    public String toString() {
        return "ContaCorrente{ numero: "+ getNumero() + ", "+
                  getCliente() +
                ", saldo=" + saldo +
                ", chequeEspecial=" + chequeEspecial +
                '}';
    }

    public ContaCorrente(int numero, double saldo, Cliente cliente, double chequeEspecial) {
        super(numero, saldo, cliente);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public boolean sacar(double quantia){
        double disponivel = this.chequeEspecial + this.saldo;
        if (quantia > disponivel){
            System.out.println("Você não tem limite disponivel para sacar. ");
            return false;
        }
        else {
            this.saldo -= quantia;
            return true;
        }
    }
    public double getSaldo(){
        return this.chequeEspecial + this.saldo - this.Imposto(3);
    }






}
