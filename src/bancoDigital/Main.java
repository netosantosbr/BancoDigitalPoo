package bancoDigital;

public class Main {
    public static void main(String[] args) {

        Cliente raphael = new Cliente();
        raphael.setNome("Raphael");

        Conta cc = new ContaCorrente(raphael);
        Conta cp = new ContaPoupanca(raphael);

        cc.depositar(100);
        cp.depositar(100);
        cc.sacar(150);
        cc.printExtrato();
        cp.printExtrato();


    }
}
