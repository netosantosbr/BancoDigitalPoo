package bancoDigital;


import java.util.ArrayList;
import java.util.List;

//classe abstrata não pode ser instanciada.
public abstract class Conta implements IConta {

    Banco banco = new Banco();
    private static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;

    protected List<Conta> contas = banco.getContas();

    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if (valor > this.saldo) {
            new RuntimeException();
            System.out.println("Operação inválida, saldo insuficiente.");
        }else{
            this.saldo -= valor;
        }


    }

    @Override
    public void depositar(double valor) {
        if (valor < 0) {
            new RuntimeException();
            System.out.println("Operação inválida, saldo insuficiente.");
        }else {
            this.saldo += valor;
        }


    }
    //Não funciona
    @Override
    public void transferir(double valor, int numerodaconta) {
        if (valor > this.saldo) {
//            throw new RuntimeException("tiehetih");
            System.out.println("Operação inválida, saldo insuficiente.");
        }else {
            this.sacar(valor);

            for (Conta conta : contas) {
                if (conta.getNumero() == numerodaconta) {
                    conta.depositar(valor);
                    System.out.printf("Transferência para %s realizada com sucesso", conta.cliente.getNome().toUpperCase());
                }else{
                    System.out.println("Conta inexistente");
                }
            }
        }
    }



    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //ModificacaoNovaDois
    protected void infoComum() {
        System.out.println("Olá! " + this.cliente.getNome());
        System.out.printf("Agência: %d\n", this.agencia);
        System.out.printf("Número: %d\n" , this.numero);
        System.out.printf("Saldo: %.2f\n" , this.saldo);
    }



}
