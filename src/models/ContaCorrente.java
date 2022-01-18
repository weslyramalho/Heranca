package models;

public class ContaCorrente extends Conta{
    private double chequeEspecial;

    public ContaCorrente(int id, int numero, double saldo, double chequeEspecial) {
        super(id, numero,saldo);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "chequeEspecial=" + chequeEspecial +
                '}';
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
        return this.chequeEspecial + this.saldo;
    }






}
