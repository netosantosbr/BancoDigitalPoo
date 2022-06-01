package bancoDigital;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        double valor = 0;
        int numConta = 0;

        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente2);

        cc.depositar(100);

        Banco banco = new Banco();
        banco.setNome("Banco Digital");

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);


       while (opcao != 4) {

           System.out.println("1 - Cadastrar Cliente");
           System.out.println("2 - Listar Contas");
           System.out.println("3 - Login");
           System.out.println("4 - Sair");
           System.out.print("Digite a opção desejada: ");
           opcao = scanner.nextInt();

           switch (opcao) {
               case 1:
                   System.out.println("• Cadastrar Cliente");
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

               case 2:
                   System.out.println("• Listar Contas");
                   for (Conta conta : banco.getContas()) {
                       conta.infoComum();
                       System.out.println();
                   }
                   break;

               case 3:

                     System.out.println("• Login");
                        System.out.print("Digite o número da conta: ");
                        int numeroConta = scanner.nextInt();
                   for (Conta conta : banco.getContas()) {
                       if (conta.getNumero()==numeroConta){
                           int opcao1 = 0;
                           while (opcao1 != 4){
                           conta.infoComum();
                           System.out.print("Escolha uma operação\n" +
                                   "1 - Sacar\n" +
                                   "2 - Depositar\n" +
                                   "3 - Transferir\n" +
                                   "4 - Menu principal\n" +
                                   "Insira o número da opção:");
                               opcao1 = scanner.nextInt();
                           switch (opcao1){
                               case 1:
                                   System.out.println("• Sacar");
                                   System.out.print("Insira o valor que deseja sacar: ");
                                   valor = scanner.nextDouble();
                                   conta.sacar(valor);
                                   System.out.printf("Seu novo saldo é: %.2f", conta.getSaldo());
                                   System.out.println();
                                   break;

                               case 2:
                                   System.out.println("• Depositar");
                                   System.out.print("Insira o valor que deseja depositar: ");
                                   valor = scanner.nextDouble();
                                   conta.depositar(valor);
                                   System.out.printf("Seu novo saldo é: %.2f", conta.getSaldo());
                                   System.out.println();
                                   break;

                               case 3:
                                   System.out.println("• Transferir");
                                   System.out.print("Insira o valor que deseja transferir: ");
                                   valor = scanner.nextDouble();
                                   System.out.print("Insira o número da conta de destino: ");
                                   numConta = scanner.nextInt();
                                   conta.transferir(valor, numConta);
                                   break;

                               case 4:
                                   break;

                               default:
                                   System.out.println("Opção inválida");
                                   break;
                           }
                       }
                   }
               }
               break;
               case 4:
                   System.out.println("Saindo...");
                   break;

               default:
                   System.out.println("Opção inválida");
                   break;
           }
       }


    }
}
