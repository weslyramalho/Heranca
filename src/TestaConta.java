public class TestaConta {
    public static void main(String[] args){

        Conta contas[] = new Conta[3];

        ContaCorrente aa = new ContaCorrente(1, 1, "nort", 1, 150);
        ContaPoupanca bb = new ContaPoupanca(02, 1, "nort", 250, 2, 5);
        ContaSalario cc = new ContaSalario(03, 1, "nort", 100, 3);

        contas[0] = aa;
        contas[1] = bb;
        contas[2] = cc;

        System.out.println("Obtendo saldo das contas:");
        for (Conta conta:contas){
            System.out.println(conta);
            System.out.println("Saldo atual: R$ " + conta.getSaldo());
            System.out.println("------------------------------------");
        }
    }

}
