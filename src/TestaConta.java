import java.util.Scanner;

public class TestaConta {
    public static void main(String[] args){

        System.out.println("*** BANCO DEV ***");
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

        } while (option != 7);


        }
        public static void process(int option) throws Exception {
        switch (option){
            case 1: {
                Scanner scanner =new Scanner(System.in);
                System.out.println("Digite o numero da conta: ");
                int numero = scanner.nextInt();
            }
        }
        }

    }


