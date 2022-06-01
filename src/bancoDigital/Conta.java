package bancoDigital;

//classe abstrata não pode ser instanciada.
public abstract class Conta implements IConta{
//    public enum Tipo {
//        CORRENTE, POUPANCA
//    }
    public int agencia;
    public int numero;
    public double saldo;

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

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


}
