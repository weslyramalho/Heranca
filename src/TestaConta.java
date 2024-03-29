
import db.ClientesDb;
import db.ContasDB;
import models.*;

import java.sql.SQLOutput;
import java.util.*;

public class TestaConta {
    static ContasDB contasDB = new ContasDB();
    static ClientesDb clientesDb = new ClientesDb();

    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("*** BANCO DEV ***");
        System.out.println("Menu de opções:");
        int option;
        do {
            System.out.println("1 - Criar conta");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Transferir valores");
            System.out.println("5 - Mostrar montantes disponivel nas contas");
            System.out.println("6 - Sair");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Escolha uma opção: ");
            option = scanner.nextInt();
            process(option);


        } while (option != 7);


        }
        public static void process(int option) throws Exception {
            Scanner scanner =new Scanner(System.in);

            switch (option){
            case 1: {

                System.out.println("Que tipo de conta voçê deseja criar: ");
                System.out.println("Poupança digite - 1");
                System.out.println("Salario digite - 2");
                System.out.println("Corrente digite - 3");
                int op = scanner.nextInt();
                switch (op) {
                    case 1:
                        contaPoupanca();
                        break;
                    case 2: {
                        contaSalario();
                        break;
                    }
                    case 3:{
                        contaCorrente();
                        break;
                    }
                    default:
                }
                break;
            }
            case 2: {
                sacar();
                break;
            }
            case 3: {
                depositar();
                break;
            }
            case 4: {
                transferencia();
                break;
            }
            case 5: {
                caixa();
                break;
            }
                default:
                    throw new IllegalStateException("Unexpected value: " + option);
            }

        }
        public static void contaPoupanca(){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o numero da conta: ");
            int numero = scanner.nextInt();
            System.out.println("Digite o nome do cliente: ");
            String nome = scanner.next();
            System.out.println("Digite o Saldo: ");
            double saldo = scanner.nextDouble();
            System.out.println("Digite o dia do Aniversario da conta: ");
            int diaAniversario = scanner.nextInt();
            System.out.println("Digite a taxa de juros: ");
            double taxaJuros = scanner.nextDouble();

            clientesDb.addNovoCliente(new Cliente(nome));
            Cliente cliente = (Cliente) clientesDb.getClientePorNome(nome);
            contasDB.addConta(new ContaPoupanca(numero, saldo, cliente, diaAniversario, taxaJuros));
            System.out.println("Conta Poupança criada criada com sucesso!");
        }
    public static void contaSalario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero da conta: ");
        int numero = scanner.nextInt();
        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o Saldo: ");
        double saldo = scanner.nextDouble();
        System.out.println("Digite o dia do Aniversario da conta: ");
        int quantidadeSaques = scanner.nextInt();

        clientesDb.addNovoCliente(new Cliente(nome));
        Cliente cliente = (Cliente) clientesDb.getClientePorNome(nome);
        contasDB.addConta(new ContaSalario(numero, saldo, cliente, quantidadeSaques));
        System.out.println("Conta Salario criada criada com sucesso!");
    }
    public static void contaCorrente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero da conta: ");
        int numero = scanner.nextInt();
        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o Saldo: ");
        double saldo = scanner.nextDouble();
        System.out.println("Cheque especial : ");
        double chequeEspecial = scanner.nextInt();

        clientesDb.addNovoCliente(new Cliente(nome));
        Cliente cliente = (Cliente) clientesDb.getClientePorNome(nome);
        contasDB.addConta(new ContaCorrente(numero, saldo, cliente, chequeEspecial));
        System.out.println("Conta corrente criada criada com sucesso!");
    }
    public static void transferencia(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com os dados da conta para tranferencia");
        System.out.println("Digite o numero da conta que deseja Retirar o Valor");
        int numero = scanner.nextInt();
        System.out.println("Digite o valor que deseja Transferir");
        double quantia = scanner.nextDouble();
        System.out.println("Digite o numero da conta que deseja Transferir o valor");
        int numero2 = scanner.nextInt();
        Conta conta1 = (Conta) contasDB.getContaPorNumero(numero);
        conta1.sacar(quantia);
        Conta conta2 = (Conta) contasDB.getContaPorNumero(numero2);
        conta2.depositar(quantia);
        System.out.println("Trasferencia realizada com sucesso");
        System.out.println(conta2.getSaldo());

    }
    public static void sacar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o numero da conta: ");
        int numero = scanner.nextInt();
        System.out.println("Quanto deseja sacar: ");
        double quantia = scanner.nextDouble();
        Conta conta = (Conta) contasDB.getContaPorNumero(numero);
        conta.sacar(quantia);

    }
    public static void depositar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o numero da conta: ");
        int numero = scanner.nextInt();
        System.out.println("Quanto deseja sacar: ");
        double quantia = scanner.nextDouble();
        Conta conta = (Conta) contasDB.getContaPorNumero(numero);
        conta.depositar(quantia);
    }
    public static void caixa(){
        Scanner sc = new Scanner(System.in);
        double total= 0;
        for(Iterator<Conta> cont = contasDB.getContasList().iterator();
            cont.hasNext();){
            Conta contaAtual = cont.next();
            total += contaAtual.getSaldo();

        }
        System.out.println(total);
    }



    }


