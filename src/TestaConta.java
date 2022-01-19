
import db.ContasDB;
import models.*;

import java.sql.SQLOutput;
import java.util.*;

public class TestaConta {
    static ContasDB contasDB = new ContasDB();
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String nome = "Joao";
        String nome2 = "Maria";
        Cliente cliente = new Cliente(nome);

       // contasDB.addConta(new ContaPoupanca(3, 500, cliente, 7, 2));
       // contasDB.addConta(new ContaPoupanca(3, 1000, cliente, 7, 2));
        //contasDB.addConta(new ContaPoupanca(3, 1000, cliente, 7, 2));
        contasDB.addConta(new ContaCorrente(3, 1000, cliente, 7));
        contasDB.addConta(new ContaSalario(5,1000, cliente, 2));

        Conta conta = (Conta) contasDB.getContasList();

        double quantia = 0;
        System.out.println("Entre com os dados da conta para tranferencia");
        System.out.println("Digite o numero da conta que deseja Retirar o Valor");
        int numeroa = sc.nextInt();
        System.out.println("Digite o numero da conta que deseja Transferir o valor");
        int numerob = sc.nextInt();
        System.out.println("Digite o valor que deseja Transferir");
        quantia = sc.nextDouble();

        for(Conta contas : contasDB.getContasList()) {
            contas.getNumero().set
            if (quantia <= conta.getSaldo()) {
                conta.sacar(quantia);
                conta.depositar(quantia);
            } else {
                System.out.println("Saldo insuficiente");
            }
        }




        double total= 0;
        for(Iterator<Conta> cont = contasDB.getContasList().iterator();
        cont.hasNext();){
            Conta contaAtual = cont.next();
            total += contaAtual.getSaldo();


            }
        System.out.println(total);





       /* System.out.println("*** BANCO DEV ***");
        System.out.println("Menu de opções:");
        int option;
        do {
            System.out.println("1 - Criar conta");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Criar Cliente");
            System.out.println("5 - Transferir valores");
            System.out.println("6 - Mostrar montantes disponivel nas contas");
            System.out.println("7 - Sair");

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
                        System.out.println("Digite o numero da conta: ");
                        int numero = scanner.nextInt();
                        System.out.println("Digite o nome do cliente: ");
                        String cliente = scanner.next();
                        System.out.println("Digite o Saldo: ");
                        double saldo = scanner.nextDouble();
                        System.out.println("Digite o dia do Aniversario da conta: ");
                        int diaAniversario = scanner.nextInt();
                        System.out.println("Digite a taxa de juros: ");
                        double taxaJuros = scanner.nextDouble();

                        contasDB.add(new ContaPoupanca(numero, saldo, cliente, diaAniversario, taxaJuros));
                        System.out.println("Conta Poupança criada criada com sucesso!");
                        break;
                    case 2: {
                        System.out.println("Digite o numero da conta: ");
                        numero = scanner.nextInt();
                        System.out.println("Digite o numero da Agencia: ");
                        agencia = scanner.nextInt();
                        System.out.println("Digite o Saldo: ");
                        saldo = scanner.nextDouble();
                        System.out.println("Digite o dia do Aniversario da conta: ");
                        int quantidadeSaques = scanner.nextInt();

                        contasDB.addNovaConta(new ContaSalario(numero, agencia, saldo, quantidadeSaques));
                        System.out.println("Conta Salario criada criada com sucesso!");
                        break;
                    }
                    case 3:{
                        System.out.println("Digite o numero da conta: ");
                        numero = scanner.nextInt();
                        System.out.println("Digite o numero da Agencia: ");
                        agencia = scanner.nextInt();
                        System.out.println("Digite o Saldo: ");
                        saldo = scanner.nextDouble();
                        System.out.println("Digite o dia do Aniversario da conta: ");
                        double chequeEspecial = scanner.nextDouble();

                        contasDB.addNovaConta(new ContaCorrente(numero, agencia, saldo, chequeEspecial));
                        System.out.println("Conta Corrente criada criada com sucesso!");
                        break;
                    }
                    default:
                }
                break;
            }
            case 2: {

                System.out.println("Informe o id da conta");
                int id = scanner.nextInt();
                Conta conta = contasDB.getContaList(id);
                System.out.println("Quanto deseja sacar");
                double quantia = scanner.nextDouble();
                conta.sacar(quantia);
                break;
            }
            case 3: {
                break;
            }
            case 4: {
                break;
            }
            case 5: {
                break;
            }
            case 6: {
                break;
            }
                default:
                    throw new IllegalStateException("Unexpected value: " + option);
            }

        **/
        }


    }


