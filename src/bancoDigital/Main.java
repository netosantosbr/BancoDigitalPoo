package bancoDigital;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        int valor = 0;

        Banco banco = new Banco();
        banco.setNome("Banco Digital");

       while (opcao != 5) {

           System.out.println("1 - Cadastrar Cliente");
           System.out.println("2 - Cadastrar Conta");
           System.out.println("3 - Sacar");
           System.out.println("4 - Depositar");
           System.out.println("5 - Sair");
           System.out.print("Digite a opção desejada: ");
           opcao = scanner.nextInt();

           switch (opcao) {
               case 1:
                   System.out.println("Cadastrar Cliente");
                   Cliente cliente = new Cliente();
                   cliente.cadastrar();
                   System.out.println("Cliente cadastrado com sucesso!");
                   System.out.println("Escolha o tipo de conta: ");
                   System.out.println("1 - Conta Corrente\n2 - Conta Poupança\n3 - As duas");

                     int tipoConta = scanner.nextInt();
                     switch (tipoConta){
                         case 1:
                             Conta contaCorrente = new ContaCorrente (cliente);
                                banco.adicionarConta(contaCorrente);
                                System.out.println("Conta Corrente cadastrada com sucesso!");
                                break;
                         case 2:
                             Conta contaPoupanca = new ContaPoupanca(cliente);
                                banco.adicionarConta(contaPoupanca);
                                System.out.println("Conta Poupança cadastrada com sucesso!");
                                break;

                         case 3:
                                Conta contaCorrente1 = new ContaCorrente(cliente);
                                Conta contaPoupanca1 = new ContaPoupanca(cliente);
                                    banco.adicionarConta(contaCorrente1);
                                    banco.adicionarConta(contaPoupanca1);
                                    System.out.println("Conta Corrente e Conta Poupança cadastradas com sucesso!");
                                    break;
                         default:
                             System.out.println("Opção inválida!");
                                break;
                     }
                   break;

               case 5:
                   System.out.println("Saindo...");
                   for (Conta conta : banco.getContas()) {
                       conta.infoComum();
                   }

                   break;
               default:
                   System.out.println("Opção inválida");
                   break;
           }
       }


    }
}
