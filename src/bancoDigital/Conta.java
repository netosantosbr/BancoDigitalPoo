package bancoDigital;

public class Conta {
    public enum Tipo {
        CORRENTE, POUPANCA
    }
    public int agencia;
    public int numero;
    public double saldo;

    public void sacar() {
    }

    public void depositar() {
    }

    public void transferir() {
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
