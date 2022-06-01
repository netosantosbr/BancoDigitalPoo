package bancoDigital;

//Interface é um contrato que obriga quem implementa a interface a implementar todos os métodos.

public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);
}
